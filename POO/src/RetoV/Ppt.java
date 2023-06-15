package RetoV;

import java.util.Random;
import java.util.Scanner;

public class Ppt implements Juego{
    // Atributos
    private String nombre;
    private int opcionJugador;
    private int numAle;

    Scanner capturar=new Scanner(System.in);
    public void iniciar() {
        System.out.println("Bienvenido!, ingrese su nombre:");
        nombre=capturar.nextLine();
    }

    public void jugar() {
        System.out.println("Seleccione una de las opciones\n1. Piedra\n2. Papel\n3. Tijera");
        opcionJugador=capturar.nextInt();
        Random aleatorio=new Random();
        numAle=aleatorio.nextInt(3)+1;
    }

    public void finalizar() {
        if (opcionJugador==1 && numAle==1){
            System.out.println("Usted ha seleccionado piedra\nLa maquina selecciono piedra\nUsted ha empatado");
        }else if (opcionJugador==1 && numAle==2){
            System.out.println("Usted ha seleccionado piedra\nLa maquina selecciono papel\nUsted ha perdido");
        }else if (opcionJugador==1 && numAle==3){
            System.out.println("Usted ha seleccionado piedra\nLa maquina selecciono tijera\nUsted ha ganado");
        }else if (opcionJugador==2 && numAle==1){
            System.out.println("Usted ha seleccionado papel\nLa maquina selecciono piedra\nUsted ha ganado");
        }else if (opcionJugador==2 && numAle==2){
            System.out.println("Usted ha seleccionado papel\nLa maquina selecciono papel\nUsted ha empatado");
        }else if (opcionJugador==2 && numAle==3){
            System.out.println("Usted ha seleccionado papel\nLa maquina selecciono tijera\nUsted ha perdido");
        }else if (opcionJugador==3 && numAle==1){
            System.out.println("Usted ha seleccionado tijera\nLa maquina selecciono piedra\nUsted ha perdido");
        }else if (opcionJugador==3 && numAle==2){
            System.out.println("Usted ha seleccionado tijera\nLa maquina selecciono papel\nUsted ha ganado");
        }else if (opcionJugador==3 && numAle==3){
            System.out.println("Usted ha seleccionado tijera\nLa maquina selecciono tijera\nUsted ha empatado");
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
}