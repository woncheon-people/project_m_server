package ajoutee.demo.dto;

import ajoutee.demo.domain.Station;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StationResponseDto {

    private String STATION_NM;
    private String SUBWAYNAME;
    private String LEFTTIME;

    static public StationResponseDto of(Station station){
        StationResponseDto stationResponseDto = new StationResponseDto();
        stationResponseDto.setSUBWAYNAME(station.getSubwayName());
        stationResponseDto.setSTATION_NM(station.getStationNm());
        stationResponseDto.setLEFTTIME(station.getLeftTime());
        return stationResponseDto;
    }

}
