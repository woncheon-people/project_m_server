package kr.ajoutee.igottago.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter @Setter
@ToString
public class ItemList {
    private String arsId;
    private String busRouteAbrv;
    private String stationNm;
    private String busRouteId;
    private String busRouteNm;
    private String firstBusTm;
    private String lastBusTm;
}
