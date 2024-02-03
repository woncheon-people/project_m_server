package kr.ajoutee.igottago.repository;

import kr.ajoutee.igottago.domain.MessageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TokenRepository extends JpaRepository<MessageRequest,Long> {
    Optional<MessageRequest> findById(Long id);
}
