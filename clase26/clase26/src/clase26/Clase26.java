
package clase26;

import java.util.Scanner;

public class Clase26 {

    public static void main(String[] args) {
        int opc=1; // La bandera que permita capturar datos
        int bandera = 0;
        Scanner sc = new Scanner(System.in); //Se creo un objeto tipo escanner.
        
        Lista P = new Lista(); // Esta es la lista que vamos a utilizar
        Lista Q = new Lista(); // No esta siendo utilizada       
        P.Primero = null; //Esta lista se encuentra vacia
        Q.Primero = null; //Esta lista se encuentra vacia.
        
        //Permite crear un primer NODO
        nodo r = new nodo(); // Puntero temporal para saltar de nodo a nodo
        nodo n = new nodo(); // Creamos un nuevo nodo
        
        //De aqui en eadelante los que deseemos -  NODOS
        while (opc != 0){       
            if(bandera==0){
           n = new nodo(); // Creamos un nuevo nodo
           System.out.println("Digite el valor del Nodo");
            n.info = sc.nextInt();
            n.siguiente = null; 
            r.siguiente = n;
            P.Primero=n;
            r= P.Primero;   
            bandera =1;
            }else{
                r=n;
                n = new nodo(); // Creamos un nuevo nodo
               System.out.println("Digite el valor del Nodo");
                n.info = sc.nextInt();
                n.siguiente = null; 
                r.siguiente = n;
                r= r.siguiente;          
            }
            System.out.println("Desea crear otro Nodo 1-Si, 0-NO");
            opc = sc.nextInt(); // Si es 1 - Siguie Pidiendo y si es = se sale 
        }
       P.imprimirLista();
       System.out.println("La cantidad de Nodos es de: " + P.cantidadNodos());
       System.out.println("La cantidad  de los numeros pares es de: " + P.cantidadPares());
       System.out.println("La suma del primro más el último es de: " + P.SumaPU());
       
       System.out.println("Concatenacion de la lista con ella misma");
       P.concatenarLista(P);
       P.imprimirLista();
       //Deseo Agregar al Primero
       System.out.println("Digite el campo de informacion que ingresa de primero");
       P.AgregarNodoPrimero(sc.nextInt());
       System.out.println("*******************************************************");
       P.imprimirLista();
       //Deseo Agregar al Principio un nodo que envio
       System.out.println("*******************************************************");
       nodo Temporal = new nodo();
       Temporal.info = -105;   
       Temporal.siguiente = null;
       P.AgregarNodoPrimero(Temporal);
       P.imprimirLista();
    }
    
// *******************************************************//

public static class Lista{
        nodo Primero;
        private int bandera=0;
        private nodo n = new nodo();
        private nodo r = new nodo();
        
        public void EliminarPrimero(){
            if(Primero !=null)
                if(Primero.siguiente != null)
                    Primero=Primero.siguiente;
            else
                    Primero=null;
            else
                System.out.println("No tiene ningun elemento a eliminar");
        }
        
        public void AgregarNodo(int a){
            if(bandera==0){
                n= new nodo();
                n.info = a;
                n.siguiente = null;
                r.siguiente = n;
                Primero=n;
                r=Primero;
                bandera=1;
            }else{
                r=n;
                n = new nodo();
                n.siguiente=null;
                r.siguiente=n;
                r=r.siguiente;
            }
            imprimirLista();
        }
        
        public void AgregarNodoPrimero(int a){
            nodo k = new nodo();
            k.info = a;
            k.siguiente = null;
            
            if(Primero == null){
                Primero = k;
            }else{
                k.siguiente=Primero;
                Primero = null;
                Primero = k;
            }
        }
        
        public void AgregarNodoPrimero(nodo a){
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
        
        public void concatenarLista(Lista w){
            Lista resultado = new Lista();
            nodo t= new nodo();
            t=Primero;
            while(t !=null){
                resultado.AgregarNodo(t.info);
                t=t.siguiente;
            }
            t=w.Primero;
            while(t !=null){
                resultado.AgregarNodo(t.info);
                t=t.siguiente;
            }
            Primero = resultado.Primero;
            System.out.println("Concatenacion Exitos");
        }
        
        public void imprimirLista(){
            nodo r = new nodo();
           r=Primero;
           while(r!=null)
           {
               System.out.println(r.info);
               r = r.siguiente;
           }
        }
        
        public int cantidadNodos(){
            int c=0;
            nodo r = new nodo();
            r=Primero;
            while(r!=null){
               ++c;
               r=r.siguiente;
            }
            return c;
        }
        
        public int cantidadPares(){
            int c=0;
            nodo r = new nodo();
            r=Primero;
            while(r!=null){
               if(r.Espar())
               ++c;
               r=r.siguiente;
            }
            return c; 
        }
        
        public int SumaPU(){
            int c=0;
            c= Primero.info + Ultimo();
            return c;
        }
        
        private int Ultimo(){
            nodo r = new nodo();
            r= Primero;
            while(r.siguiente!=null)
                r=r.siguiente;
            return r.info;
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
    }
        public static class nodo{
            int info;
            nodo siguiente;
            
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
            
            //ContatenarLista(Lista):Lista
            //ContatenarLista(Lista)
                //CrearListaCircular():Lista
            
        }
}