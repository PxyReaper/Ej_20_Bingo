package ej20_bingo;

public class Ej20_Bingo {
    
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
