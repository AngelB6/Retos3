package RetoIV;

import java.util.Scanner;

public class Triangulo extends Figura{
    // Creamos atributos para ejecutar correctamente los metodos
    private float base;
    private float h;
    private float resultado=0;
    // Hacemos el encapsulamiento con los getters y setters
    public float getBase() {
        return base;
    }
    public void setBase(float base) {
        this.base = base;
    }
    public float getH() {
        return h;
    }
    public void setH(float h) {
        this.h = h;
    }
    // Creamos los metodos contructores vacios y con parametros
    public Triangulo() {
    }
    // Con parametros
    public Triangulo(float base, float h) {
        this.base = base;
        this.h = h;
    }
    // Creamos los metodos para regsitrar los datos, calcular el area y mostrar el area
    public void resgitrarDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Usted selecciono la figura triangulo\nPor favor ingrese la base del triangulo:");    
        base=capturar.nextFloat();
        System.out.println("Ingrese la altura del triangulo:");
        h=capturar.nextFloat();
    }

    public void calcularArea() {
        resultado=(base*h)/2;
    }

    public void mostrarArea() {
        System.out.println("El area del triuangulo es: " + resultado);
    }
}