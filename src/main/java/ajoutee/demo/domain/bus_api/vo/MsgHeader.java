package ajoutee.demo.domain.bus_api.vo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter @Setter
public class MsgHeader {
    private int headerCd;
    private String headerMsg;
    private int itemCount;
}
