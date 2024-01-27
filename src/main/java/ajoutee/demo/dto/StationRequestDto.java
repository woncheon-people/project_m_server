package ajoutee.demo.dto;

import ajoutee.demo.domain.LastTime;
import ajoutee.demo.domain.Station;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationRequestDto {

    private String frCode;
    private String weekTag;
    private String inoutTag;

    public Station toEntity(){
        return Station.builder()
                .frCode(frCode)
                .weekTag(weekTag)
                .inoutTag(inoutTag)
                .build();
    }

    static public StationRequestDto of(StationRequestDto station){
        StationRequestDto stationRequestDto = new StationRequestDto();
        stationRequestDto.setFrCode(station.getFrCode());
        stationRequestDto.setWeekTag(station.getWeekTag());
        stationRequestDto.setInoutTag(station.getInoutTag());
        return stationRequestDto;
    }

}
