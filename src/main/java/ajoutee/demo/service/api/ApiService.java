package ajoutee.demo.service.api;


import ajoutee.demo.domain.ApiResponseDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ApiService {

    private final String serviceUrl = "http://ws.bus.go.kr/api/rest/stationinfo/getBustimeByStation";

    private final RestTemplate restTemplate;

    @Autowired
    public ApiService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    /**
     *
     * @param arsId : 정류소 고유번호
     * @param busRouteId : 노선ID
     * @return
     */
    public ApiResponseDomain request(String arsId, String busRouteId) {
        String url = UriComponentsBuilder.fromUriString(serviceUrl)
                .queryParam("serviceKey", "LptPwU%2BeOglSoKJ6cOGTry0zs4NMSpnGFCLKNYusbmV7QbNNrFEfunRev8%2B2%2BGM2CiqNOp24cYhFpNusF1dg8A%3D%3D")  // 제 인증키입니다
                .queryParam("arsId", arsId)
                .queryParam("busRouteId", busRouteId)
                .build().toUriString();

        return restTemplate.getForObject(url, ApiResponseDomain.class);
    }
}
