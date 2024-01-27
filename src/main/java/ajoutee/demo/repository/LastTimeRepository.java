package ajoutee.demo.repository;

import ajoutee.demo.domain.QLastTime;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class LastTimeRepository {

    private final JPAQueryFactory queryFactory;

    QLastTime m = new QLastTime("m");
    public List<Integer> searchLastTime(String station){
        List<Integer> lastTimes = queryFactory
                .select(m.time1)
                .from(m)
                .where(m.station.eq(station))
                .fetch();

        return lastTimes;
    }


}
