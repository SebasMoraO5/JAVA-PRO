package Tparte1;
                                                //Actividad 1: Conceptos Básicos y Ejemplos Iniciales
public class Vehiculo {
    String marca;
    
    String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método común
    public void encender() {
        System.out.println("El vehículo " + marca + " " + modelo + " está encendido.");
    }
}