/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S16_10;

/**
 *
 * @author Matichelo
 */
public class Fruta_10 {
    String nombre;
    String color;
    double peso;
    boolean estaMadura;

    public Fruta_10(String nombre, String color, double peso, boolean estaMadura) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.estaMadura = estaMadura;
    }

    public void pelar() {
        System.out.println("Pelando la " + nombre + "...");
    }

    public void cortar() {
        System.out.println("Cortando la " + nombre + "...");
    }

    public void exprimir() {
        System.out.println("Exprimiendo la " + nombre + "...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " gramos");
        System.out.println("¿Está madura?: " + estaMadura);
    }
    }
