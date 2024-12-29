/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Alumno
 */
public class EjSwing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de la ventana en si
        JFrame ventana= new JFrame("Ventana de prueba");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400,400);
        
        //Creando el menu de arriba
        JMenuBar barramenu= new JMenuBar();
        JMenu menu1= new JMenu("Archivo");
        barramenu.add(menu1);
        JMenuItem menu2= new JMenuItem("Guardar como");
        menu1.add(menu2);
        //
        JPanel panel= new JPanel();
        JLabel etiqueta= new JLabel("Introducir texto");
        JTextField tf= new JTextField(10);
        JButton enviar= new JButton("Enviar");
        enviar.addActionListener(accionEnviar());
        JButton restablecer= new JButton("Restablecer");
        
        
        panel.add(etiqueta);
        panel.add(tf);
        panel.add(enviar);
        panel.add(restablecer);
        
        //
        JTextArea ta= new JTextArea();
        ta.setText("");
        //borrar lo de ta
        
        //Argregar los componentes y decir donde van
        ventana.getContentPane().add(BorderLayout.NORTH,barramenu);
        ventana.getContentPane().add(BorderLayout.SOUTH,panel);
        ventana.getContentPane().add(BorderLayout.CENTER,ta);
        ventana.setVisible(true);
        
        
    }

    private static ActionListener accionEnviar() {

        
        return null; 
    }
    
}
