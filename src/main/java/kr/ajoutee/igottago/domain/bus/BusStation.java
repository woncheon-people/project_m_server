package kr.ajoutee.igottago.domain.bus;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Entity
@Builder
@Getter
@ToString
/**
 * arsId    (sample : 01001)
 * nodeId    (sample : 100000001)
 * stationName : 정류소명    (sample : 종로2가사거리)
 * posX : x좌표    (sample : 126.987752)
 * posY : y좌표    (sample : 37.569808)
 */
public class BusStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ars_id")
    private Long arsId;
    @Column(name = "node_id")
    private Long nodeId;

    @Column(name = "station_name")
    private String stationName;

    @Column(name = "pos_x")
    private Double posX;
    @Column(name = "pos_y")
    private Double posY;


    // 일대다 관계
    @OneToMany(mappedBy = "station")
    private List<BusInfo> busInfoList;
}
