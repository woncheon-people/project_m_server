package kr.ajoutee.igottago.domain.bus;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
// @Builder
@Getter
@NoArgsConstructor
@ToString
/**
 * routeId    (sample : 100100073)
 * routeName : 노선명    (sample : 470)
 */
public class BusRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "route_id")
    private Long routeId;

    // @OneToOne(mappedBy = "route")
    // @Column(name = "route_name")
    // @PrimaryKeyJoinColumn(name = "route_name", referencedColumnName = "route")
    private String routeName;
}
