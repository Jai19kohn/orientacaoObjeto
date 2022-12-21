package Biblioteca;

import java.util.Scanner;

public class Acervo extends Livro {
    public int quantidade;
    public String editora;
    Scanner sc = new Scanner(System.in);
    public void enteradaDados(){
        System.out.println("Digite a quantidade de livros: ");
        quantidade = sc.nextInt();
        System.out.println("Informe a editora: ");
        editora = sc.nextLine();
    }
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Quabtidade: " + quantidade);
        System.out.println("Editora: " + editora);
    }
}
