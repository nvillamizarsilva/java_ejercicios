
package com.mycompany.pilas;

import java.util.Scanner;
public class Pilas {
    public static class nodo{
        int info;
        nodo siguiente;
    }
    public static class Pila{
        nodo inicio;

        public void Pila() {
            inicio=null;
        }
        
        public boolean esVacia(){
            return inicio==null;
        }
        
        public void push(int valor){
            nodo nuevo= new nodo();
            nuevo.info=valor;
            if(esVacia()){
                inicio=nuevo;
            }else{
                nuevo.siguiente=inicio;
                inicio=nuevo;
            }
        }
        
        public void pop(){
            if(!esVacia()){
                int dato= inicio.info;
                inicio=inicio.siguiente;
                
            }
        }
        
    }
}
