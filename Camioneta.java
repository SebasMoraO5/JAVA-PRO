package Tparte1;

public class Camioneta extends Vehiculo {
    private double capacidadCarga; 
    private String traccion;      

    public Camioneta(String marca, String modelo, double capacidadCarga, String traccion) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
        this.traccion = traccion;
    }

    
    public void encender() {
        System.out.println("La camioneta " + marca + " " + modelo + " está encendida y lista para el trabajo.");
    }

    public void mostrarInfoExtra() {
        System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas. Tracción: " + traccion + ".");
    }
}
