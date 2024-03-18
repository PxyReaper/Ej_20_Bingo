
package ej20_bingo;

import java.util.ArrayList;
import java.util.Random;

public class Carton {
    /*
        El <> sirve para colocar el objeto que vas a introducir en tu array
        en este caso, al ser int un tipo generico, utilizamos su  clase envolto
        rio (Integer)
    
    */
    private ArrayList<Integer> listaNumeros =  new ArrayList<>(); 
    private  int numeroDeAciertos;
    public Carton(){
        Random numeroAleatorio =  new Random();
        for (int i = 0; i < 10; i++) {
            listaNumeros.add(numeroAleatorio.nextInt(51));
            
            
        }
        
 
    }
    
       public void comprobarNumero(int numero){
           if (listaNumeros.contains(numero)) {
               this.numeroDeAciertos++;
           }
           
       
       }
       public void verNumeros(){
           for (Integer listaNumero : listaNumeros) {
               System.out.print(listaNumero +  " ");
           }
           System.out.println("");
       
       }

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
