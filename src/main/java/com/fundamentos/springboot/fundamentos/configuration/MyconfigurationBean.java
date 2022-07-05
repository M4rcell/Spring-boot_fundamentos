package com.fundamentos.springboot.fundamentos.configuration;

import com.fundamentos.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyconfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implements();
    }

    @Bean
    public MyOperation beanOperationOperation(){
        return new MyOperationImplement();
    }

    @Bean
    public MyBeanWithDependency beanOperationOperationWithDependence(MyOperation myOperation){
        return new MyBeanWithDependenceImplement(myOperation);
    }
}
