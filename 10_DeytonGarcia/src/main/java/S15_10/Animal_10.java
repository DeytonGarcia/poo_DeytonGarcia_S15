/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15_10;

/**
 *
 * @author Matichelo
 */
public class Animal_10 {
    String especie;
    String nombre;
    int edad;
    boolean estaVivo;

    public Animal_10(String especie, String nombre, int edad, boolean estaVivo) {
        this.especie = especie;
        this.nombre = nombre;
        this.edad = edad;
        this.estaVivo = estaVivo;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo...");
    }

    public void dormir() {
        System.out.println(nombre + " se está durmiendo...");
    }

    public void mostrarInformacion() {
        System.out.println("Especie: " + especie);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("¿Está vivo?: " + estaVivo);
    }
}