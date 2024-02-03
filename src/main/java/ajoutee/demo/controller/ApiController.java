package ajoutee.demo.controller;

import ajoutee.demo.domain.bus_api.dto.BusApiRequestDto;
import ajoutee.demo.domain.bus_api.dto.BusApiResponseDto;
import ajoutee.demo.domain.bus_api.vo.ItemList;
import ajoutee.demo.service.bus_api.BusApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
public class ApiController {

    private final BusApiService busApiService;

    @Autowired
    public ApiController(BusApiService busApiService) {
        this.busApiService = busApiService;
    }


    @GetMapping("/bus-request")
    @ResponseBody
    public String requestApi(@RequestParam String arsId, @RequestParam String busRouteId) {
        ItemList response = busApiService.request(arsId, busRouteId);

        if (response == null)
            return "조회하신 정류장의 데이터가 Open API 서비스 내에 존재하지 않습니다.";

        String[] s = response.getLastBusTm().split(":");
        return "입력하신 정류장 \"" + response.getStationNm() + "\"에서의 \"" + response.getBusRouteAbrv()+ "\" 노선의 막차 시간은 \"" + s[0] +"시 " + s[1] + "분\"입니다.";
    }
}
