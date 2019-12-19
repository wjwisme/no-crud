package com.wjw.generator;

import com.wjw.model.BeanDefinition;

public abstract class AbstractGenerator implements Generator {


    public abstract byte[] generator(BeanDefinition beanDefinition);
}
