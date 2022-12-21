package Salarios;

public class Desenvolvedor extends Pessoa{
    private double salarioTotal;
    private double horas;
    private double preco = 255;

    public Desenvolvedor(){
    }

    public Desenvolvedor(double salarioTotal, double horas, double preco) {
        this.salarioTotal = salarioTotal;
        this.horas = horas;
        this.preco = preco;
    }

    public double resolverSalarioDesen(){
        setSalarioTotal(getHoras()*getPreco());
        return getSalarioTotal();
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome=" + super.getNome() +
                ", telefone=" + super.getTelefone() +
                ", data de admissão=" + super.getDataAdmissao() +
                "salarioTotal=" + salarioTotal +
                ", horas=" + horas +
                ", preco=" + preco +
                '}';
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
