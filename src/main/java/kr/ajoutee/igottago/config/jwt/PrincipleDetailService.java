package kr.ajoutee.igottago.config.jwt;

import kr.ajoutee.igottago.config.authentication.dtos.SessionUser;
import kr.ajoutee.igottago.domain.User;
import kr.ajoutee.igottago.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class PrincipleDetailService implements UserDetailsService {

    private final UserRepository repository;


    public PrincipleDetailService(UserRepository repository) {
        this.repository = repository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User principle = repository.findByEmail(username)
                .orElseThrow(() -> {
            return new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다.");
        });
        return new SessionUser(principle);
    }
}
