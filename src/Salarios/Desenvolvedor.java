package Salarios;

public class Desenvolvedor {
    private double horas;
    private double preco = 255;

    public Desenvolvedor(){
    }

    public Desenvolvedor(double horas, double preco) {
        this.horas = horas;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "horas=" + horas +
                ", preco=" + preco +
                '}';
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
