package com.github.juceduarte;

import com.github.juceduarte.singleton.SingletonFirst;
import com.github.juceduarte.singleton.SingletonSecond;
import com.github.juceduarte.singleton.SingletonThird;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern Singleton (Padrões de Projetos)

        SingletonFirst lazy = SingletonFirst.getInstancia();
        System.out.println(lazy);
        lazy = SingletonFirst.getInstancia();
        System.out.println(lazy);

        SingletonSecond eager = SingletonSecond.getInstancia();
        System.out.println(eager);
        eager = SingletonSecond.getInstancia();
        System.out.println(eager);

        SingletonThird lazyHolder = SingletonThird.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonThird.getInstancia();
        System.out.println(lazyHolder);
    }
}
