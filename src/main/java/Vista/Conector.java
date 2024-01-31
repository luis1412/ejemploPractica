package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Conector {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    
    private void Sesion (){
        emf = Persistence.createEntityManagerFactory("practicaExamen");
        em = emf.createEntityManager();
    }
    
    private void cerrarSesion(){
        em.close();
    }
    

    
    
         public boolean Insertar(Object objeto) {
        boolean resultado = false;
        Sesion();

        try {
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            resultado = true;
        } catch (Exception e) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            JOptionPane.showMessageDialog(null, "Error al insertar objeto: " + e.getMessage(), "ERROR", 0);
            e.printStackTrace();
        }

        cerrarSesion();
        return resultado;
    }
         

    
}
