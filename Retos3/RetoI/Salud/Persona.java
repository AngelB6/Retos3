package RetoI.Salud;

import java.util.Scanner;

public class Persona {
    // Definimos los atributos necesarios para que los metodos se ejecuten de manera correcta
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private int edad;
    private double peso;
    private double estatura;
    private String sexo;
    // Creamos dos metodos constructor. Uno vacio y otro con parametros
    public Persona() {
    }
    // Creamos el metodo constructor
    public Persona(String nombre, String apellido, String tipoDoc, int documento, int edad, double peso,
            double estatura, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.sexo = sexo;
    }
    // Definimos los metodos (4 en total). El primero es un metodo para solicitar los datos
    public void pedirDatos() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Bienvenido!\nPor favor ingrese su nombre:");
        nombre=capturar.nextLine();
        System.out.println("Por favor ingrese su apellido:");
        apellido=capturar.nextLine();
        System.out.println("Por favor ingrese su tipo de documento:");
        tipoDoc=capturar.nextLine();
        System.out.println("Por favor ingrese su numero de documento:");
        documento=capturar.nextInt();
        System.out.println("Por favor ingrese su edad:");
        edad=capturar.nextInt();
        System.out.println("Por favor ingrese su peso:");
        peso=capturar.nextDouble();
        System.out.println("Por favor ingrese su estatura:");
        estatura=capturar.nextDouble();
        System.out.println("Por favor ingrese su sexo:");
        capturar.nextLine();
        sexo=capturar.nextLine();
        capturar.close();
    }
    // El segundo es un metodo para mostrar a la persona (Mostrar datos registrados)
    public void mostrarPersona() {
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su apellido es: " + apellido);
        System.out.println("Usted tiene tipo de documento es: " + tipoDoc);
        System.out.println(nombre + "su numero de documento es: " + documento);
        System.out.println("Su edad es: " + edad);
        System.out.println("Su peso es: " + peso);
        System.out.println("Su estatura es: " + estatura);
        System.out.println("Su sexo es:"  + sexo);
    }
    // El tercer metodo es utilizado para calcular IMC
    public void calcularImc() {
        double pesoActual=0;
        pesoActual=peso/(estatura*2);
        if (pesoActual<20){
            System.out.println("El peso actual esta por debajo de lo ideal");
        }else if (pesoActual>20 && pesoActual<25){
            System.out.println("El peso actual es ideal");
        }else if (pesoActual>25){
            System.out.println("USted esta en sobrepeso");
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
    // El cuarto es un metodo que define si una persona es mayor de edad
    public void mayorEdad() {
        if (edad>=18){
            System.out.println("Usted es mayor de edad");
        }else if (edad<18){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
}