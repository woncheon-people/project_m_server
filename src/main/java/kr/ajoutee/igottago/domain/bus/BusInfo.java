package kr.ajoutee.igottago.domain.bus;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Entity
@Builder
@Getter
@ToString
/**
 * id
 * route
 * station
 * order : 순번    (sample : 65)
 */
public class BusInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "info_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "route_id")  // 참조 엔티티의 primary key를 지정
    private BusRoute route;

    // 다대일 관계
    @ManyToOne
    @JoinColumn(name = "ars_id")
    private BusStation station;

    @Column(name = "bus_turn", columnDefinition = "INT")  // DDL(Data Definition Language) 단계에서 컬럼 타입 임의 지정 가능
    private int busTurn;
}
