package RetoII.Principal1;

import RetoII.Salud1.Persona;

public class Inicio{
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
        
        if (persona.calcularImc()<20){
            System.out.println("PESOBAJO");
        }else if (persona.calcularImc()>20 && persona.calcularImc()<25){
            System.out.println("PESOIDEAL");
        }else {
            System.out.println("SOBREPESO");
        }
    }
}