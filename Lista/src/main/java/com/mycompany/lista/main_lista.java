
package com.mycompany.lista;


public class main_lista {
    public static void main(String[] args) {
        
    }
    
    public static class Lista{
        private nodo Primero;
        private int bandera=0;
        private int numElemn=0;
        
        
        
        public Lista() {
            this.Primero=null;
        }
        
        public void insertarPrimero(nodo a){
            //si no hay nada en la lista, ese será el primero
            //Inserta el nodo al 
           if(Primero == null){
                Primero = a;
            }else{
                a.siguiente = Primero;
                Primero = null;
                Primero = a;
            }
        }
        
        public void InsertarNodoluego(int ubicacion, nodo a){
            int c=0;
            nodo Temporal = new nodo();
            Temporal = Primero;
            while(Temporal.siguiente !=null){
                ++c;
                Temporal = Temporal.siguiente;
                if(c == ubicacion){
                    
                }
            }
        }
        
        public int SumaPU(){
            int c=0;
            c= Primero.info + Ultimo();
            return c;
        }
        
        public boolean EstaVacia(){
            if(Primero != null){
            return false;
            }else{
            return true;
            }
        }
        public int SumaPares(){
            int suma=0;
            nodo r= new nodo();
            r=Primero;
            while(r!=null){
                if(r.Espar()){
                    suma += r.info;
                }
                r=r.siguiente;
            }
            return suma;
        }
        
        public int SumaPrimos(){
            nodo r= new nodo();
            int suma=0;
            r=Primero;
            while(r != null){
                if(r.EsPrimo()){
                    suma +=r.info;
                }
                r=r.siguiente;
            }
            return suma;
        }
        
        private int Ultimo(){
            nodo r = new nodo();
            r= Primero;
            while(r.siguiente!=null)
                r=r.siguiente;
            return r.info;
        }
        
    }
    
    public static class nodo{
            int info;
            nodo siguiente, anterior;
            
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
