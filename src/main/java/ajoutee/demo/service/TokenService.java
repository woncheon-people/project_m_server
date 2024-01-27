package ajoutee.demo.service;

import ajoutee.demo.domain.MessageRequest;
import ajoutee.demo.repository.TokenRepository;
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
