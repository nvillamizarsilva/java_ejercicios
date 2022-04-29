
package com.mycompany.listas;


public class main {
    public static class Lista{
        private nodo primero;
        
        public Lista() {
        primero=null;
        }
        
        public boolean esVacia(){
        return primero==null;
        }
           
        public void adelantar(){
            if(!esVacia()){
                
            }
        }
        
       public void agregar_final(int valor){
           nodo nuevo= new nodo();
           nuevo.info=valor;
           if(esVacia()){
               primero=nuevo;
           }else{
               
           }
       }
    }
    
    public static class nodo{
            int info;
            nodo siguiente;
            nodo anterior;
            
            public boolean Espar(){
                if(info %2==0)
                    return true;
                else
                    return false;
            }
            
            public boolean EsImpar(){
                if(info %2 !=0)
                    return true;
                else
                    return false;
            }
            
            public boolean EsPrimo(){
                boolean C=true;
                int i=1,cd=0;
                while(i <= info){
                    if(info % i==0){
                        ++cd;
                    }
                    ++i;
                }
                /*System.out.println("Cantidad "+cd);
                System.out.println("Cual es el campo informacion" +info);*/
                
                if(cd<=2)
                    return C;
                else
                    return false;
                    
            }
            
            public boolean EsMultiplo(int a){
                if(info % a==0)
                    return true;
                else
                    return false;
            }
            
            public boolean EsNegativos(){
                if(info <0)
                    return true;
                else
                    return false;
            }
            
        }
}
