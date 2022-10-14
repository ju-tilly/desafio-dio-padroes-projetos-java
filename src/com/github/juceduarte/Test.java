package com.github.juceduarte;

import com.github.juceduarte.singleton.SingletonFirst;
import com.github.juceduarte.singleton.SingletonSecond;
import com.github.juceduarte.singleton.SingletonThird;
import com.github.juceduarte.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Testes relacionados ao Design Pattern (Padrões de Projetos)

        //Singleton
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

        //Strategy
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
