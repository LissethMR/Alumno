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
public class Alumno {
    protected int codAlumno;
    protected String nombre;
    protected String apellido;

    public Alumno(int codAlumno, String nombre, String apellido) {
        this.codAlumno = codAlumno;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    // Métodos Getters de los atributos de la clase alumno
    public int getCodAlumno() {
        return codAlumno;
    }

    public String getNombre() {
        return nombre;
    } 
    
    public String getApellido() {
        return apellido;
    }
}
