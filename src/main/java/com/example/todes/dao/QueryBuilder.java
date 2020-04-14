package com.example.todes.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
@Scope("prototype")
public class QueryBuilder {

    HashMap<String, String> queryMap = new HashMap<>();

    @Autowired
    private QuerySQLInitializer queryInitializer;

    @Component
    @Scope("prototype")
    public class Builder{

        @Autowired
        private QueryBuilder newQueryBuilder;

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
        public List find(){
           return newQueryBuilder.queryInitializer.select(newQueryBuilder.queryMap);
        }
//TODO EM почему-то пустой
    }
}
