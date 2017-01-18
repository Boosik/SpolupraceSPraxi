package me.vranek.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QCompany is a Querydsl query type for QCompany
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QCompany extends com.querydsl.sql.RelationalPathBase<QCompany> {

    private static final long serialVersionUID = 1088775245;

    public static final QCompany company = new QCompany("COMPANY");

    public final StringPath address = createString("address");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final StringPath salary = createString("salary");

    public final com.querydsl.sql.PrimaryKey<QCompany> companyPk = createPrimaryKey(id);

    public QCompany(String variable) {
        super(QCompany.class, forVariable(variable), "null", "COMPANY");
        addMetadata();
    }

    public QCompany(String variable, String schema, String table) {
        super(QCompany.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QCompany(String variable, String schema) {
        super(QCompany.class, forVariable(variable), schema, "COMPANY");
        addMetadata();
    }

    public QCompany(Path<? extends QCompany> path) {
        super(path.getType(), path.getMetadata(), "null", "COMPANY");
        addMetadata();
    }

    public QCompany(PathMetadata metadata) {
        super(QCompany.class, metadata, "null", "COMPANY");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(address, ColumnMetadata.named("ADDRESS").withIndex(3).ofType(Types.VARCHAR).withSize(2000000000).withDigits(10));
        addMetadata(age, ColumnMetadata.named("AGE").withIndex(2).ofType(Types.INTEGER).withSize(2000000000).withDigits(10).notNull());
        addMetadata(id, ColumnMetadata.named("ID").withIndex(0).ofType(Types.INTEGER).withSize(2000000000).withDigits(10).notNull());
        addMetadata(name, ColumnMetadata.named("NAME").withIndex(1).ofType(Types.VARCHAR).withSize(2000000000).withDigits(10).notNull());
        addMetadata(salary, ColumnMetadata.named("SALARY").withIndex(4).ofType(Types.VARCHAR).withSize(2000000000).withDigits(10));
    }

}

