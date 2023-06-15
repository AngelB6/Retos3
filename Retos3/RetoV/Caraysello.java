package RetoV;

import java.util.Random;
import java.util.Scanner;

public class Caraysello implements Juego{
    // Atributos
    private int moneda;
    private String jugador;
    private int eleccion;

    // Creamos los metodos constructores
    public Caraysello() {
    }

    public Caraysello(int moneda, String jugador, int eleccion) {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }
    
    Scanner capturar=new Scanner(System.in);

    public void iniciar() {
        System.out.println("Ingrese su nombre:");
        jugador=capturar.nextLine();
    }

    public void jugar() {
        System.out.println(jugador + " realice su eleccion\n1. Cara\n2. Sello");
        eleccion=capturar.nextInt();
        Random aleatorio=new Random();
        moneda=aleatorio.nextInt(2)+1;
        System.out.println("Moneda girando");
    }

    public void finalizar() {
        if (moneda==1 && eleccion==1){
            System.out.println("Cayó cara, Ganaste " + jugador);
        }else if(moneda==2 && eleccion==2){
            System.out.println("Cayó sello, Ganaste " + jugador);
        }else if (moneda==1 && eleccion==2){
            System.out.println("Cayó cara, Perdiste " + jugador);
        }else if (moneda==2 && eleccion==1){
            System.out.println("Cayó sello, Perdiste " + jugador);
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
}