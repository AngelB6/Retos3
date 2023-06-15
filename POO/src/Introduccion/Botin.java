package Introduccion;

import java.util.Scanner;

public class Botin extends Zapato{
    // Creamos un atributo propiio de la subclase botin
    private String tipoZapato="Botin";
    private int cantTaches;
    public Botin(){
    }
    public Botin (int idZapato, String marcaZapato, String materialZapato, String color, String tipoZapato){
        super(idZapato, marcaZapato, materialZapato, color);
        this.tipoZapato = tipoZapato;
    }
    // Creamos un metodo para registrar datos de un botin
    public void registrarBotin(){
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de taches que tiene");
        cantTaches=capturar.nextInt();
    }
    // Creamos un metodo para mostrar los datos sobre el zapato
    public void mostrarBotin() {
        System.out.println("El ID del zapato es: " + getIdZapato());
        System.out.println("El tipo de zapato es: " + tipoZapato);
        System.out.println("La cantidad de taches es: " + cantTaches);
        System.out.println("La marca del zapato es: " + getMarcaZapato());
        System.out.println("El material del zapato es: " + getMaterialZapato());
        System.out.println("El color del zapato es: " + getColor());
    }
    //        
}