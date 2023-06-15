package RetoIV;

import java.util.Scanner;

public class Rombo extends Figura{
    // Creamos los atributos necesarios para que los metodos se ejecuten de manera correcta
    private float diaMayor;
    private float diaMenor;
    private float resultado=0;
    // Creamos los metodos constructores
    public Rombo() {
    }
    // Metodo constructor con parametros
    public Rombo(float diaMayor, float diaMenor, float resultado) {
        this.diaMayor = diaMayor;
        this.diaMenor = diaMenor;
        this.resultado = resultado;
    }
    // Creamos los getter y setters
    public float getDiaMayor() {
        return diaMayor;
    }
    public void setDiaMayor(float diaMayor) {
        this.diaMayor = diaMayor;
    }
    public float getDiaMenor() {
        return diaMenor;
    }
    public void setDiaMenor(float diaMenor) {
        this.diaMenor = diaMenor;
    }
    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    // Creamos los metodos para solicitar datos, para calcular el area y para mostrar el resultado del calculo
    public void pedirDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Usted selecciono la figura rombo\nPor favor ingrese la diagonal mayor:");
        diaMayor=capturar.nextFloat();
        System.out.println("Por favor ingrese la diagonal menor:");
        diaMenor=capturar.nextFloat();
    }
    public void calcularArea() {
        resultado=(diaMayor*diaMenor)/2;
    }
    public void mostrarArea() {
        System.out.println("El area del rombo es: " + resultado);
    }
}


