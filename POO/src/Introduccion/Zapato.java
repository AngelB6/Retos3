package Introduccion;

import java.util.Scanner;

public class Zapato {
    // Creamos lo atributos necesarios para la superclase
    private int idZapato;
    private String marcaZapato;
    private String materialZapato;
    private String color;
    // Creamos la sobre carga con dos metodos contructores. El primero es un metodo constructor vacio
    public Zapato() {
    }
    // Y el otro es un metodo con parametros
    public Zapato(int idZapato, String marcaZapato, String materialZapato, String color) {
        this.idZapato = idZapato;
        this.marcaZapato = marcaZapato;
        this.materialZapato = materialZapato;
        this.color = color;
    }
    // Creaamos los metodos Getters y Setters a traves del IDE
    public int getIdZapato() {
        return idZapato;
    }
    public void setIdZapato(int idZapato) {
        this.idZapato = idZapato;
    }
    public String getMarcaZapato() {
        return marcaZapato;
    }
    public void setMarcaZapato(String marcaZapato) {
        this.marcaZapato = marcaZapato;
    }
    public String getMaterialZapato() {
        return materialZapato;
    }
    public void setMaterialZapato(String materialZapato) {
        this.materialZapato = materialZapato;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Creamos el metodo para registrar un zapato
    public void registrarZapato() {
        Scanner capturar=new Scanner(System.in);
        System.out.println("Por favor ingrese el ID del zapato");
        idZapato=capturar.nextInt();
        capturar.nextLine();
        System.out.println("Por favor ingrese la marca del zapato");
        marcaZapato=capturar.nextLine();
        System.out.println("Por favor ingrese el material del zapato");
        materialZapato=capturar.nextLine();
        System.out.println("Por favor ingrese el color del zapato:");
        color=capturar.nextLine();
        capturar.close();
    }

    // Mostrar los valores capturados
    public void mostrarZapato() {
        System.out.println("El ID del zapato es: " + idZapato);
        System.out.println("La marca del zapato es: " + marcaZapato);
        System.out.println("El material del zapato es: " + materialZapato);
    }
}