package com.dio.desafio_banco_poo.Entidades.Contas;

import com.dio.desafio_banco_poo.Entidades.Cliente;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    private Cliente cliente;
    private int agencia;
    private int conta;
    private double saldo;
    protected String tipo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }

    public String getCliente() {
        return cliente.toString();
    }
    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void sacar(double quantidade) {
        if (saldo >= quantidade){
            saldo -= quantidade;
        } else {
            System.out.println("Sem saldo disponível para ação.");
        }
    }
    @Override
    public void depositar(double quantidade) {
        if (quantidade > 0){
            saldo += quantidade;
        } else {
            System.out.println("Depositar valor válido");
        }
    }
    @Override
    public void transferir(Conta conta, double quantidade) {
        if (quantidade > 0 && this.saldo >= quantidade){
            this.saldo -= quantidade;
            conta.saldo += quantidade;
        } else {
            System.out.println("Não é possível transferir. Verifique o saldo ou a" +
                    " quantidade inserida");
        }
    }

    protected String imprimir() {
        return "Conta{" +
                "titular=" + cliente.getNome() +
                ", tipo=" + tipo +
                ", agência=" + agencia +
                ", conta=" + conta +
                ", saldo=" + saldo +
                '}';
    }
}
