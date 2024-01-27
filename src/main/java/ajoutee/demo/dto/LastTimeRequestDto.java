package ajoutee.demo.dto;


import ajoutee.demo.domain.LastTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class LastTimeRequestDto {

    private String station;

    static public LastTimeRequestDto of(LastTime lastTime){
        LastTimeRequestDto lastTimeRequestDto = new LastTimeRequestDto();
        lastTimeRequestDto.setStation(lastTime.getStation());

        return lastTimeRequestDto;
    }
    public LastTime toEntity(){
        return LastTime.builder()
                .station(station)
                .build();
    }
}
