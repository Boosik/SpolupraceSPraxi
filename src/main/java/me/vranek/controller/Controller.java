package me.vranek.controller;

import org.sqlite.SQLiteDataSource;

import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLiteTemplates;
import me.vranek.domain.QMappings;

public class Controller {

    public void test() {
        SQLiteDataSource dataSource = new SQLiteDataSource();
        dataSource.setUrl("jdbc:sqlite:sample.db");
        SQLQueryFactory queryFactory = new SQLQueryFactory(new Configuration(SQLiteTemplates.DEFAULT), dataSource);
        System.out.println(queryFactory.select(QMappings.mappings.uuid).from(QMappings.mappings).fetch());
    }

}
