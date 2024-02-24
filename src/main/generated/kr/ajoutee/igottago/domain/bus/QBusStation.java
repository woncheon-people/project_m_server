package kr.ajoutee.igottago.domain.bus;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusStation is a Querydsl query type for BusStation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBusStation extends EntityPathBase<BusStation> {

    private static final long serialVersionUID = 2098276742L;

    public static final QBusStation busStation = new QBusStation("busStation");

    public final NumberPath<Long> arsId = createNumber("arsId", Long.class);

    public final ListPath<BusInfo, QBusInfo> busInfoList = this.<BusInfo, QBusInfo>createList("busInfoList", BusInfo.class, QBusInfo.class, PathInits.DIRECT2);

    public final NumberPath<Long> nodeId = createNumber("nodeId", Long.class);

    public final NumberPath<Double> posX = createNumber("posX", Double.class);

    public final NumberPath<Double> posY = createNumber("posY", Double.class);

    public final StringPath stationName = createString("stationName");

    public QBusStation(String variable) {
        super(BusStation.class, forVariable(variable));
    }

    public QBusStation(Path<? extends BusStation> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBusStation(PathMetadata metadata) {
        super(BusStation.class, metadata);
    }

}

