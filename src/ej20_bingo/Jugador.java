/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej20_bingo;

import java.util.ArrayList;

/**
 *
 * @author Tarde
 */
public class Jugador {
    private String nombre;
    private String dni;
    private ArrayList<Carton> cartones =  new ArrayList<>();
    private int saldo;
    private boolean ganador;

    
    public Jugador(){
    
    }

    public Jugador(String nombre, String dni, int saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
       
    }
    
    public void recargaSaldo(int cantidad){
        if (this.saldo > 0) {
            this.saldo += cantidad;
            System.out.println("Saldo recargado, ahora tienes " + this.saldo);
        }else{
            System.out.println("No tienes dinero");
        
        }
    
    }

        public void verCartones(){
            for (Carton carton : cartones) {
               carton.verNumeros();
                
            }
        }
        public void mostrarDatos(){
            System.out.println(this.nombre + this.saldo);
            verCartones();
        
        }
       
        public void  comprobarNumero(int numero){
            for (int i = 0; i < cartones.size(); i++) {
                cartones.get(i).comprobarNumero(numero);
                if (cartones.get(i).getNumeroDeAciertos() == 10) {
   
                    System.out.println(cartones.get(i).getListaNumeros());
                    this.ganador = true;
                    
                    break;
                }
            }

            
        }
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
   

    @Override
    public String toString() {
        return "Jugador= " + this.nombre + " Saldo= " + this.saldo;
    }
    
        
}

