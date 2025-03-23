package edu.tiago.estudos;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        
        System.out.println("Digite o nome do cliente: ");
        String nome = entry.nextLine();
        
        System.out.println("Digite o saldo da conta: ");
        double saldo = entry.nextDouble();
        
        System.out.println("Digite o limite da conta: ");
        double limite = entry.nextDouble();
        
        // Criação do objeto Conta
        Conta conta = new Conta(nome, saldo, limite);

        System.out.println("Digite o valor do saque: ");
        double saque = entry.nextDouble();

        if (conta.saque(saque)) {
            System.out.println(String.format("Saque realizado com sucesso! Saldo disponível: %.2f", conta.getSaldo()));
        } else {
            System.out.println(String.format("Saque não realizado! Saldo insuficiente. Saldo atual: %.2f", conta.getSaldo()));
        }

        // Exibindo informações gerais da conta
        System.out.println(String.format("Informações da conta:\nCliente: %s\nSaldo: %.2f\nLimite: %.2f", 
                conta.getNome(), conta.getSaldo(), conta.getLimite()));
    }
}

class Conta {
    private String nome;
    private double saldo;
    private double limite;

    public Conta(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        this.saldo += limite; // Adicionando limite ao saldo inicial
    }

    public boolean saque(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    public double getLimite() {
        return limite;
    }
}
