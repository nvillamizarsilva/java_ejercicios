
package com.mycompany.estructura;

import java.util.Scanner;
public class EstructuraLista {
    public static void main(String[] args) {
        Lista lista1=new Lista();
        Scanner consola=new Scanner(System.in);
        System.out.println("ingrese la cantidad de nodos que desea crear");
        int cantidad= consola.nextInt();
        int cont=0;
        
            
        while (cont!=cantidad){
            System.out.println("Ingrese el primer nodo");
            lista1.insertarAlInicio(consola.nextInt());
            cont++;
                while(cont!=cantidad){
                    System.out.println("Ingrese el siguiente nodo");
                    lista1.insertarAlFinal(consola.nextInt());
                cont++;
                }
        }
       
       

        lista1.listar();
    }
}
