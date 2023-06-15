package RetoII.Salud1;

import java.util.Scanner;

public class Persona {
    // Definimos los atributos
    private String nombre;
    private String apellido;
    private String tipoDoc;
    private int documento;
    private int edad;
    private double peso;
    private double estatura;
    private String sexo;
    // Creamos el metodo constructor
    public Persona(String nombre, String apellido, String tipoDoc, int documento, int edad, double peso, double estatura, String sexo, double pesoActual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.sexo = sexo;
    }
    // Creamos el metodo constructor vacio
    public Persona() {
    }
    // Creamos Get y Set
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    // Definimos los metodos
    // Metodo para solicitar los datos
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
    // Metodo para mostrar a la persona (Mostrar datos registrados)
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
    // Meotodo para calcular IMC
    public Double calcularImc() {
        double peso=0;
        double pesoActual=0;
        pesoActual=peso/(estatura*2);
        return pesoActual;
    }
    // Metodo para saber si es mayor de edad
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