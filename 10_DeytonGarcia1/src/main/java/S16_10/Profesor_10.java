/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S16_10;

/**
 *
 * @author Matichelo
 */
public class Profesor_10 {
    String nombre;
    String materia;
    int edad;
    boolean estaDisponible;

    public Profesor_10(String nombre, String materia, int edad) {
        this.nombre = nombre;
        this.materia = materia;
        this.edad = edad;
        this.estaDisponible = true;
    }

    public void darClase() {
        System.out.println(nombre + " está dando clase de " + materia + "...");
    }

    public void revisarExamenes() {
        System.out.println(nombre + " está revisando los exámenes...");
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Materia: " + materia);
        System.out.println("Edad: " + edad);
        System.out.println("¿Está disponible?: " + estaDisponible);
        
             Profesor_10 profesor = new Profesor_10("Juan", "Matemáticas", 35);

        // Llamar a los métodos
        profesor.darClase();
        profesor.revisarExamenes();
        profesor.mostrarInformacion();   
        
    }
    }


