/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Yeismil P
 */
public class Actividad8 {

    public static void main(String[] args) {
    JFrame ventana = new JFrame("Gestor de borrado de archivos/directorio");

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());

    JButton boton1 = new JButton("Brorrar archivo");
    boton1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ruta= JOptionPane.showInputDialog(null, "Introduce la ruta del archivo: ");
            File archivo= new File(ruta);
            
            if(!archivo.isFile()){
            JOptionPane.showMessageDialog(null, "No ha introducido correctamente un archivo","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                archivo.delete();
                JOptionPane.showMessageDialog(null,"El archivo se ha eliminado");
            }
        }
    });

    JButton boton2 = new JButton("Brorrar directorio");
    boton2.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String ruta= JOptionPane.showInputDialog(null, "Introduce la ruta del directorio: ");
            File directorio= new File(ruta);
            
            if(!directorio.isFile()){
            JOptionPane.showMessageDialog(null, "No ha introducido correctamente un directorio","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                directorio.delete();
                JOptionPane.showMessageDialog(null,"El directorio se ha eliminado");
            }
        }
    });

    panel.add(boton1);
    panel.add(boton2);

    ventana.add(panel);
    ventana.setSize(300, 200);
    ventana.setVisible(true);
}

}
