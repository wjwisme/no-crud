package com.wjw.code;

import com.wjw.main.GeneratorType;
import com.wjw.model.BeanDefinition;

import java.util.List;

public class ImportSourceCode extends AbstractSourceCode {







    String getSourceCode(BeanDefinition beanDefinition , GeneratorType generatorType) {
        String importSourceCode = null;
        List<String> annotations = beanDefinition.getAnnotations();
        if(generatorType ==  GeneratorType.Controller){
            importSourceCode =  generatorImportFragment(annotations);
        }else if(generatorType ==  GeneratorType.Dao){
            importSourceCode =  generatorImportFragment(annotations);
        }else if(generatorType ==  GeneratorType.Service){
            importSourceCode =  generatorImportFragment(annotations);
        }else{
            //不需要生成 import字段
        }
        return importSourceCode;
    }



    private String generatorImportFragment(List<String> annotations){
        StringBuffer sb = new StringBuffer();
        String importAnnotationText = generatorImportFragmentByAnnotations(annotations);

        sb.append(importAnnotationText);
        return sb.toString();
    }

    private String generatorImportFragmentByAnnotations(List<String> annotations){

        String importText = "import aaa.bbb.ccc";
        return importText;
    }



}
