package com.alberto.aaentornos;

import com.alberto.aaentornos.domain.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Gestion {
    private Boolean salir;
    private final Scanner teclado = new Scanner(System.in);
    private final ArrayList<Vehiculo> vehiculos;
    private final Coche coche = new Coche();
    private final Moto moto = new Moto();
    private final Bicicleta bicicleta = new Bicicleta();
    private final Patinete patinete = new Patinete();


    public Gestion() {
        //Relleno la colección con algunos vehículos, para que podamos tener funcionalidad
        vehiculos = new ArrayList<>();
        Vehiculo nuevoVehiculo = new Coche("Opel", "Corsa", 3489, "2021", "OC2021", false, "Gasolina", 5, "0344JFW", 5.4F, false);
        vehiculos.add(nuevoVehiculo);
        nuevoVehiculo = new Bicicleta("BH","Bosch Xenion City Wave", 68, "2021","BXCW2021", false, true, 250F,true);
        vehiculos.add(nuevoVehiculo);
        nuevoVehiculo = new Moto("Honda", "SH350i", 2500, "2021", "SH350i", true, "Gasolina", true, "7894AAA", 21.6F,false);
        vehiculos.add(nuevoVehiculo);
        nuevoVehiculo = new Patinete("Xiaomi", "Essential", 57, "2021", "E100.1",false, true,200F,true);
        vehiculos.add(nuevoVehiculo);
        salir = false;
    }

    public void ejecutar () {
        do {
            System.out.println("Aplicación GesFlota v0.1");
            System.out.println("1. Ver Vehículos");
            System.out.println("x. Salir");
            System.out.print("Selecciona: ");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    verVehiculos();
                    break;
                case "x":
                case "X":
                    salir();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while(!salir);
    }
    private void verVehiculos() {
        do {
            System.out.println("Quieres consultar todos los vehículos o uno concreto");
            System.out.println("1. Ver Todos los Vehículos registrados");
            System.out.println("2. Escoger un Vehículo por el número de bastidor");
            System.out.println("3. Escoger Vehículos por marca");
            System.out.println("x. volver");
            System.out.print("Selecciona: ");
            String opcion = teclado.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Estos son todos los vehículos registrados:");
                    for (Vehiculo vehiculo : vehiculos){
                        System.out.println(vehiculo);
                    }
                    break;
                case "2":
                    System.out.println("Escribe el numero de bastidor: ");
                    String busqueda = teclado.nextLine();
                    for (Vehiculo object  : vehiculos) {
                        if (object.getNumBastidor().equals(busqueda)){
                            System.out.println("El vehículo buscado es: ");
                            System.out.println(object);
                        }
                    }
                    break;
                case "3":
                    System.out.println("Escribe la marca por la que buscar: ");
                    busqueda = teclado.nextLine();
                    for (Vehiculo object  : vehiculos) {
                        if (object.getMarca().equalsIgnoreCase(busqueda)){
                            System.out.println("Estos son los vehículos encontrados de esa marca: ");
                            System.out.println(object);
                        }
                    }
                    break;
                case "x":
                case "X":
                    ejecutar();
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private void salir() {
        salir = true;
    }

}
