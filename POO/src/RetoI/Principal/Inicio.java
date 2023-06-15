package RetoI.Principal;

import RetoI.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        Persona persona=new Persona();
        persona.pedirDatos();
        persona.mostrarPersona();
        persona.calcularImc();
        persona.mayorEdad();
    }
}