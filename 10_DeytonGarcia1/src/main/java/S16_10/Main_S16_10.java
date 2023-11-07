/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package S16_10;

/**
 *
 * @author Matichelo
 */
public class Main_S16_10 {

    public static void main(String[] args) {
        Bombero_10 bombero = new Bombero_10("Juan", 30, "Sargento");

        // Llamar a los métodos
        bombero.apagarIncendio();
        bombero.revisarEquipo();
        bombero.mostrarInformacion();
        
        //Fruta
        Fruta_10 manzana = new Fruta_10("Manzana", "Roja", 150, true);

        // Llamar a los métodos
        manzana.pelar();
        manzana.cortar();
        manzana.exprimir();
        manzana.mostrarInformacion();
        
        Carro_10 carro = new Carro_10("Toyota", "Corolla", 2022, 25000);

        // Llamar a los métodos
        carro.encender();
        carro.acelerar();
        carro.frenar();
        carro.mostrarInformacion();
    }


    }
    
