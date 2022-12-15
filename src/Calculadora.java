import java.util.Scanner;

public class Calculadora {

    Scanner ler = new Scanner(System.in);
    double op;
    double valor1;
    double valor2;
    double total;

    String continuar;

    public void escolhaNumeros(){
        System.out.println("Escolha o primeiro valor:");
        valor1 = Double.parseDouble(ler.nextLine());
        System.out.println("Escolha o segundo valor:");
        valor2 = Double.parseDouble(ler.nextLine());
    }

    public void escolhaOperador(){
        System.out.println("Escolha o operador: \n[1] - \n[2] + \n[3] * \n[4] /");
        op = Double.parseDouble(ler.nextLine());

    }

    public void operador() {
        if (op == 1) {
            System.out.println("Você escolheu a subtração:");
            subtracao();
        } else if (op == 2) {
            System.out.println("Você escolheu a soma:");
            soma();
        } else if (op == 3) {
            System.out.println("Você escolheu a multiplicação:");
            multiplicacao();
        } else if (op == 4) {
            System.out.println("Você escolheu a divisão:");
            divisao();
        } else {
            escolhaOperador();
            operador();
        }
    }

    public void repeticao(){
        System.out.println("\nDeseja continuar usando a calculadora? (s/n)");
        continuar = ler.nextLine();
        if (continuar.equals("s")){
            escolhaNumeros();
            escolhaOperador();
            operador();
            repeticao();
        } else if (continuar.equals("n")) {
            System.out.println("\nO programa foi encerrado!");
        } else {
            System.out.println("Insira 'n' para encerrar o programa e 's' para continuar usando a calculadora.");
            repeticao();
        }
    }

    public void subtracao() {
        total = valor1 - valor2;
        System.out.printf("A diferença entre %.2f e %.2f é %.2f\n", valor1, valor2, total);
    }

    public void soma() {
        total = valor1 + valor2;
        System.out.printf("A soma entre %.2f e %.2f é %.2f\n", valor1, valor2, total);
    }

    public void multiplicacao() {
        total = valor1 * valor2;
        System.out.printf("A multiplicação entre %.2f e %.2f é %.2f\n", valor1, valor2, total);
    }

    public void divisao() {
        total = valor1 / valor2;
        System.out.printf("A divisão entre %.2f e %.2f é %.2f\n", valor1, valor2, total);
    }
}