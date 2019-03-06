/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;

import javax.swing.JOptionPane;

/**
 *
 * @author lizeth
 */
public class Principal {
    public static void main(String[] args){
        
        Programa programa = new Programa(12345,"Maria","Diaz","Sistemas","Matematicas",4.5f);
        programa.mostrarDatos();
    }
}
