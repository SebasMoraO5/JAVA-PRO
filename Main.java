package Tparte1;
                                                    
public class Main {
                                                        //Actividad 3: Polimorfismo en Java
    static void iniciarVehiculo(Vehiculo vehiculo) {
        vehiculo.encender(); // Polimorfismo en acción

    }                                                   //Actividad 1: Conceptos Básicos y Ejemplos Iniciales

    public static void main(String[] args) {
        
        //instancia de Auto
        Auto miAuto = new Auto("Toyota", "Corolla");
        miAuto.encender();
        miAuto.tipoDeCombustible();

        System.out.println();

        //instancia de Moto
        Moto miMoto = new Moto("Yamaha", "R3");
        miMoto.encender();
        miMoto.tipoDeCombustible();


                                                        //Actividad 4: Implementación de una Jerarquía Completa

        //instancia camioneta
        Camioneta camioneta = new Camioneta("Ford","Ranger",1.2, "4x4");
        camioneta.encender();
        camioneta.mostrarInfoExtra();



                                                        //Actividad 3: Polimorfismo en Java
                                                        
        Vehiculo[] vehiculos = {miAuto, miMoto, camioneta};
        for (Vehiculo v : vehiculos) {
            iniciarVehiculo(v); // cada objeto responde con su propio encender()
        }
    }
}
