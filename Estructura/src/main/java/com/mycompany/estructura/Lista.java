
package com.mycompany.estructura;

public class Lista {
    //Crear el puntero que apuntará al primer elemento
    private Nodo primero;
    private int num_elemenntos;
    
    //CONSTRUCTOR

    public Lista() {
        this.primero = null;
        this.num_elemenntos = 0;
    }

    public void insertarAlInicio(int elemento){
        Nodo nuevo= new Nodo(elemento, this.primero);
        this.primero=nuevo;
        this.num_elemenntos++;
        System.out.println("Elemento insertado");
    }
    
    public void insertarAlFinal(int elemento){
        Nodo nuevo= new Nodo(elemento, null);
        if(this.primero==null){
            this.primero=nuevo;
        }
        else{
            Nodo actual =this.primero;
            while(actual.getSiguiente()!=null){
                actual=actual.getSiguiente(); 
            }
            actual.setSiguiente(nuevo);
            this.num_elemenntos++;
        }
        System.out.println("Elemento insertado al final");
    }
    
    public void listar(){
        System.out.println("Visualización de los elementos en la lista");
        System.out.println("__________________");
        Nodo actual=this.primero;
        while (actual.getSiguiente()!=null){
            System.out.println(actual.getValor());
            actual=actual.getSiguiente();
        }
        System.out.print(actual.getValor());
        System.out.println("Número de elementos en la lista  "+ this.num_elemenntos);
    }
    
    public void eliminar(int elemento){
        if(this.primero==null){
            System.out.println("La lista vacía");
        }
        else if (primero.getValor()== elemento){
            this.primero=this.primero.getSiguiente();
            this.num_elemenntos--;
            System.out.println("Primer elemento de la lista, eliminado");
        }
        else{
            Nodo actual=this.primero;
            while(actual.getSiguiente()!=null && actual.getSiguiente().getValor()!=elemento){
                actual=actual.getSiguiente();
            }
            if(actual.getSiguiente()==null){
                System.out.println("El valor que se desea borrar, no se encuentra en la lista");
            }
            else{
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                this.num_elemenntos--;
                System.out.println("Elemento eliminado");
            }
        }
    }
    
}
