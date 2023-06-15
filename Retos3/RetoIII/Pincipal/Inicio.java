package RetoIII.Pincipal;

import RetoIII.Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        Empleado empleado=new Empleado();
        empleado.pedirDatos();
        empleado.registrarEmpleado();
        empleado.calcularHonorarios();
        empleado.mostrarEmpleado();
    }
}