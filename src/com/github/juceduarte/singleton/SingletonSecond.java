package com.github.juceduarte.singleton;
/**
 * @author Venilton
 * @author Juce Duarte GitHub (alterações)
 * Exemplo de um Singleton Eager "apressado"
 * **/

public class SingletonSecond {

    private static SingletonSecond instancia = new SingletonSecond();

    private SingletonSecond(){
        super();
    }

    public static SingletonSecond getInstancia(){
        return instancia;
    }
}