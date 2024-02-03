package kr.ajoutee.igottago.dto;

import kr.ajoutee.igottago.domain.MessageRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageRequestDTO {
    private String title;
    private String body;
    private String targetToken;

    public MessageRequest toEntity(){
        return MessageRequest.builder()
                .title(title)
                .body(body)
                .targetToken(targetToken)
                .build();
    }
}
