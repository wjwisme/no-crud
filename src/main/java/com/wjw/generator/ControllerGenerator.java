package com.wjw.generator;

import com.wjw.code.AbstractSourceCode;
import com.wjw.code.ImportSourceCode;
import com.wjw.main.GeneratorType;
import com.wjw.model.BeanDefinition;


/****
 * @author wjw
 * @Date 2019-12-19
 */
public class ControllerGenerator  extends AbstractGenerator {
    public String generator(BeanDefinition beanDefinition) {
        AbstractSourceCode sourceCode = new ImportSourceCode();
        String controllerSourceCode = sourceCode.getSourceCode(beanDefinition, GeneratorType.Controller);
        return controllerSourceCode;
    }
}
