package Salarios;

public class Empregado extends Pessoa{
    private double salario;

    @Override
    public String toString() {
        return "Empregado{" +
                "nome=" + super.getNome() +
                ", telefone=" + super.getTelefone() +
                ", data de admissão=" + super.getDataAdmissao() +
                "salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
