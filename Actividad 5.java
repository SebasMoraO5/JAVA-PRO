package taller;
import java.util.ArrayList;
import java.util.List;


// Clase principal con el método main
public class Main {
    public static void main(String[] args) {
        
        // Creamos una lista de empleados (puede guardar Gerente, Desarrollador y Administrativo)
        List<Empleado> listaEmpleados = new ArrayList<>();

        // Creamos algunos empleados de ejemplo
        Gerente g1 = new Gerente("Ana", 1, 3000, 2000);
        Desarrollador d1 = new Desarrollador("Carlos", 2, 2500, 3);
        Administrativo a1 = new Administrativo("Luisa", 3, 1800, 10);

        // Agregamos a la lista
        listaEmpleados.add(g1);
        listaEmpleados.add(d1);
        listaEmpleados.add(a1);

        // Creamos un objeto que se encargue de gestionar los empleados
        GestionPersonal gestion = new GestionPersonal();

        // Generamos el informe de todos los empleados
        gestion.generarInforme(listaEmpleados);
    }
}

// --------- Superclase ---------
class Empleado {
    protected String nombre;
    protected int id;
    protected double salarioBase;

    public Empleado(String nombre, int id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    // Método general que luego se sobrescribe en las hijas
    public double calcularSalario() {
        return salarioBase;
    }

    // Mostrar información básica del empleado
    public void mostrarInformacion() {
        System.out.println("ID: " + id + ", Nombre: " + nombre + ", Salario: " + calcularSalario());
    }
}

// --------- Subclase Gerente ---------
class Gerente extends Empleado {
    private double bonoAnual;

    public Gerente(String nombre, int id, double salarioBase, double bonoAnual) {
        super(nombre, id, salarioBase);
        this.bonoAnual = bonoAnual;
    }

    // Sobreescribimos el cálculo del salario
    @Override
    public double calcularSalario() {
        return salarioBase + bonoAnual;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Gerente -> ID: " + id + ", Nombre: " + nombre + 
                           ", Salario: " + calcularSalario() + ", Bono Anual: " + bonoAnual);
    }
}

// --------- Subclase Desarrollador ---------
class Desarrollador extends Empleado {
    private int proyectosAsignados;

    public Desarrollador(String nombre, int id, double salarioBase, int proyectosAsignados) {
        super(nombre, id, salarioBase);
        this.proyectosAsignados = proyectosAsignados;
    }

    @Override
    public double calcularSalario() {
        // cada proyecto suma 500 al salario
        return salarioBase + (proyectosAsignados * 500);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Desarrollador -> ID: " + id + ", Nombre: " + nombre + 
                           ", Salario: " + calcularSalario() + ", Proyectos: " + proyectosAsignados);
    }
}

// --------- Subclase Administrativo ---------
class Administrativo extends Empleado {
    private int horasExtra;

    public Administrativo(String nombre, int id, double salarioBase, int horasExtra) {
        super(nombre, id, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSalario() {
        // cada hora extra suma 20 al salario
        return salarioBase + (horasExtra * 20);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Administrativo -> ID: " + id + ", Nombre: " + nombre + 
                           ", Salario: " + calcularSalario() + ", Horas Extra: " + horasExtra);
    }
}

// --------- Clase para gestionar empleados ---------
class GestionPersonal {
    public void generarInforme(List<Empleado> empleados) {
        System.out.println("------ Informe de Empleados ------");
        for (Empleado e : empleados) {
            // Aquí se aplica polimorfismo: no importa si es Gerente, Desarrollador o Administrativo
            e.mostrarInformacion();
        }
    }
}