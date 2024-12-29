/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objectdb;

import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Alumno
 */
public class ObjectDB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Añadir puntos: añade 100 puntos a la BD");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("$object/db/point.odb");
        EntityManager em= emf.createEntityManager();
        try {
            em.getTransaction().begin();
            for(int i= 1; i<=100; i++){
                Point point= new Point(i, i);
                em.persist(point);
            }
            em.getTransaction().commit();
            Query q1= em.createQuery("SELECT COUNT(p) FROM Point p");
            System.out.println("Puntos totales: " + q1.getStringResult());
            
            
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
            em.close();
            emf.close();
        }
    }
}