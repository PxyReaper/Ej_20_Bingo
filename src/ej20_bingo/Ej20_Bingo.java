/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej20_bingo;

import java.util.Scanner;

/**
 *
 * @author Tarde
 */
public class Ej20_Bingo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jugador jugador = new Jugador("Miguel", "12345", 20);
        jugador.recargaSaldo(40);
        jugador.comprarCartones(5);
        int numero = 0;
        
         jugador.verCartones();
          System.out.println(jugador);

        do {

           
            numero = (int) (Math.random() * 51);
            jugador.comprobarNumero(numero);

            

        } while (!jugador.isGanador());
        System.out.println("!!BINGO!!");

    }

}
