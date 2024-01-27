package ajoutee.demo.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String frCode;
    private String weekTag;
    private String inoutTag;
    private String stationNm;
    private String subwayName;
    private String leftTime;

    @Builder
    public Station(long id, String weekTag, String stationNm, String inoutTag, String frCode, String subwayName, String leftTime){
        this.id = id;
        this.weekTag = weekTag;
        this.stationNm = stationNm;
        this.inoutTag = inoutTag;
        this.frCode = frCode;
        this.subwayName = subwayName;
        this.leftTime = leftTime;
    }
}
