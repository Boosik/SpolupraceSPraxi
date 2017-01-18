package me.vranek.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QMappings is a Querydsl query type for QMappings
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QMappings extends com.querydsl.sql.RelationalPathBase<QMappings> {

    private static final long serialVersionUID = 186504085;

    public static final QMappings mappings = new QMappings("mappings");

    public final StringPath cbid = createString("cbid");

    public final StringPath uuid = createString("uuid");

    public final com.querydsl.sql.PrimaryKey<QMappings> mappingsPK = createPrimaryKey(uuid);

    public QMappings(String variable) {
        super(QMappings.class, forVariable(variable), "null", "mappings");
        addMetadata();
    }

    public QMappings(String variable, String schema, String table) {
        super(QMappings.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QMappings(String variable, String schema) {
        super(QMappings.class, forVariable(variable), schema, "mappings");
        addMetadata();
    }

    public QMappings(Path<? extends QMappings> path) {
        super(path.getType(), path.getMetadata(), "null", "mappings");
        addMetadata();
    }

    public QMappings(PathMetadata metadata) {
        super(QMappings.class, metadata, "null", "mappings");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(cbid, ColumnMetadata.named("CBID").withIndex(1).ofType(Types.VARCHAR).withSize(2000000000).withDigits(10));
        addMetadata(uuid, ColumnMetadata.named("UUID").withIndex(0).ofType(Types.VARCHAR).withSize(2000000000).withDigits(10));
    }

}

