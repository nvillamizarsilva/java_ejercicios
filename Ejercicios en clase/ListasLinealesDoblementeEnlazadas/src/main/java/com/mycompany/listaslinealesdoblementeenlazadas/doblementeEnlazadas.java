
package com.mycompany.listaslinealesdoblementeenlazadas;
import java.util.Scanner;
public class doblementeEnlazadas {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        int bandera=0, bander1=0;
        int opc=1, opc1=1;
        
        Lista P= new Lista();
        Lista Q= new Lista();
        P.primero=null;
        Q.primero=null;
        
        //Creamos el primero nodo
        nodo r=new nodo(); //Puntero que salta de nodo en nodo 
        nodo s= new nodo();//Creado para que salte de nodo en nodo en la segunda lista 
        nodo n= new nodo();//Para crear un nuevo nodo
        
        //Esto es una doblemente enlazada
        while(opc!=0){
            if(bandera==0){
                n= new nodo();//Creamos un nuevo nodo
                System.out.println("Digite el valor del nodo");
                n.info=consola.nextInt();
                P.primero= r=n;
                n.anterior= n.siguiente= null;
            }else{
                r=n;
                n= new nodo(); //Creamos un nuevo nodo
                System.out.println("Digite el valor del nodo");
                n.info= consola.nextInt();
                n.anterior= r;
                r.siguiente=n;
            }
            System.out.println("Desea crear otro nodo 1=sí, 0=no");
            opc= consola.nextInt();
        }
        P.imprimirLista();
    }
    private static class nodo{
        int info;
        nodo siguiente;
        nodo anterior;
        public nodo(){
            siguiente=anterior=null;
        }
    }
    public static class Lista{
        nodo primero;
        public void imprimirLista(){
            nodo r= new nodo();
            nodo t= new nodo();
            System.out.println("Ingrese valor");
            r=primero;
            while(r.siguiente!=null){
                r=r.siguiente;
            }
            t=r;
            while(t!=null){
                System.out.println("Nodo:" + t.info);
                t=t.anterior;
            }
        }
    }

}
