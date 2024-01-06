package ajoutee.demo.controller;

import ajoutee.demo.domain.ApiRequestDomain;
import ajoutee.demo.domain.ApiResponseDomain;
import ajoutee.demo.service.api.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ApiController {

    private final ApiService apiService;

    @Autowired
    public ApiController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/request")
    public void requestApi(@RequestBody ApiRequestDomain inputVal) {
        ApiResponseDomain response = apiService.request(inputVal.getArsId(), inputVal.getBusRouteId());

        // return 방식 미정
    }
}
