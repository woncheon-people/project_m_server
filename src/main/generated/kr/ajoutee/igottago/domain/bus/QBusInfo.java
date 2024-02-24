package kr.ajoutee.igottago.domain.bus;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBusInfo is a Querydsl query type for BusInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBusInfo extends EntityPathBase<BusInfo> {

    private static final long serialVersionUID = 1037790620L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBusInfo busInfo = new QBusInfo("busInfo");

    public final NumberPath<Integer> busTurn = createNumber("busTurn", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QBusRoute route;

    public final QBusStation station;

    public QBusInfo(String variable) {
        this(BusInfo.class, forVariable(variable), INITS);
    }

    public QBusInfo(Path<? extends BusInfo> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBusInfo(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBusInfo(PathMetadata metadata, PathInits inits) {
        this(BusInfo.class, metadata, inits);
    }

    public QBusInfo(Class<? extends BusInfo> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.route = inits.isInitialized("route") ? new QBusRoute(forProperty("route")) : null;
        this.station = inits.isInitialized("station") ? new QBusStation(forProperty("station")) : null;
    }

}

