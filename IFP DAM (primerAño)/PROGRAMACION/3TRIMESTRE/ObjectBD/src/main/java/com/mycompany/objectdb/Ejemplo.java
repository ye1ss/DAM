/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.objectdb;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Alumno
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("$objectdb/db/point.odb");
        EntityManager em= emf.createEntityManager();
        try{
           em.getTransaction().begin();
           Query query1= em.createQuery("SELECT COUNT(p) FROM Point p");
           System.out.println("Puntos totales: "+ query1.getSingleResult());
           
           Query Query2= em.createNamedQuery("Point.buscar8");  
            List<Point>resultados= query2.getResultList();
            Point point;
            for(int i= 0; i< resultados.size(); i++){
                point= resultados.get(i);
                System.out.println(point.getY());
            }
            System.out.println("Añadido un nuevo punto a la BD");
            point= new Point(20, 20);
            
        }
    } 
}
