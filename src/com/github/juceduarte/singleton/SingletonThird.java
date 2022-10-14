package com.github.juceduarte.singleton;
/**
 * @author Venilton
 * @author Juce Duarte GitHub (alterações)
 * Exemplo de um Singleton Lazy Holder
 * **/

public class SingletonThird {

    private static class InstanceHolder{
        public static SingletonThird instancia = new SingletonThird();
    }

    private SingletonThird(){
        super();
    }

    public static SingletonThird getInstancia(){
        return InstanceHolder.instancia;
    }
}
