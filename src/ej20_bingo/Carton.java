
package ej20_bingo;

import java.util.ArrayList;
import java.util.Random;

public class Carton {
    /*
        El <> sirve para colocar el objeto que vas a introducir en tu array
        en este caso, al ser int un tipo primitivo, utilizamos su  clase envolto
        rio (Integer)
    
    */
    /*
        Clase carton que podremos  utilizar para que el jugador pueda comprar los cartones y asi pueda jugar
        la partida
    
    */
    private ArrayList<Integer> listaNumeros =  new ArrayList<>(); 
    private  int numeroDeAciertos;
    //Constructor por defecto donde invocaremos un numero random  y que haga un recorrido de 0 a 10
    //Rellenando los numeros con numeros para jugar la partida
    public Carton(){
        Random numeroAleatorio =  new Random();
           /* 
            Recorrido donde iremos rellenando los numeros del carton sin  antes comprobar si alguno de los
            numeros se repite para que  sean si o si 10 numeros distintos y en caso de repetirse restaremos
            1  a la variable auxiliar  de i para que el tamaño del array aunque se repitan los numeros sea siempre
            10
        */
        for (int i = 0; i < 10; i++) {
            int numero = numeroAleatorio.nextInt(51) +1;
            if (!this.listaNumeros.contains(numero)) {
                listaNumeros.add(numero);
            }else i-=1;
            
            
        }
        
 
    }
    
    //Metodo que comprobara si uno de los numeros se repite dentro de nuestro carton
       public void comprobarNumero(int numero){
        
           if (listaNumeros.contains(numero)) {
               this.numeroDeAciertos++;
           }
           
       
       }
       //Metodo donde podremos ver los numeros de nuestro carton
       public void verNumeros(){
           for (Integer listaNumero : listaNumeros) {
               System.out.print(listaNumero +  " ");
           }
           System.out.println("");
       
       }
//Metodos set y get del carton
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public  int getNumeroDeAciertos() {
        return this.numeroDeAciertos;
    }

    public  void setNumeroDeAciertos(int numeroDeAciertos) {
        this.numeroDeAciertos = numeroDeAciertos;
    }
      @Override
      public String toString(){
      
          return "listaNumeros= " + 
                  listaNumeros + " numeroDeAciertos= " + numeroDeAciertos;
      }
      
}
