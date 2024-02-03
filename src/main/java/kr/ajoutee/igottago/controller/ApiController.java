package kr.ajoutee.igottago.controller;

import kr.ajoutee.igottago.vo.ItemList;
import kr.ajoutee.igottago.domain.BusApiService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final BusApiService busApiService;

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
