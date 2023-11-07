/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S15_10;

/**
 *
 * @author Matichelo
 */
    public class Futbol_10 {
    String equipoLocal;
    String equipoVisitante;
    int golesLocal;
    int golesVisitante;

    public Futbol_10(String equipoLocal, String equipoVisitante) {
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;
    }

    public void golLocal() {
        golesLocal++;
    }

    public void golVisitante() {
        golesVisitante++;
    }

    public void mostrarResultado() {
        System.out.println(equipoLocal + " " + golesLocal + " - " + golesVisitante + " " + equipoVisitante);
    }

    public static void main(String[] args) {
        // Crear objeto Futbol_10

}
    
}