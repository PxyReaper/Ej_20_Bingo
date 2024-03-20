
package ej20_bingo;

import java.util.ArrayList;


/* Clase jugador  que crearemos para poder simular la partida del bingo*/
public class Jugador {
    private String nombre;
    private String dni;
    private ArrayList<Carton> cartones;
    private int saldo;
    private boolean ganador;

    
    public Jugador(){         
        this.cartones = new ArrayList<>(); // Inicializamos el ArrrayList para evitar el error nullpointerexception
    }

    public Jugador(String nombre, String dni, int saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
       this.cartones = new ArrayList<>();
    }
    //Metodo que nos recargara el saldo para poder seguir comprando cartones
    public void recargaSaldo(int cantidad){
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.println("Saldo recargado, ahora tienes " + this.saldo);
        }
    
    }
// Metodo donde recorreremos todo los cartones que haya comprado el jugador y ver como estan distribuidos
        public void verCartones(){
            for (Carton carton : cartones) {
               carton.verNumeros();
                
            }
        }
        //Mostramos el nombre de la persona y su saldo
        public void mostrarDatos(){
            System.out.println(this.nombre + this.saldo);
            verCartones();
        
        }
       /* Metodo que va a recorrer cada carton y comprobando si uno de los numeros esta repetido utilizando
        el metodo comprobarnumero() del carton, si  en uno de los cartones aciertas todos los numeros 
        significara que el jugador habrá ganado la partida
        */
        public void  comprobarNumero(int numero){
            for (int i = 0; i < cartones.size(); i++) {
                cartones.get(i).comprobarNumero(numero);
                if (cartones.get(i).getNumeroDeAciertos() == 10) {
                        System.out.println("");
                    System.out.println(cartones.get(i).getListaNumeros());
                    this.ganador = true;
                    
                    break;
                }
            }

            
        }
        
        //Metodo que nos ayudara a comprar tantos cartones como la persona quiera
        public void comprarCartones(int cantidad){
            this.saldo -=cantidad;
            if (this.saldo > 0) {
                
                for (int i = 0; i < cantidad; i++) {
                    cartones.add(new Carton());
                    
                }
                
                System.out.println("Saldo comprado");
            }else{
                System.out.println("No puedes comprar mas");
            }
        
        }
    
        //Metodos set y get del jugador
    public boolean isGanador(){
            return this.ganador;
        
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<Carton> getCartones() {
        return cartones;
    }

    public void setCartones(ArrayList<Carton> cartones) {
        this.cartones = cartones;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
   
//Metodo tooString del jugador
    @Override
    public String toString() {
        return "Jugador= " + this.nombre + " Saldo= " + this.saldo;
    }
    
        
}

