package ajoutee.demo.service.bus_api;


import ajoutee.demo.domain.bus_api.dto.BusApiResponseDto;
import ajoutee.demo.domain.bus_api.vo.ItemList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Service
public class BusApiService {

    private final String secretKey;

    private final String serviceUrl = "http://ws.bus.go.kr/api/rest/stationinfo/getBustimeByStation";

    // public BusApiService() {}

    public BusApiService(@Value("${secret-key.bus}") String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * @param arsId      : 정류소 고유번호
     * @param busRouteId : 노선ID
     * @return
     */
    public ItemList request(String arsId, String busRouteId) throws IllegalArgumentException {

        String url = UriComponentsBuilder.fromUriString(serviceUrl)
                .queryParam("serviceKey", secretKey)
                .queryParam("arsId", arsId)
                .queryParam("busRouteId", busRouteId)
                .build().toUriString();
        System.out.println(url);

//        RestTemplate restTemplate = new RestTemplate();
//        RestTemplate restTemplate = new RestTemplateBuilder()
//                                        .defaultHeader("Accept", "application/xml")
//                                        .build();
//
//
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("Accept", "application/xml");
//
//        List<MediaType> acceptMediaType = new ArrayList<>();
//        acceptMediaType.add(MediaType.APPLICATION_XML);
//        httpHeaders.setAccept(acceptMediaType);
//
//
//        HttpEntity httpEntity = new HttpEntity(httpHeaders);
//        System.out.println(httpEntity.getHeaders());
//
//
//
//        // ResponseEntity<BusApiResponseDto> result = restTemplate.exchange(url, HttpMethod.GET, httpEntity, BusApiResponseDto.class);
//        ResponseEntity<BusApiResponseDto> result = restTemplate.getForEntity(url, BusApiResponseDto.class);

        /// Request
        String body = "";
        BufferedReader r = null;
        try {
            HttpURLConnection urlConnection = (HttpURLConnection)(new URL(url).openConnection());
            urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Accept", "application/xml");
            urlConnection.setConnectTimeout(10000);
            int responseCode = urlConnection.getResponseCode();
            // System.out.println(responseCode);
            r = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = r.readLine()) != null) {
                sb.append(line);
            }
            body = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
             if (r != null) {
                 try {
                     r.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
        }
        // System.out.println(body);

        /// Parsing
        ObjectMapper objectMapper = new XmlMapper();

        BusApiResponseDto result = null;
        try {
            result = objectMapper.readValue(body, BusApiResponseDto.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result.getMsgBody().getItemList());

        return result.getMsgBody().getItemList();
    }
}
