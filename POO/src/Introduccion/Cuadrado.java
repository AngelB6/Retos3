package Introduccion;

import java.util.Scanner;

public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(){        
    }
    public Cuadrado(int lado){
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }
    public void setLado(int lado) {
        this.lado = lado;
    }

    public void resgitrarDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado");
        lado=capturar.nextInt();
        capturar.close();
    }

    public void calcularArea() {
        System.out.println("El area del cuadrado es: "+lado*lado);
    }
}