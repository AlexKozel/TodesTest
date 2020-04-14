package com.example.todes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public class QueryBuilder {

    HashMap<String, String> queryMap = new HashMap<>();

    @Autowired
    private QuerySQLInitializer queryInitializer;

    @Component
    public class Builder{

        @Autowired
        private QueryBuilder newQueryBuilder;

//        Builder(){
//            newQueryBuilder = new QueryBuilder();
//            newQueryBuilder.queryInitializer = new QuerySQLInitializer();
//        }

        public Builder with(String column, String value){
            newQueryBuilder.queryMap.put(column, value);
            return this;
        }

        /**
         * can be delete or insert
         *
         * used implementation of sql-query generator
         * @return result from  query executor
         */
        public Object find(){
           return newQueryBuilder.queryInitializer.select(newQueryBuilder.queryMap);
        }
//TODO EM почему-то пустой
    }
}
