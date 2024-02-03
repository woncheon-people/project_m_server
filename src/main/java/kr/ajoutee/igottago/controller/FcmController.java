package kr.ajoutee.igottago.controller;

import kr.ajoutee.igottago.service.FcmService;
import kr.ajoutee.igottago.service.TokenService;
import kr.ajoutee.igottago.domain.MessageRequest;
import kr.ajoutee.igottago.dto.MessageRequestDTO;
import com.google.firebase.messaging.FirebaseMessagingException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@Slf4j
public class FcmController {

    private final FcmService fcmService;
    private final TokenService tokenService;

    // fcm를 보낸다 ( topic )
    @PostMapping("/message/fcm/topic")
    public ResponseEntity sendMessageTopic(@RequestBody MessageRequestDTO requestDTO) throws IOException, FirebaseMessagingException {
        fcmService.sendMessageByTopic(requestDTO.getTitle(), requestDTO.getBody());
        return ResponseEntity.ok().build();
    }

    // fcm를 보낸다 ( token )
    @PostMapping("/message/fcm/token")
    public ResponseEntity<MessageRequestDTO> sendMessageToken(@RequestBody MessageRequestDTO requestDTO) throws IOException, FirebaseMessagingException {
        MessageRequest request = requestDTO.toEntity();
        tokenService.add(request);
        fcmService.sendMessageByToken(requestDTO.getTitle(), requestDTO.getBody(), requestDTO.getTargetToken());
        return ResponseEntity.ok().build();
    }
}
