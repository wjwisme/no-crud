package com.wjw.main;

import com.wjw.generator.ControllerGenerator;
import com.wjw.generator.Generator;
import com.wjw.model.BeanDefinition;

/*****
 * 启动类
 * @author wjw
 * @Date 2019-12-18
 */
public class Main {

    //启动入口
    public static void main(String[] args) {
        Generator generator = new ControllerGenerator();
        String sourceCode = generator.generator(new BeanDefinition());
        System.out.println(sourceCode);

    }
}
