
package clase05.pkg05.pkg2022;

public class Clase05052022 {

    
    public static void main(String[] args) {
    Cola p = new Cola();
    Cola b= new Cola();
    b.Primero=p.Primero;
    p.insert(13);
    p.insert(14);
    p.insert(15);
    p.insert(16);
    p.ActualizarFront();
    p.ActualizarRear();
        System.out.println("Front es " + p.front);
        System.out.println("Rear es " + p.rear);
    nodo dato= new nodo();

        b.Primero=p.Primero;
      
        while(!p.EstaVacia()){
            dato=p.remove();
            System.out.println(dato.info);
        }
//    int par=0, ban=1, impar=0;
//    while(!p.EstaVacia()){
//        dato=p.remove();
//        if(dato.Espar() && ban==1){
//            par=dato.info;
//            ban=0;
//        }
//        if(!dato.Espar()){
//            impar=dato.info;
//        }
//    }
//    System.out.println("La suma es "+ (par + impar));
}


public static class Cola{
    nodo Primero;
   private int bandera=0;
   private nodo Ultimo = new nodo();
   private nodo n = new nodo();
   private nodo r = new nodo(); 
   public  int longitud;
   public int rear;
   public int front;
   
   private void ActualizarFront(){
       front=Stackfront();
   }
   
   public int Stackfront(){
       nodo T= new nodo();
       T=Primero;
       while(T.anterior!=null){
           T=T.anterior;
       }
       return T.info;
   }
   private void ActualizarRear(){
        rear=STACKTOP();
        }
   
   public int STACKTOP(){
            nodo T = new nodo();
            T=Primero;
            while(T.siguiente != null){
            T = T.siguiente;
            }
            return T.info;
    }

   Cola(){
       longitud=0;
   }
    public void insert(int a){
      if(bandera==0)
        {
        n = new nodo(); // Creamos un nuevo nodo
        n.info = a;
        n.siguiente = null; 
        r.siguiente = n;
        Primero=n;
        r= Primero;   
        bandera =1;
        ++longitud;
        }else{
            r=n;
            n = new nodo(); // Creamos un nuevo nodo
            ++longitud;
            n.info = a;
            n.siguiente = null; 
            r.siguiente = n;
            r= r.siguiente;         
         }   
   }
    public nodo remove(){
     nodo T = new nodo();
       if(Primero != null)
       {
                 T=Primero;
                 Primero = Primero.siguiente; // el nuevo primero
                 --longitud;
                 return T;
       }   

       else
       {
           System.out.println("No tiene ningun elemento a eliminar");
               return null;
       }
//           return null;
   }

   public boolean EstaVacia(){
       if(Primero == null|| longitud == 0)
       {
           return true;
       }else
       {
           return false;
       }
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
