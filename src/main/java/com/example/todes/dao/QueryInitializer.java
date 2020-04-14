package com.example.todes.dao;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
public interface QueryInitializer {


    /**
     * there are place to make insert and delete method
     *
     * @param searchParam with column and value
     * @return result
     */
    public Object select(HashMap<String, String> searchParam);


}
