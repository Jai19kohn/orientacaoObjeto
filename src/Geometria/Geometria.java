package Geometria;

public class Geometria {
    public double raio;
    public double ladoA;
    public double ladoB;


    //Cauculo do Raio (Circulo)
    public double calcular (double raio){
        this.raio = 3.14 * (raio * raio);
        return this.raio;

    }
    //Calculo de area do Retangulo
    public double calcular (double ladoA, double ladoB){
        double area = ladoA * ladoB;
        return raio;
    }

    public double getRaio() {return raio;}
    public void setRaio(double raio) {this.raio = raio;}
    public double getLadoA() {return ladoA;}
    public void setLadoA(double ladoA) {this.ladoA = ladoA;}
    public double getLadoB() {return ladoB;}
    public void setLadoB(double ladoB) {this.ladoB = ladoB;}
}
