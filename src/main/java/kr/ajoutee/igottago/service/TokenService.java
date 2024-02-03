package kr.ajoutee.igottago.service;

import kr.ajoutee.igottago.domain.MessageRequest;
import kr.ajoutee.igottago.repository.TokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class TokenService {

    private final TokenRepository tokenRepository;

    @Transactional
    public Long add(MessageRequest request){
        tokenRepository.save(request);
        return request.getId();
    }
}
