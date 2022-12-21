package Biblioteca;

import java.util.Scanner;

public abstract class Livro {
    public String nome;
    public String autor;

    Scanner sc = new Scanner(System.in);
    public void entradaDados(){
        System.out.println("Informe o nome do livro: ");
        nome = sc.nextLine();
        System.out.println("Informe o autor do livro: ");
        autor = sc.nextLine();
    }
    public void imprimeDados(){
        System.out.println("Livro: " + nome);
        System.out.println("Autor: " + autor);
    }
}