package com.github.juceduarte.facade;

import com.github.juceduarte.subsistema1.crm.CrmService;
import com.github.juceduarte.subsistema2.cep.CepApi;

public class FirstFacade {

    public void migrarCliente (String nome, String cep){ //interface mais simples

        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
