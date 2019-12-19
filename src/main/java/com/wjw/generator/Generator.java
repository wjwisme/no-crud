package com.wjw.generator;

import com.wjw.model.BeanDefinition;

public interface Generator  {

    byte[] generator(BeanDefinition beanDefinition);
}
