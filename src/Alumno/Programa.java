/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

/**
 *
 * @author lizeth
 */
public class Programa extends Alumno {
    private String nomPrograma;
    private String nucleo;
    private float notaFinal;    
    
    // Constructor de la clase programa
    public Programa(int codAlumno, String nombre, String apellido, String nomPrograma, String nucleo, float notaFinal) {
        super(codAlumno,nombre, apellido);
        this.nomPrograma = nomPrograma;
        this.nucleo = nucleo;
        this.notaFinal = notaFinal;
    }    
    
    // Pintar datos de alumno
    public void mostrarDatos(){
        System.out.println("Codigo alumno: "+codAlumno
                +"\nNombre: "+nombre
                +"\nApellido: "+apellido
                +"\nPrograma: "+nomPrograma
                +"\nNucleo: "+nucleo
                +"\nNota final: "+notaFinal);
    }
}
