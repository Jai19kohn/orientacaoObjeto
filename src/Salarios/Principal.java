package Salarios;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Gerente gerente = new Gerente();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        Empregado empregado = new Empregado();
        String cargo;

        System.out.println("Digite seu nome: ");
        gerente.setNome("Jaine");
        System.out.println("Digite seu telefone: ");
        gerente.setTelefone("1234-5678");
        System.out.println("Digite a sua data de admissão: ");
        gerente.setDataAdmissao("12/12/12");
        System.out.println("Digite seu cargo: ");
        cargo = "gerente";

        if(cargo.equals("gerente")){
            System.out.println("Digite seu salário: ");
            gerente.setSalario(111111);
            System.out.println("Digite a quantidade de horas trabalhadas: ");
            gerente.setHoras(11);
            System.out.println("Digite a quantidade de dias trabalhados: ");
            gerente.setDias(11);
            gerente.resolverSalarioGerente();
            System.out.println(gerente.toString());
        } else if (cargo.equals("desenvolvedor")) {
            System.out.println("Digite a quantidade de horas trabalhadas: ");
            desenvolvedor.setHoras(22222);
            desenvolvedor.resolverSalarioDesen();
            System.out.println(desenvolvedor.toString());
        } else if(cargo.equals("empregado")){
            System.out.println("Digite seu salário: ");
            System.out.println(empregado.toString());
        }
    }
}
