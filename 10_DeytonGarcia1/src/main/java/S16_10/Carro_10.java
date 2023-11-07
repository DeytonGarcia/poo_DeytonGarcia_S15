/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S16_10;

/**
 *
 * @author Matichelo
 */
public class Carro_10 {
        String marca;
    String modelo;
    int anio;
    double precio;

    public Carro_10(String marca, String modelo, int anio, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
    }

    public void encender() {
        System.out.println("Encendiendo el " + marca + " " + modelo + "...");
    }

    public void acelerar() {
        System.out.println("Acelerando el " + marca + " " + modelo + "...");
    }

    public void frenar() {
        System.out.println("Frenando el " + marca + " " + modelo + "...");
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: $" + precio);
    }
}
