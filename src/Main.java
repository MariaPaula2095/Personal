//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Crear empleados
        Empleado e1 = new Empleado("Carlos", 2000, "Gerente");
        Empleado e2 = new Empleado("Ana", 1800, "Analista");
        Empleado e3 = new Empleado("Luis", 1500, "Desarrollador");

        // Agregar empleados a la empresa
        System.out.println("**********EMPLEADOS CON SALARIO NORMAL*********");
        System.out.println("------------------------------------------------");
        empresa.agregarEmpleado(e1);
        empresa.agregarEmpleado(e2);
        empresa.agregarEmpleado(e3);

        // Mostrar empleados
        empresa.mostrarEmpleados();

        // Subir salario a todos un 10%
        empresa.subirSalarioGeneral(10);
        System.out.println("*********EMPLEADOS CON AUMENTO SALARIAL********");
        System.out.println("-----------------------------------------------");
        empresa.mostrarEmpleados();

        Empleado encontrado = empresa.buscarEmpleado("Ana");

        if (encontrado != null) {
            System.out.println("********* ENCONTRAR EMPLEADO ********");
            System.out.println("-------------------------------------");
            encontrado.mostrarInfo();
        } else {
            System.out.println("Empleado no encontrado.");
        }
    }
}