/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicaexamen;

import Vista.Conector;
import java.util.Date;

/**
 *
 * @author luish
 */
public class PracticaExamen {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        Conector ca = new Conector();
    
        Inscripciones in = new Inscripciones();
        Cursos c = new Cursos(1);
        Estudiantes e = new Estudiantes(1);
        in.setCursoId(c);
        in.setEstudianteId(e);
        in.setFechaInscripcion(new Date());
        ca.Insertar(in);
    
    }
    
    
    
    
}
