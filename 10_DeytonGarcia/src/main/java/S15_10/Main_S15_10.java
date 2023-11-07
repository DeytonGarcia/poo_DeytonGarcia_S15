/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package S15_10;

/**
 *
 * @author Matichelo
 */
public class Main_S15_10 {

    public static void main(String[] args) {
        estudiante_10 juan = new estudiante_10("Juan", 20, "Ingeniería", 16.5);

        // Llamar a los métodos
        juan.estudiar();
        juan.dormir();
        juan.mostrarInformacion();
 
        //Animal_10
       Animal_10 perro = new Animal_10("Perro", "Fido", 5, true);

        // Llamar a los métodos
        perro.comer();
        perro.dormir();
       calculadora_10 calc = new calculadora_10();

        // Realizar operaciones
        int resultadoSuma = calc.sumar(5, 3);
        System.out.println("5 + 3 = " + resultadoSuma);

        int resultadoResta = calc.restar(5, 3);
        System.out.println("5 - 3 = " + resultadoResta);

        int resultadoMultiplicacion = calc.multiplicar(5, 3);
        System.out.println("5 * 3 = " + resultadoMultiplicacion);

        double resultadoDivision = calc.dividir(5, 3);
        System.out.println("5 / 3 = " + resultadoDivision);
        
        Futbol_10 partido = new Futbol_10("Real Madrid", "Barcelona");

        // Simular el partido
        partido.golLocal();
        partido.golVisitante();
        partido.golVisitante();
        partido.golLocal();
        partido.golVisitante();

        // Mostrar resultado final
        partido.mostrarResultado();
    }
    }
    

