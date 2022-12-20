package Banco;

import java.sql.SQLOutput;
import java.util.Scanner;

public class programa {
    Scanner sc = new Scanner(System.in);
    private int numConta = 12345;
    private double saldo = 359;
    private double debito = 0;
    private double credito = 100;
    private double deposito;
    String[] acoes = {"Ver saldo disponível", "Depositar", "Sacar dinheiro"};
    int escolhaAcao;

    public void acoes(){
        System.out.println("Escolha uma ação: ");
        for( int i = 0; i < 3; i++){
            System.out.println(i + " - " + acoes[i]);
        }
        escolhaAcao = sc.nextInt();

        if(escolhaAcao == 0){
            mostrarSaldo();
        } else if (escolhaAcao == 1) {
            mostrarDeposito();
        } else if (escolhaAcao == 2) {
            mostrarDebito();
        } else {
            System.out.println("O número informado não corresponde a uma ação!");
            acoes();
        }
    }
    public void mostrarSaldo(){
        setSaldo(getSaldo()-getDebito()+getCredito());
        System.out.println("Seu saldo atual é " + getSaldo());

        if(getSaldo()>=0){
            System.out.println("Seu saldo é positivo!");
        }else {
            System.out.println("Seu saldo é negativo!");
        }
    }

    public void mostrarDeposito(){
        System.out.println("Digite o valor que deseja depositar: ");
        setDeposito(sc.nextDouble());
        setSaldo(getSaldo()+getDeposito()+getCredito()-getDebito());
        System.out.println("Seu saldo atual é: " + getSaldo());
    }

    public void mostrarDebito(){
        System.out.println("Digite o valor que deseja sacar: ");
        setDebito(sc.nextDouble());
        setSaldo(getSaldo()+getCredito()-getDebito());
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getDebito() {
        return debito;
    }

    public void setDebito(double debito) {
        this.debito = debito;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
}
