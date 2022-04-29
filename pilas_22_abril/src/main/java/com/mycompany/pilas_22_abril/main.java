
package com.mycompany.pilas_22_abril;

import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Pila Edades = new Pila();
        Edades.PUSH(28);
        Edades.PUSH(23);
        Edades.PUSH(24);
        Edades.PUSH(25);
        Edades.PUSH(29);
        Edades.PUSH(27);
        System.out.println("El tope es " + Edades.Tope);
       
        int profundo, dato, bandera=0;
        while(!Edades.EstaVacia()){
            if(bandera==0){
                profundo=Edades.POP();
                bandera=1;
            }else{
                dato=Edades.POP();
            }
        }
        
        
        }
        
//_______________________________________________________________________
    public static class Pila{
        private nodo Primero;
        private int bandera=0;
        private nodo n = new nodo();
        private nodo r = new nodo();
        public int Tope;
        public int Top =-1; // Esta vacia cuando Top es igual a -1
        private void ActualizarTope(){
        Tope=STACKTOP();
        }
        public int STACKTOP(){
            nodo T = new nodo();
            T=Primero;
            while(T.siguiente != null){
            T = T.siguiente;
            }
            return T.info;
        }
        public nodo STACKTOP1(){
            nodo T = new nodo();
            T=Primero;
            while(T.siguiente != null){
            T = T.siguiente;
            }
            return T;
        }
        public boolean EstaVacia(){
            if(Primero != null && Top != -1)
            return false;
            else
            return true;
        }
        public nodo POPNodos(){ // Este codigo desapila todo el NODO
            nodo Temporal = new nodo();
            nodo T1 = new nodo();
            if(Primero != null && Top != -1){
            Temporal = Primero;
            while(Temporal.siguiente != null){
            T1 = Temporal;
            Temporal = Temporal.siguiente;
            }
         T1.siguiente =null;

         ActualizarTope();
         -- Top; // Decremento porque desApilo
         return Temporal;
         }
         else
         {
         System.out.println("No hay elementos para eliminar");
         Primero = null;
         return null; // No hay datos en la pila
         }
        }
        public int POP(){
            nodo Temporal = new nodo();
            nodo T1 = new nodo();
            if(Primero != null && Top != -1){
            Temporal = Primero;
            while(Temporal.siguiente != null){
            T1 = Temporal;
            Temporal = Temporal.siguiente;

            }
            T1.siguiente =null;

            ActualizarTope();
            -- Top; // Decremento porque desApilo
            return Temporal.info;
            }
            else
            {
            System.out.println("No hay elementos para eliminar");
            Primero = null;
            return -1; // No hay datos en la pila
            }
        }
        public void PUSH(int a){
            if(bandera==0)
            {
            n = new nodo(); // Creamos un nuevo nodo
            n.info = a;
            n.siguiente = null;
            r.siguiente = n;
            Primero=n;
            r= Primero;
            bandera =1;
            }else{
            r=n;
            n = new nodo(); // Creamos un nuevo nodo
            n.info = a;
            n.siguiente = null;
            r.siguiente = n;
            r= r.siguiente;
            }
            //ActualizarTope();
            Tope = a;
            ++Top;
            System.out.println("Se Apilo de forma Exitosa y el tope es " + Tope);
        }
        public void imprimirLista() //Imprime el campo información del Nodo
        {
            nodo r = new nodo();
            r=Primero;
            while(r!=null)
            {
            System.out.println(r.info);
            r = r.siguiente;
            }
        }
    }
    public static class nodo{
        int info;
        nodo siguiente;

        public boolean Espar(){
            if(info % 2 == 0)
            return true;
            else
            return false;
        }
        public boolean EsImpar(){
            if(info % 2 != 0)
            return true;
            else
            return false;
        }

        public boolean EsPrimo(){ //determina si el Nodo tiene un primo
            boolean c=true;
            int i=1,cd=0;
            while(i<= info){
            if(info % i == 0)
            {
            ++cd;
            }
            ++i;
            }
            /*System.out.println("CAntidad " + cd);
            System.out.println("Cual es el campo información" + info);*/

            if(cd<=2)
            return c;
            else
            return false;
        }
        public boolean EsMultiplo(int a){
            if(info % a == 0)
            return true;
            else
            return false;
        }
        public boolean EsNegativo(){
            if(info < 0)
            return true;
            else
            return false;
        }
    } 
}
