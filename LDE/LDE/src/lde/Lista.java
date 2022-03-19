/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lde;

import javax.swing.JOptionPane;
/**
 *
 * @author USUARIO
 */
public class Lista {
    private NodoDoble inicio, fin;
    public Lista(){
        inicio = fin = null;
    }
    
    public boolean estVacia(){
        return inicio == null;
    }
    
    public void agregarFinal(int el){
        if(!estVacia()){
            fin = new NodoDoble(el, null, fin);
            fin.anterior.siguinte = fin;
        }else{
            inicio = fin = new NodoDoble(el); 
        }
    }
    
    public void agregarInicio(int el){
        if(!estVacia()){
            inicio = new NodoDoble(el, inicio, null);
            inicio.siguinte.anterior = inicio;
        }else{
            inicio = fin = new NodoDoble(el);
        }
    }
    
    public void mostrarInicioFin(){
        if(!estVacia()){
            String datos = "<=>";
            NodoDoble aux  = inicio;
            while(aux != null){
                 datos = datos + "["+ aux.dato+"]<=>";
                 aux = aux.siguinte;
            }
            JOptionPane.showMessageDialog(null,datos, "mostrando lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void hallarMenorPar(int men){
        int bandera = 0;
        if(!estVacia()){
            NodoDoble aux = inicio;
            while(aux != null){
                if(bandera == 0){
                    if(aux.dato % 2 == 0){
                        men = aux.dato;
                        bandera = 1;
                    }
                }
            }
        }
    }
    
    public void crearListaCircular(){
        
    }
}
