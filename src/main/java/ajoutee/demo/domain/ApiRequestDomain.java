package ajoutee.demo.domain;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
/**
 *
 * @param arsId : 정류소 고유번호
 * @param busRouteId : 노선ID
 */
public class ApiRequestDomain {
    private String arsId;
    private String busRouteId;
}
