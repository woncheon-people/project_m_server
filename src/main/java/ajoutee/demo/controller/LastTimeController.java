package ajoutee.demo.controller;

import ajoutee.demo.service.LastTimeService;
import ajoutee.demo.dto.LastTimeRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
public class LastTimeController {

    private final LastTimeService lastTimeService;

    @GetMapping("/lastTime")
    public int searchLastTime(@RequestBody LastTimeRequestDto lastTimeRequestDto) throws IOException {
        int ret = lastTimeService.timeSearch(lastTimeRequestDto.getStation());

        return ret;
    }
}
