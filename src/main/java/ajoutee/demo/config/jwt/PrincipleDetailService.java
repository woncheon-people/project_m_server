package ajoutee.demo.config.jwt;

import ajoutee.demo.config.authentication.dtos.SessionUser;
import ajoutee.demo.domain.Users;
import ajoutee.demo.repository.UserRepository;
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
        Users principle = repository.findByEmail(username)
                .orElseThrow(() -> {
            return new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다.");
        });
        return new SessionUser(principle);
    }
}
