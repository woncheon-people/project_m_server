package kr.ajoutee.igottago.domain.bus;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QBusRoute is a Querydsl query type for BusRoute
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBusRoute extends EntityPathBase<BusRoute> {

    private static final long serialVersionUID = 2115094299L;

    public static final QBusRoute busRoute = new QBusRoute("busRoute");

    public final NumberPath<Long> routeId = createNumber("routeId", Long.class);

    public final StringPath routeName = createString("routeName");

    public QBusRoute(String variable) {
        super(BusRoute.class, forVariable(variable));
    }

    public QBusRoute(Path<? extends BusRoute> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBusRoute(PathMetadata metadata) {
        super(BusRoute.class, metadata);
    }

}

