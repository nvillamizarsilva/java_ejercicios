/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.herencia;

/**
 *
 * @author nvill
 */
public class estudiante extends persona  {
        private int codigo_estudiante;
        private float nota_estudiante;
        
        public estudiante(String nombre, String apellido, int edad, int codigo_estudiante, float nota_estudiante){
        super(nombre, apellido, edad);
        this.codigo_estudiante= codigo_estudiante;
        this.nota_estudiante=nota_estudiante;
        
        }
    public void mostrar_datos(){
 
    }
}
