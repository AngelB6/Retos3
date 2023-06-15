package RetoIV;

import java.util.Scanner;

public class Paralelogramo extends Figura{
    private float base;
    private float h;
    private float resultado=0;
    // Creamos los getters y setters
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
    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    // Creamos los metodos constructores
    public Paralelogramo() {
    }
    public Paralelogramo(float base, float h, float resultado) {
        this.base = base;
        this.h = h;
        this.resultado = resultado;
    }
    
    public void resgitrarDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Usted selecciono la figura paralelogramo\nPor favor ingrese la base del paralelogramo");
        base=capturar.nextFloat();
        System.out.println("Por favor ingrese la altura");
        h=capturar.nextFloat();
    }

    public void calcularArea() {
        resultado=base*h;
    }
    
    public void mostrarArea() {
        System.out.println("El area del paralelogramo es: " + resultado);
    }
}