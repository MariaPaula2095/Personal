public class Empleado {

    private String nombre;
    private double salario;
    private String cargo;

    public Empleado() {
    }

    public Empleado(String nombre, double salario, String cargo) {
        this.nombre = nombre;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", cargo='" + cargo + '\'' +
                '}';
    }

    public void aumentarSalario (double porcentaje){
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
        }
    }

    public void mostrarInfo(){
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Cargo del empleado: " + this.cargo);
        System.out.println("Salario del empleado: " + this.salario);
        System.out.println("----------------------------------------");
    }

}
