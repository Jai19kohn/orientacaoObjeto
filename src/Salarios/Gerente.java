package Salarios;

public class Gerente {
    private double salarioTotal;
    private double salario;
    private double horas;
    private double dias;

    public Gerente(){
    }
    public Gerente(double salario, double horas, int dias) {
        this.salario = salario;
        this.horas = horas;
        this.dias = dias;
    }



    @Override
    public String toString() {
        return "Gerente{" +
                "salario=" + salario +
                ", horas=" + horas +
                ", dias=" + dias +
                '}';
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getHoras() {
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public double getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }
}
