/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dvdstoreadmin2;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Alumno
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Cargar la configuración de Hibernate desde hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = (SessionFactory) configuration.buildSessionFactory();
        } catch (Exception ex) {
            // Manejo de excepciones en caso de error
            ex.printStackTrace();
            throw new ExceptionInInitializerError("Error al inicializar Hibernate: " + ex.getMessage());
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
