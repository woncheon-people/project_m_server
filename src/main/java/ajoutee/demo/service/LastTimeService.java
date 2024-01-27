package ajoutee.demo.service;

import ajoutee.demo.repository.LastTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class LastTimeService {

    public static int ltEnum1;


    private final LastTimeRepository lastTimeRepository;

    public int timeSearch(String station) {
        List<Integer> lastTimes = lastTimeRepository.searchLastTime(station);
        ltEnum1 = lastTimes.get(0);

        return ltEnum1;
    }
}
