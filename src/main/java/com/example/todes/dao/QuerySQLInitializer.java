package com.example.todes.dao;

import com.example.todes.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Component
public class QuerySQLInitializer implements QueryInitializer {

    @Autowired
    EntityManager em;

    @Override
    public Object select(HashMap<String, String> searchParam) {
        StringBuffer query =  new StringBuffer("SELECT * FROM employee ");

         // get all keys, and ForEach key get values
        if (searchParam.isEmpty()) {
            return null;
        } else {
            query.append(" WHERE ");

            Iterator<Map.Entry<String, String>> itr = searchParam.entrySet().iterator();
            while (itr.hasNext()){
                Map.Entry entry = itr.next();
                query.append(entry.getKey()).append(" Like ").append("'").append(entry.getValue()).append("'");
                if(itr.hasNext()){
                    query.append(" AND ");
                }
            }
            Object result;
            try {
                result = em.createNativeQuery(String.valueOf(query), Employee.class).getSingleResult();
            } catch (NoResultException e) {
                System.out.println(e);
                return null;
            }
            return result;
        }
    }
}
