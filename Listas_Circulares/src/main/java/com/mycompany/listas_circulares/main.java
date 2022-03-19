
package com.mycompany.listas_circulares;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        //Para crear las listas 
    }
    public static class Lista{
        nodo primero;
        //Se encapsuló el código imprimir como un método
        public void imprimirLista(){
            nodo r = new nodo();
            r= primero;
            while(r.siguiente!=primero){
                System.out.println("El Nodo es"+ r.info);
                r=r.siguiente;
            }
        System.out.println("El nodo es "+ r.info);
        }
    }
    
    private static class nodo{
        int info;
        nodo siguiente;
        public nodo(){
        }
    }
}
