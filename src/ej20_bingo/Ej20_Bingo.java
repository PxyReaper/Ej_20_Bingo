package ej20_bingo;

import java.util.ArrayList;

public class Ej20_Bingo {
    /* En este ejercicio vamos a simular una partida de bingo, donde tendremos las siguientes clases
     la clase jugador  que es quien realizara la partida con una serie de cartones y con numeros random 
    entre 0 y 50 incluidos ellos, y la clase carton que es la que contendra los numeros que iremos comprobando
    hasta conseguir un bingo. La partida acabara cuando el jugador gane la partida 
    */
    public static void main(String[] args) {

            Jugador jugador = new Jugador("Iciar", "45567", 20);
        jugador.recargaSaldo(40);
        jugador.comprarCartones(5);
           ArrayList <Integer> numeroRepetido = new ArrayList<>();
        int numero = 0;
        
         jugador.verCartones();
         System.out.println(jugador);

        do {
          numero = (int) (Math.random() * 51);
          jugador.comprobarNumero(numero);
            if (!numeroRepetido.contains(numero)) { //Comprobamos si en una de las posiciones del array no  hay 
                                                                                // numeros para  poder jugar con numeros que no se repitan
                numeroRepetido.add(numero);//añadimos el numero en el array para que no se vuelva a repetir
                System.out.println("Ha salido el numero " +numero);
                jugador.comprobarNumero(numero); //Metodo del jugador
            }
        } while (!jugador.isGanador());
        System.out.println("!!BINGO!!");

    }
}
