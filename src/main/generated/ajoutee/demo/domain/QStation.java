package ajoutee.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QStation is a Querydsl query type for Station
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStation extends EntityPathBase<Station> {

    private static final long serialVersionUID = 1291884492L;

    public static final QStation station = new QStation("station");

    public final StringPath frCode = createString("frCode");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath inoutTag = createString("inoutTag");

    public final StringPath leftTime = createString("leftTime");

    public final StringPath stationNm = createString("stationNm");

    public final StringPath subwayName = createString("subwayName");

    public final StringPath weekTag = createString("weekTag");

    public QStation(String variable) {
        super(Station.class, forVariable(variable));
    }

    public QStation(Path<? extends Station> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStation(PathMetadata metadata) {
        super(Station.class, metadata);
    }

}

