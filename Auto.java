package Tparte1;
                                                //Actividad 1: Conceptos Básicos y Ejemplos Iniciales
public class Auto extends Vehiculo {

    // Constructor
    public Auto(String marca, String modelo) {
        super(marca, modelo); // Llama al constructor de Vehiculo
    }

    // Método específico
    public void tipoDeCombustible() {
        System.out.println("El auto usa gasolina.");
    }
                                                //Actividad 2: Sobreescritura de Métodos y Uso de la Anotación @Override
     public void encender() {
        System.out.println("El auto " + marca + " " + modelo + " está encendido.");
    }
}