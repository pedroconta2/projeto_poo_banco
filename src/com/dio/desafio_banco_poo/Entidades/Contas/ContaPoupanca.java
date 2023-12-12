package com.dio.desafio_banco_poo.Entidades.Contas;

import com.dio.desafio_banco_poo.Entidades.Cliente;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.setTipo("conta poupança");
    }
    @Override
    public String imprimir() {
        return super.imprimir();
    }
}
