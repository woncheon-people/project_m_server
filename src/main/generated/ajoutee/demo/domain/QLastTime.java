package ajoutee.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QLastTime is a Querydsl query type for LastTime
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLastTime extends EntityPathBase<LastTime> {

    private static final long serialVersionUID = -1384031509L;

    public static final QLastTime lastTime = new QLastTime("lastTime");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath station = createString("station");

    public final NumberPath<Integer> time1 = createNumber("time1", Integer.class);

    public QLastTime(String variable) {
        super(LastTime.class, forVariable(variable));
    }

    public QLastTime(Path<? extends LastTime> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLastTime(PathMetadata metadata) {
        super(LastTime.class, metadata);
    }

}

