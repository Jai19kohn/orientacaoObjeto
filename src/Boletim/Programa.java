package Boletim;

import java.util.Scanner;

public class Programa {
    String[] nome = {"Jaine", "Jair", "José", "Alberto", "Gustavo"};
    Scanner sc = new Scanner(System.in);
    int numNome;

    double resultado = 0;
    double nota1;
    double nota2;
    double nota3;


    public void definirPessoa(){
        System.out.println("Escolha um nome: ");
        for(int i = 0; i < nome.length; i++){
            System.out.print(i + " - " + nome[i] + "\n");
        }
        numNome = sc.nextInt();
    }
    public void digitarNota() {
        System.out.println("Digite a primeira nota:");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota:");
        nota3 = sc.nextDouble();
    }
    public void resultado(){
        resultado = (nota1 + nota2 + nota3) / 3;

        if(resultado >= 7){
            System.out.println("Você "+ nome[numNome] + " passou, com média: " + resultado);
        } else if (resultado == 6.9 | 6 == resultado) {
            System.out.println("Você "+ nome[numNome] + " está em recuperação, ficou com média: " + resultado);
        } else{
            System.out.println("Você "+ nome[numNome] + " reprovou, ficou com média: " + resultado);
        }
    }
}