package com.fundamentos.springboot.fundamentos.bean;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;

public class MyBeanWithDependenceImplement implements MyBeanWithDependency  {

    private Log LOGGER = LogFactory.getLog(MyBeanWithDependenceImplement.class);

    private MyOperation myOperation;

    public MyBeanWithDependenceImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        LOGGER.info("Hemos ingresado al metodo printWithDependency");
        int numero = 1;
        LOGGER.debug("el numero enviado parametro a la dependencia operacion es ':" + numero);
        System.out.println("La suma es : " + myOperation.sum(numero));
        System.out.println("Hola desde la iplementacion con dependence");
    }
}
