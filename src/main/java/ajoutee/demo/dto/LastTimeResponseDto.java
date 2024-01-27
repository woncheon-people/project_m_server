package ajoutee.demo.dto;

import ajoutee.demo.domain.LastTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LastTimeResponseDto {

    private int time1;

    static public LastTimeResponseDto of(LastTime lastTime){
        LastTimeResponseDto lastTimeResponseDto = new LastTimeResponseDto();
        lastTimeResponseDto.setTime1(lastTime.getTime1());

        return lastTimeResponseDto;
    }
}
