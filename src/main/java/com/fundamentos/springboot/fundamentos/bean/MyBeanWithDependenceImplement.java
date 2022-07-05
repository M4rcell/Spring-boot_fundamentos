package com.fundamentos.springboot.fundamentos.bean;

public class MyBeanWithDependenceImplement implements MyBeanWithDependency  {

    private MyOperation myOperation;

    public MyBeanWithDependenceImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println("La suma es : " + myOperation.sum(numero));
        System.out.println("Hola desde la iplementacion con dependence");
    }
}
