package kr.ajoutee.igottago.dto;

import kr.ajoutee.igottago.vo.ComMsgHeader;
import kr.ajoutee.igottago.vo.MsgBody;
import kr.ajoutee.igottago.vo.MsgHeader;
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
