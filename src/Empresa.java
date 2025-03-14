import java.util.ArrayList;

public class Empresa {

    public Empresa() {
        empleados = new ArrayList<>();
    }
    private ArrayList<Empleado> empleados;

    public void agregarEmpleado (Empleado e) {
        empleados.add(e);
    }
    public void mostrarEmpleados(){
        for (Empleado e : empleados) {
            e.mostrarInfo();
        }
    }
    public void subirSalarioGeneral (double porcentaje){
        for (Empleado e : empleados) {
            e.aumentarSalario(porcentaje);
        }
    }
    public Empleado buscarEmpleado (String nombre){
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombre)) { // Ignora mayúsculas y minúsculas
                return e; // Retorna el empleado encontrado
            }
        }
        return null;
    }
}
