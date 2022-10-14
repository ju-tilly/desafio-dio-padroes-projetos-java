package com.github.juceduarte.singleton;
/**
 * @author Venilton
 * @author Juce Duarte GitHub (alterações)
 * Exemplo de um Singleton Lazy "preguiçoso"
 * **/

public class SingletonFirst {

    private static SingletonFirst instancia;

    private SingletonFirst(){
        super();
    }

    public static SingletonFirst getInstancia(){
        if (instancia == null) {
           instancia = new SingletonFirst();
        }
        return instancia;
    }
}
