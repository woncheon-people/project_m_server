package ajoutee.demo.config;

import ajoutee.demo.domain.LastTime;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class JpaConfig {

    @PersistenceContext
    private EntityManager em;

    @Bean
    JPAQueryFactory jpaQueryFactory(){

        return new JPAQueryFactory(em);
    }


}
