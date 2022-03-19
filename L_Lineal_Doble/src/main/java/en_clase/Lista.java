
package en_clase;


public class Lista {
    
    private Nodo cabecera;

    public Lista() {
        this.cabecera=null;
    }
    
    //Mira si la lista está vacía
    public boolean esVacia(){
        return cabecera==null;
    }
    
    public void retroceder(){
        if(!esVacia()){
            while(this.cabecera.getAnterior()!=null){
                this.cabecera=this.cabecera.getAnterior();
            }
        }
    }
    
    public void adelantar(){
        if(!esVacia()){
            while(this.cabecera.getSiguiente()!=null){
                this.cabecera=this.cabecera.getSiguiente();
            }
        }
    }
    public void insertarAlPrincipio(int valor){
        Nodo nuevo= new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            this.cabecera=nuevo;
        }else{
            retroceder();
            nuevo.setSiguiente(this.cabecera);
            this.cabecera.setAnterior(nuevo);
            this.cabecera=nuevo;
        }
    }
    
    public void insertarAlFinal(int valor){
        Nodo nuevo= new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            this.cabecera=nuevo;
        }else{
            adelantar();
            nuevo.setAnterior(this.cabecera);
            this.cabecera.setSiguiente(nuevo);
        }
    }
    
    public void mostarAdelante(){
        if(esVacia()){
            System.out.println("La lista está vacía");
            return;
        }
        retroceder();
        Nodo aux= this.cabecera;
        while(aux!= null){
            System.out.println(aux.getValor());
            aux=aux.getSiguiente();
        }
    }
    
    public void mostrarAtras(){
        if(esVacia()){
            System.out.println("La lista está vacía");
            return;
        }
        adelantar();
        Nodo aux= this.cabecera;
        while(aux!=null){
            System.out.println(aux.getValor());
            aux= aux.getAnterior();
        }
    }
    //Adicionales-------------------------------------------------------------------------
    
    
}