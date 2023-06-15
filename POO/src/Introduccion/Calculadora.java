package Introduccion;

public class Calculadora {
    // Creamos dos aritbutos
    private double n1;
    private double n2;
    // Creamos un metodo constructor vacio
    public Calculadora() {
    }
    // Creamos un metodo constructor con parametros
    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    // 
    public double getN1() {
        return n1;
    }
    public void setN1(double n1) {
        this.n1 = n1;
    }
    public double getN2() {
        return n2;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }

    // Metodo para sumar sin parametros
    public Double sumar(){
        Double suma;
        suma=n1+n2;
        System.out.println("El resultado de la suma es: " + suma);
        return suma;
    }
    
    // Metodo para sumar con parametros
    public Double suma (Double n1, Double n2){
        Double suma;
        suma=n1+n2;
        System.out.println("El resultado de la suma es: " + suma);
        return suma;
    }
    
    // Metodo para restar
    public Double resta (Double n1, Double n2){
        Double resta;
        resta=n1-n2;
        System.out.println("El resultado de la resta es: " + resta);
        return resta;
    }
    // Metodo para multiplicaion
    public Double multiplicacion (Double n1, Double n2) {
        Double multiplicacion;
        multiplicacion=n1*n2;
        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        return multiplicacion;
    }
    // Metodo para divsion
    public Double division (Double n1, Double n2){
        Double division;
        division=n1/n2;
        System.out.println("El resultado de la division es: " + division);
        return division;
    }
}