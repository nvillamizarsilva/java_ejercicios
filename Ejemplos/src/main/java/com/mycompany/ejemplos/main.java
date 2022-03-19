
package com.mycompany.ejemplos;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int bandera=0, bandera1=0;
        int opc=1, opc1=1;
        //Para crear las listas 
        Lista P= new Lista();
        Lista Q= new Lista();
        
        P.primero= null;
        Q.primero= null;
        
        //Permite crear el primer Nodo
        nodo r= new nodo();
        nodo s= new nodo();
        nodo n= new nodo();
        
        //Los nodos que deseeemos 
        while(opc!= 0){
            if (bandera==0){
                n= new nodo();
                System.out.println("Digite el valor del Nodo");
                n.info= consola.nextInt();
                bandera=1; //Nunca más vuelve a ingresar aquí
                P.primero= n;
                r= P.primero;
                n.siguiente=P.primero;
            }else{
                n= new nodo(); //Creamos un nuevo nodo
                System.out.println("Digite el valor del nodo");
                n.info= consola.nextInt();
                n.siguiente=P.primero;
                r.siguiente= n;
                r=r.siguiente;
            
            }
            System.out.println("Desea crear otro nodo 1-si, 0-no");
            opc=consola.nextInt();
        }
        P.imprimirLista();
        
        while(opc1!=0){
            if(bandera1==0){
                n= new nodo();
                System.out.println("Digite el valor del nodo");
                n.info= consola.nextInt();
                bandera1=1;
                Q.primero=n;
                s=Q.primero;
                n.siguiente=Q.primero;
            }else{
                n= new nodo();
                System.out.println("Digite el valor del nodo");
                n.info= consola.nextInt();
                n.siguiente=Q.primero;
                s.siguiente=n;
                s=s.siguiente;
            }
            System.out.println("Desea crear otro nodo 1-si, 0-no");
            opc1=consola.nextInt();
        }
        Q.imprimirLista();
       
        r=P.primero;
        s=Q.primero;
       
        while(r.siguiente!= P.primero){
            r=r.siguiente;
        }
       
        r.siguiente= Q.primero;
        r=r.siguiente;
       
        while(r.siguiente!= Q.primero){
            r=r.siguiente;
        }
       
        r.siguiente= P.primero;
        System.out.println("******************************");
        P.imprimirLista();
        System.out.println("******************************");
        Q.imprimirLista();
    }
    
   /* while(r.siguiente!=null){    
        r=r.siguiente;
    }
    
    while(s.anterior!=null){
        s=s.anterior;
    }
    
    r.siguiente=s;
    s.siguiente=r;
    ____Primera parte
    while(r.anterior!=null){
        r=r.anterior;
    }
    while(s.siguiente!=null){
        s=s.siguiente;
    }
    
    r.anterior=s;
    s.siguiente=r;
    
    */
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
