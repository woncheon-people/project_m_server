package ajoutee.demo.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMessageRequest is a Querydsl query type for MessageRequest
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMessageRequest extends EntityPathBase<MessageRequest> {

    private static final long serialVersionUID = 365826800L;

    public static final QMessageRequest messageRequest = new QMessageRequest("messageRequest");

    public final StringPath body = createString("body");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath targetToken = createString("targetToken");

    public final StringPath title = createString("title");

    public QMessageRequest(String variable) {
        super(MessageRequest.class, forVariable(variable));
    }

    public QMessageRequest(Path<? extends MessageRequest> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMessageRequest(PathMetadata metadata) {
        super(MessageRequest.class, metadata);
    }

}

