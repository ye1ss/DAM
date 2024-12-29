/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author Alumno
 */
public class Swing1eva {

    /**
     * @param args the command line arguments
     */

    public static void main(String args[]) {

        // Creando el Marco/Ventana        
        JFrame frame = new JFrame("Mi programa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setVisible(true);
        // Creando MenuBar y agregando componentes   
        JMenuBar barraMenu = new JMenuBar();
        JMenu menu1 = new JMenu("Archivo");
        JMenu menu2 = new JMenu("Ayuda");
        barraMenu.add(menu1);
        barraMenu.add(menu2);
        JMenuItem m11 = new JMenuItem("Abrir");
        JMenuItem m22 = new JMenuItem("Guardar como");
        menu1.add(m11);
        menu1.add(m22);

        // Creando el panel en la parte inferior y agregando componentes       
        JPanel panel = new JPanel(); // el panel no estÃ¡ visible en la salida      
        JLabel etiqueta = new JLabel("Introducir texto");
        JTextField tf = new JTextField(10); // acepta hasta 10 caracteres        
        JButton enviar = new JButton("Enviar");
        enviar.addActionListener(accionEnviar());
        JButton borrar = new JButton("Borrar");
        
        panel.add(etiqueta); // Componentes agregados usando Flow Layout     
        panel.add(etiqueta);     
        panel.add(tf);
        panel.add(enviar);
        panel.add(borrar);

        // Ãrea de texto en el centro    
        JTextArea ta = new JTextArea();
        ta.setText("");
//        borrar.addActionListener(accionBorrar(ta));
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                 ta.setText("");
                 tf.setText("");
            }
            });
        // Agregar componentes al marco si quiero otros tipos buscar lo del layout
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, barraMenu);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true);
    }
    //Esto es lo del boton de enviar
    private static ActionListener accionEnviar () {
       return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                 JOptionPane.showMessageDialog(null,
                                        "ENVIADO", "",
                                        JOptionPane.INFORMATION_MESSAGE);
            }
            
            };
    }
    private static void accionm11(){
        System.out.println("");
    }
//     private static ActionListener accionBorrar (JTextArea ta) {
//       return new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) { 
//                 ta.setText("");
//            }
//            
//            };
//    }
}
    

