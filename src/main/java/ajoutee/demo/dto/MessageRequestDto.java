package ajoutee.demo.dto;

import ajoutee.demo.domain.MessageRequest;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MessageRequestDto {
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
