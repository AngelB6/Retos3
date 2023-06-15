package RetoIV;

import java.util.Scanner;

public class Trapecio extends Figura{
    private float Base1;
    private float base2;
    private float h;
    private float resultado=0;
    // Hacemos encapsulamiento
    public float getBase1() {
        return Base1;
    }
    public void setBase1(float base1) {
        Base1 = base1;
    }
    public float getBase2() {
        return base2;
    }
    public void setBase2(float base2) {
        this.base2 = base2;
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
    public Trapecio(){
    };
    public Trapecio(float base1, float base2, float h, float resultado) {
        Base1 = base1;
        this.base2 = base2;
        this.h = h;
        this.resultado = resultado;
    }
    // Creamos los metodos de captura, calculo y resultado
    public void resgitrarDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Usted selecciono la figura trapecio\nPor favor ingrese la base inferior (B) del trapecio");
        Base1=capturar.nextFloat();
        System.out.println("Por favor ingrese la base superior (b) del trapecio");
        base2=capturar.nextFloat();
        System.out.println("Pr favor ingrese la altura (h) del trapecio");
        h=capturar.nextFloat();
    }
    
    public void calcularArea() {
        resultado=(float) ((Base1+base2)/2)*6;
    }

    public void mostrarArea() {
        System.out.println("El area del trapecio es: " + resultado + "cm2");
    }
}