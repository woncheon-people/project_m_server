package ajoutee.demo.controller;

import ajoutee.demo.dto.StationRequestDto;
import ajoutee.demo.repository.StationRepository;
import ajoutee.demo.service.JsonParsingService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ApiController {

    @Autowired
    private JsonParsingService2 jsonParsingService2;

    @PostMapping("/api")
    public String load_save(@RequestBody StationRequestDto stationRequestDto) throws IOException {
        //StationRequestDto ret = StationRequestDto.of(stationRequestDto);
        String res = jsonParsingService2.parseJSON2(stationRequestDto.getFrCode(), stationRequestDto.getInoutTag(), stationRequestDto.getWeekTag());

//        try {


//            HttpHeaders headers = new HttpHeaders();
//            headers.add("Accept", MediaType.APPLICATION_JSON_VALUE);
//            headers.add("Content-Type", MediaType.APPLICATION_FORM_URLENCODED_VALUE + ";charset=UTF-8");

//              URI url = URI.create("http://swopenAPI.seoul.go.kr/api/subway/46776e4f4b7979623831524d4b4c58/json/realtimeStationArrival/0/5/" + stationRequestDto.getStatnNm());
//              RequestEntity<Void> req = RequestEntity
//                    .get(url)
//                    .header("appKey", "46776e4f4b7979623831524d4b4c58")
//                    .build();
            //ResponseEntity<String> res = restTemplate.exchange(req, String.class);

            //URL url = new URL("http://swopenAPI.seoul.go.kr/api/subway/46776e4f4b7979623831524d4b4c58/xml/realtimeStationArrival/0/5/" + stationRequestDto.getStatnNm());

//            RequestEntity<String> req = new RequestEntity<>(headers, HttpMethod.GET, url);
//
//            ResponseEntity<String> res = restTemplate.exchange(req, String.class);
//            BufferedReader bf;
//            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//            result = bf.readLine();

//            StringBuilder urlBuilder = new StringBuilder("http://swopenAPI.seoul.go.kr"); /*URL*/
//            urlBuilder.append("/" +  URLEncoder.encode("api","UTF-8"));
//            urlBuilder.append("/" +  URLEncoder.encode("subway","UTF-8"));
//            urlBuilder.append("/" +  URLEncoder.encode("46776e4f4b7979623831524d4b4c58","UTF-8")); /*인증키 (sample사용시에는 호출시 제한됩니다.)*/
//            urlBuilder.append("/" +  URLEncoder.encode("json","UTF-8") ); /*요청파일타입 (xml,xmlf,xls,json) */
//            urlBuilder.append("/" + URLEncoder.encode("realtimeStationArrival","UTF-8")); /*서비스명 (대소문자 구분 필수입니다.)*/
//            urlBuilder.append("/" + URLEncoder.encode("1","UTF-8")); /*요청시작위치 (sample인증키 사용시 5이내 숫자)*/
//            urlBuilder.append("/" + URLEncoder.encode("5","UTF-8")); /*요청종료위치(sample인증키 사용시 5이상 숫자 선택 안 됨)*/
//
//            urlBuilder.append("/" + URLEncoder.encode(statnNm,"UTF-8")); /* 서비스별 추가 요청인자들*/
//
//            //System.setProperty("http.agent", "Chrome");
//
//            URL url = new URL(urlBuilder.toString());
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("POST");
//            conn.setRequestProperty("Content-type", "application/json");
//            System.out.println("Response code: " + conn.getResponseCode()); /* 연결 자체에 대한 확인이 필요하므로 추가합니다.*/
//            BufferedReader bf;
//            bf = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
//            result = bf.readLine();

            // 서비스코드가 정상이면 200~300사이의 숫자가 나옵니다.
//            if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
//                bf = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            } else {
//                bf = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
//            }

//            JSONParser jsonParser = new JSONParser();
//            JSONObject jsonObject = (JSONObject)jsonParser.parse(result);
//            JSONObject realtimeStationArrival = (JSONObject)jsonObject.get("realtimeStationArrival");
//
//            //JSONObject subResult = (JSONObject)realtimeStationArrival.get("RESULT");
//            JSONArray infoArr = (JSONArray) realtimeStationArrival.get("row");
//
//            for(int i=0;i<infoArr.size();i++){
//                JSONObject tmp = (JSONObject)infoArr.get(i);
//                infoObj=new Station(i+(long)1, (String)tmp.get("statnNm"),(String)tmp.get("barvlDt"));
//                stationRepository.save(infoObj);
//            }
//            stationRepository.save(station);
//            stationResponseDto = StationResponseDto.of(infoObj);
//
//            bf.close();
//            conn.disconnect();
//
//        }catch(Exception e) {
//            e.printStackTrace();
//        }

        return res;
    }



}
