/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15_10;

/**
 *
 * @author Matichelo
 */
public class estudiante_10 {
    String nombre;
    int edad;
    String carrera;
    double promedio;

    public estudiante_10(String nombre, int edad, String carrera, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public void estudiar() {
        System.out.println(nombre + " está estudiando...");
    }

    public void dormir() {
        System.out.println(nombre + " se está durmiendo...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

} 

