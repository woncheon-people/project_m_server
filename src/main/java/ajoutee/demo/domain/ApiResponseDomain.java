package ajoutee.demo.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
/**
 * stationNm : 정류장명
 * busRouteNm : 노선명
 * firstBusTm : 금일 첫차 시간
 * lastBusTm : 금일 막차 시간
 */
public class ApiResponseDomain {
    private String stationNm;
    private String busRouteNm;
    private String firstBusTm;
    private String lastBusTm;
}
