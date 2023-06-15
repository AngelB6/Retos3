package Introduccion;

import java.util.Scanner;

public class CalcularEdad {
    
    public void calcularEdad (int anioNaci){
        int anioActual, edad;
        Scanner capturar=new Scanner(System.in);
        System.out.println("Por favor ingrese el año actual");
        anioActual=capturar.nextInt();
        edad=anioActual-anioNaci;
        System.out.println("Su edad es: " + edad);
        capturar.close();
    }

    public Double sumar (Double n1, Double n2){
        Double suma;
        suma=n1+n2;
        return suma;
    }   
}