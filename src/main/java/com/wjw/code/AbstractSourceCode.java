package com.wjw.code;

import com.wjw.main.GeneratorType;
import com.wjw.model.BeanDefinition;

public  abstract  class AbstractSourceCode {

    public  abstract  String getSourceCode(BeanDefinition beanDefinition, GeneratorType generatorType);
}
