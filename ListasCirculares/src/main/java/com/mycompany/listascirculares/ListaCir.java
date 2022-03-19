
package com.mycompany.listascirculares;


public class ListaCir {
    //Crear el puntero
    private Nodo cabecera;

    public ListaCir() {
        this.cabecera=null;
    }
    
    public boolean esVacia(){
        return this.cabecera==null;
    }
    
    public void insertarInicio(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            this.cabecera=nuevo;
            nuevo.setSiguiente(cabecera);
        }else{
            Nodo aux=this.cabecera;
            do{
                aux=aux.getSiguiente();
            }while(aux.getSiguiente()!=cabecera);
            
            aux.setSiguiente(nuevo);
            //unimos el nuevo nodo unido a cabecera
            this.cabecera=nuevo;
        }
        System.out.println("Nodo insertado al inicio");
    }
    
    public void insertaAlFinal(int valor){
        Nodo nuevo=new Nodo();
        nuevo.setValor(valor);
        
        if(esVacia()){
            this.cabecera=nuevo;
            nuevo.setSiguiente(this.cabecera);
        }else{
            //Crear un puntero que nos deje quita la cabecera
            Nodo aux=this.cabecera;
            do{
                aux= aux.getSiguiente();
            }while(aux.getSiguiente()!=this.cabecera);
            //Enlazamos ese nuevo nodo 
            aux.setSiguiente(nuevo);
            //Enlazar a cabecera
            nuevo.setSiguiente(this.cabecera);
        }
        System.out.println("Nodo insertado al final");
    }
    public void mostrarIncompleto(){
        if(cabecera==null){
            return;
        }else{
            Nodo aux= this.cabecera;
            do{
                System.out.println(aux.getValor());
                aux=aux.getSiguiente();
                //Avanza al siguiente nodo de la lista
            }while(aux.getSiguiente()!= cabecera);
        }
    }
    
    
    //Mostrar los elementos de la lista
    //Parte de la cabecera y llega hasta el nodo anterior a cabecera 
    public void mostarListaCompleta(){
        if(this.cabecera==null){
            return; //Si esta lista esá vacía, se termina 
        }else{
            Nodo aux=this.cabecera;//Mantiene la dirección de cabecera
            do{
                System.out.println(aux.getValor());
                aux=aux.getSiguiente();//Avanza al siguiente nodo de la lista
            }while(aux!=this.cabecera);
        }   
    }
    //Buscar un valor, ver si si existe
    public boolean buscar(int referencia){
        if(esVacia()){
            System.out.println("La lista está vacía");
            return false;
        }
        Nodo aux= this.cabecera;
        do{
            if(aux.getValor()==referencia){
                return true;
            }else{
                aux= aux.getSiguiente();            
            }
        }while(aux != this.cabecera);
        return false;
    }
    
    public void modificar(int referencia, int valor){
        if(esVacia()){
            System.out.println("Lista vacía");
            return;
        }
        Nodo aux=this.cabecera;
        do{
            if(aux.getValor()== referencia){
                aux.setValor(valor);
                System.out.println("Valor modificado");
            }else{
                aux=aux.getSiguiente();
                //Avanza al siguiente nodo
            }
        }while(aux != this.cabecera);
        System.out.println("Valor no existe en cabecera para ser cambiado");
    }
    
    public void eliminar(int referencia){
        if(esVacia()){
            System.out.println("La lista es vacía");
            return;
        }
        Nodo aux, ant=cabecera;
        //ant.getSiguiente() Devuelve una referencia que llama getValor() para compararlo
        do{
            if(ant.getSiguiente().getValor()==referencia){
                aux=ant.getSiguiente();
                ant.setSiguiente(aux.getSiguiente());
                //en caso de que el primero se eliminara
                if(aux==cabecera){
                    cabecera=aux.getSiguiente();
                }
                //en caso de ser el unico a eliminar
                if(aux==cabecera){
                    cabecera= null;
                }
                return;
            }else{
                ant= ant.getSiguiente();
            }
        }while(ant !=cabecera);//rebota mientras no llegue al primero
        System.out.println("No existe el dato a eliminar");
    }
    

    
    
    //dada una lista lineal transformarla en una lisa lineal circular 
    /*while(n.next!=null){
        n=n.next
    }*/
    
    /*calculat la cantidad de numeros pares contenidsos en la lista
            while(n.next!=null){
            if(n.info%2=0)
                p++;
    }*/
    
    /*enlazar dos listas circulares:
    while(n.sig!=p.primero){
        n=n.sig;
    }
    n.sig=q.primero.
            while(r.sig!=q.primero)
            {
            r.r.next;
            r.next=p.primero
            }*/
            
}
