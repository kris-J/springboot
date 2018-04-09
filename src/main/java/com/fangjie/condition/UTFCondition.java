package com.fangjie.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class UTFCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if(encoding != null){
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }

    public void show(){
        System.out.println("file encoding is utf-8");
    }
}
