package com.wjw.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanDefinition {
    private List<Attribute> attributes;

    private Map<String,Attribute> attributesMap;



    public BeanDefinition(){
        attributes = new ArrayList<Attribute>();
        attributesMap = new HashMap();
    }


    public BeanDefinition(List<Attribute> attributes, Map<String, Attribute> attributesMap) {
        this.attributes = attributes;
        this.attributesMap = attributesMap;
    }


}
