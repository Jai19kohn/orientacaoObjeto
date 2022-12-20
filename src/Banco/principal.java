package Banco;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        programa programa = new programa();
        int testeConta;

        System.out.println("Insira o número da conta: (5 dígitos)");
        testeConta = sc.nextInt();
        while (testeConta != programa.getNumConta()){
            System.out.println("Número da conta inesistente. Digite novamente!");
            testeConta = sc.nextInt();
        }
        programa.acoes();

    }
}
