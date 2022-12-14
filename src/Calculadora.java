import java.util.Scanner;

public class Calculadora {

    Scanner ler = new Scanner(System.in);
    String op;
    double valor1;
    double valor2;
    double total;

    public void escolhaNumeros(){
        System.out.println("Escolha o primeiro valor:");
        valor1 = ler.nextDouble();
        System.out.println("Escolha o segundo valor:");
        valor2 = ler.nextDouble();
        System.out.println("Escolha o operador: \n[1] - \n[2] + \n[3] * \n[4] /");
        op = ler.next();
    }

    public void operador(){
        if (op.equals("1")){
            subtracao();
        }
    }

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