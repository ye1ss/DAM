/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjerciciosClasee;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author Alumno
 */
public class GestionFichero1 {

    public static void main(String[] args) {
    JFrame ventana= new JFrame("Gestion Fichero");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(300,300);
    ventana.setBounds(60,50,700,600);
    ventana.setTitle("Gestión Fichero");
    ventana.setResizable(false);
       
    
    //Creando MenuBar y agregando componentes
    JMenuBar barraMenu= new JMenuBar();
    JMenu menu1= new JMenu ("Archivo");
    JMenu menu2=new JMenu ("Ayuda");
    barraMenu.add(menu1);
    barraMenu.add(menu2);
    JMenuItem m11= new JMenuItem("Abrir");
    JMenuItem m22= new JMenuItem("Guardar como");
    menu1.add(m11);    
    menu1.add(m22);
    
    JPanel panel=new JPanel();
    JButton Crear=new JButton("Crear");
    JButton Leer=new JButton("Leer");
    JButton Escribir=new JButton("Escribir");
    JButton Salir=new JButton("Salir");
    
    panel.add(Crear);
    panel.add(Leer);
    panel.add(Escribir);
    panel.add(Salir);
    
    
    
    //Agregar componentes al marco
    ventana.getContentPane().add(BorderLayout.CENTER, panel);
    ventana.getContentPane().add(BorderLayout.NORTH, barraMenu);
    ventana.setVisible(true);
    }
}
