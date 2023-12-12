package com.dio.desafio_banco_poo.Entidades;

import com.dio.desafio_banco_poo.Entidades.Contas.Conta;

import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
}
