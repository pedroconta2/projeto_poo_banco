package com.dio.desafio_banco_poo.Entidades.Contas;

public interface IConta {
    void sacar(double quantidade);
    void depositar(double quantidade);
    void transferir(Conta conta, double quantidade);
    
}
