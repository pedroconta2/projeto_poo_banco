package com.dio.desafio_banco_poo.Entidades.Contas;

import com.dio.desafio_banco_poo.Entidades.Cliente;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        super.setTipo("conta corrente");
    }
    @Override
    public String imprimir() {
        return super.imprimir();
    }
}
