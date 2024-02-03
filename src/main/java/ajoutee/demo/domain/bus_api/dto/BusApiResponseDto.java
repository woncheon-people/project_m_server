package ajoutee.demo.domain.bus_api.dto;

import ajoutee.demo.domain.bus_api.vo.ComMsgHeader;
import ajoutee.demo.domain.bus_api.vo.MsgBody;
import ajoutee.demo.domain.bus_api.vo.MsgHeader;
import lombok.*;

import java.io.Serializable;

@Getter @Setter
@NoArgsConstructor
/**
 * stationNm : 정류장명
 * busRouteNm : 노선명
 * firstBusTm : 금일 첫차 시간
 * lastBusTm : 금일 막차 시간
 */
public class BusApiResponseDto implements Serializable {
    private ComMsgHeader comMsgHeader;
    private MsgHeader msgHeader;
    private MsgBody msgBody;
}
