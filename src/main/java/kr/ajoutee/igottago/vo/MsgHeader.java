package kr.ajoutee.igottago.vo;

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
