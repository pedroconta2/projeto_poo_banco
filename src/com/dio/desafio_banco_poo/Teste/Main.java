package com.dio.desafio_banco_poo.Teste;

import com.dio.desafio_banco_poo.Entidades.*;
import com.dio.desafio_banco_poo.Entidades.Contas.ContaCorrente;
import com.dio.desafio_banco_poo.Entidades.Contas.ContaPoupanca;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Banco banco = new Banco();
        System.out.println("Criando cliente 1: Pedro");
        Cliente clientePedro = new Cliente();
        clientePedro.setNome("pedro");
        ContaCorrente conta1 = new ContaCorrente(clientePedro);
        conta1.depositar(100.00);
        System.out.println(conta1.imprimir());
        System.out.println();
        System.out.println("Criando cliente 2: Maria");
        Cliente clienteMaria = new Cliente();
        clienteMaria.setNome("maria");
        ContaPoupanca conta2 = new ContaPoupanca(clienteMaria);
        conta2.depositar(1212.00);
        System.out.println(conta2.imprimir());
        System.out.println();
        System.out.println("Transferir dinheiro de Maria para pedro");
        conta2.transferir(conta1,1000);
        System.out.println(conta1.imprimir());
        System.out.println(conta2.imprimir());
        System.out.println();


    }
}
