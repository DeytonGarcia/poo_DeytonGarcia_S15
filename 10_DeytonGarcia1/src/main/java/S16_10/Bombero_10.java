/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S16_10;

/**
 *
 * @author Matichelo
 */
public class Bombero_10 {
    String nombre;
    int edad;
    String rango;
    boolean estaDisponible;

    public Bombero_10(String nombre, int edad, String rango) {
        this.nombre = nombre;
        this.edad = edad;
        this.rango = rango;
        this.estaDisponible = true;
    }

    public void apagarIncendio() {
        System.out.println(nombre + " está apagando el incendio...");
    }

    public void revisarEquipo() {
        System.out.println(nombre + " está revisando el equipo...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Rango: " + rango);
        System.out.println("¿Está disponible?: " + estaDisponible);
    
    }
}
