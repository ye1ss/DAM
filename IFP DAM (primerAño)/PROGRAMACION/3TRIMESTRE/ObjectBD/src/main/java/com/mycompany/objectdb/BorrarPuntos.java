/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objectdb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Alumno
 */
public class BorrarPuntos {

    public static void main(String[] args) {
        System.out.println("Borrar puntos: Borra 10 puntos de la BD");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("$object/db/point.odb");
        EntityManager em= emf.createEntityManager();
        try{
            em.getTransaction().begin();
            TypedQuery<Point> query= em.createQuery("SELECT p FROM Point p", Point.class);
            List<Point> results= query.getResultList();
            Point point;
            for(int i= 1; 1<= 10; i ++){
                point= results.get(i);
                em.remove(point);
            }
            em.getTransaction().commit();
            
            
        }catch (Exception ex){
            
        }finally{
            emf.close();
        }
    }
    
}
