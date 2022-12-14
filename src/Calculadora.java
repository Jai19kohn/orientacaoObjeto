import java.util.Scanner;

public class Calculadora {
    double valor1;
    double valor2;
    double total;

    Scanner ler = new Scanner(System.in);

    public void subtracao() {
        total = valor1 - valor2;
        System.out.printf("A diferença entre %.2f e %.2f é %.2f", valor1, valor2, total);
    }

    public void soma() {
        total = valor1 + valor2;
        System.out.printf("A soma entre %.2f e %.2f é %.2f", valor1, valor2, total);
    }

    public void multiplicacao() {
        total = valor1 * valor2;
        System.out.printf("A multiplicação entre %.2f e %.2f é %.2f", valor1, valor2, total);
    }

    public void divisao() {
        total = valor1 / valor2;
        System.out.printf("A divisão entre %.2f e %.2f é %.2f", valor1, valor2, total);
    }
}