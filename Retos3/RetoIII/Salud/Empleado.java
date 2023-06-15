package RetoIII.Salud;

import java.util.Scanner;

public class Empleado extends Persona{
    // Creamos los atributos necesarios para que los metodos se ejecuten de manera correcta
    private String cargo;
    private float valorHora;
    private float horasTrabajadas ;
    private String departamento;
    private float total=0;
    // Creamos los metodos contructores
    public Empleado() {
    }
    public Empleado(String nombre, String apellido, String tipoDoc, int documento, int edad, double peso, double estatura, String sexo, double pesoActual, String cargo, int valorHora, int horasTrabajadas, String departamento) {
        super(nombre, apellido, tipoDoc, documento, edad, peso, estatura, sexo, pesoActual);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    // Generamos los getters y setters. Hacemos encapsulamiento
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public float getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(float horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    // Metodos
    public void registrarEmpleado() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Por favor ingrese su cargo:");
        cargo=capturar.nextLine();
        System.out.println("Por favor ingrese el valor de las horas:");
        valorHora=capturar.nextInt();
        System.out.println("Por favor ingrese la cantidad de horas trabajadas:");
        horasTrabajadas=capturar.nextInt();
        System.out.println("Por favor ingrese su departamento:");
        capturar.nextLine();
        departamento=capturar.nextLine();
    }
    public void calcularHonorarios() {
        float reteica=0;
        reteica= (float) (((valorHora*horasTrabajadas)*0.966)/100);
        total=(valorHora*horasTrabajadas)-reteica;
    }
    public void mostrarEmpleado() {
        System.out.println("Su nombre y apellido son: " + getNombre() + " " + getApellido() + "\n" + "Su tipo de documento es: " + getTipoDoc() + "\n" + "Su numero de documento es: " + getDocumento() + "\n" + "Su cargo es: " + cargo + "\n" + "El total de horas trabjadas son: " + horasTrabajadas + "\n" + "El valor por hora es: " + valorHora + "\n" + "El total a pagar es: " + total);
    }
}