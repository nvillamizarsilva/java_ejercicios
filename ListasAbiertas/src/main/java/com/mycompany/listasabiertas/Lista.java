

//Todos los métodos que se le aplican a las listas simples enlazadas
    
package com.mycompany.listasabiertas;


public class Lista {
    //Puntero que da a la cabecera
    private Nodo cabecera;

    public Lista() {
        this.cabecera=null;
    }
    
    public boolean esVacia(){
        return cabecera==null;
    }
    //insertar primer nodo 
    public void insertarAlInicio(int valor){
    Nodo nuevo= new Nodo();
    nuevo.setValor(valor);
    if(esVacia()){
        cabecera=nuevo;
    }
    else{
        //une el nuevo nodo con la lista existente
        nuevo.setSiguiente(cabecera);
        //Renombre al nuevo nodo como el inicio de la lista
        cabecera= nuevo;
    }
    }
    //Agregar nodo al final de la lista
    public void agregarAlFinal(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            cabecera=nuevo;   
        }else{
            Nodo aux=cabecera;
            
            //Recore la lista hasta llegar al último nodo 
            while(aux.getSiguiente()!=null){
                aux=aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    //buscar un número
    public boolean buscar(int referencia){
        Nodo aux=cabecera;
        boolean encontrado=false;
        
        //recorrido de la lista hasta encontrar el elemento o el final
        while(aux!=null && encontrado!=true){
            //Recorrido de la lista hasta encontrar el elemento o el final
            if(referencia== aux.getValor()){
                encontrado= true;
            }else{
                aux=aux.getSiguiente();
            }
        }
        return encontrado;
    }
    public void insertarPorReferencia(int referencia, int valor){
        Nodo nuevo= new Nodo();
        nuevo.setValor(valor);
        //Consulta si el valor existe en la lista
        if(buscar(referencia)){
            Nodo aux= cabecera;
            //Recorre la lista hasta llegar al nodo de la referencia
            while(aux.getValor()!=referencia){
                aux= aux.getSiguiente();
            }
            //Crea un respaldo de la continuación de la lista
            Nodo siguiente= aux.getSiguiente();
            //Enlaza el nuevo nodo después del nodo de referencia
            aux.setSiguiente(nuevo);
            //unde la continuación de la lista al nuevo nodo
            nuevo.setSiguiente(siguiente);
        }
    }
    
    //Mostrar la lista
    public void mostarLista(){
        if(!esVacia()){
        Nodo aux=cabecera;
        int i=0; //Posición de los elementos en la lista
            //Recorrer la lista hasta el final
            while(aux!=null){
                System.out.print(i + ". [" + aux.getValor()+ " ]" + " ->  ");
                aux= aux.getSiguiente();
                i++;
            }
        }
        
    }
    
    public void eliminarPorReferencia(int referencia){
        if(buscar(referencia)){
            //consulta si el nodo a eliminar es el primero
            if(cabecera.getValor()==referencia){
                //El primero nodo apunta al siguiente
                cabecera= cabecera.getSiguiente();
            }else{
                Nodo aux= cabecera;
                while(aux.getSiguiente().getValor()!=referencia){
                    aux=aux.getSiguiente();
                }
                //Guarda el nodo siguiente del nodo eliminar
                Nodo siguiente=aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
        }
           
    }
    
    public void eliminarLista(){
        cabecera=null;
    }
   public void actualizarPorReferencia(int referencia, int valor){
       if (buscar(referencia)){
           Nodo aux=cabecera;
           //Recorre hasta llegar al nodo de la referencia
           while(aux.getValor()!=referencia){
               aux=aux.getSiguiente();
           }
           //Actualizar el valor del nodo 
           aux.setValor(valor);
       }
   }
}
