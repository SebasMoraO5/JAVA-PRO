package Tparte1;
                                                    //Actividad 1: Conceptos Básicos y Ejemplos Iniciales
public class Moto extends Vehiculo {

    // Constructor
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    // Método específico
    public void tipoDeCombustible() {
        System.out.println("La moto usa gasolina o puede ser eléctrica.");
    }
                                                    //Actividad 2: Sobreescritura de Métodos y Uso de la Anotación @Override
        public void encender() {
        System.out.println("La moto " + marca + " " + modelo + " está encendida.");
    }
}