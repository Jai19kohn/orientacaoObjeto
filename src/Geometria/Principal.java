package Geometria;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Geometria g = new Geometria();

        System.out.println("Informe o valor do raio: ");
        double r = sc. nextDouble();
        System.out.println("Área calculada : " + g.calcular(r));

        System.out.println("Informe os dois lados do retângulo: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Área do Retângulo: " + g.calcular(a,b));
    }

}
