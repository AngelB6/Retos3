package RetoIV;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        int respuesta;
        do{ 
        int seleccion;
        Scanner capturar=new Scanner(System.in);
        System.out.println("Ingrese Una figura para calcular el area\n1. Trapecio\n2. Triangulo\n3. Paralelogramo\n4. Rombo");
        seleccion=capturar.nextInt();
        switch (seleccion) {
            case 1:
                Trapecio t=new Trapecio();
                t.resgitrarDatos();
                t.calcularArea();
                t.mostrarArea();
                break;
            case 2:
                Triangulo tria=new Triangulo();
                tria.resgitrarDatos();
                tria.calcularArea();
                tria.mostrarArea();
                break;
            case 3:
                Paralelogramo p=new Paralelogramo();
                p.resgitrarDatos();
                p.calcularArea();
                p.mostrarArea();
                break;
            case 4:
                Rombo r=new Rombo();
                r.pedirDatos();
                r.calcularArea();
                r.mostrarArea();
            default:
                System.out.println("Seleccione una opcion correcta");
                break;}
        System.out.println("¿Desea calcular el area de otra figura?\n1. Si\n2. No");
        respuesta=capturar.nextInt();
        }while (respuesta==1);{
            System.out.println("Gracias por usar nuestro porgrama");
        }
    }
}