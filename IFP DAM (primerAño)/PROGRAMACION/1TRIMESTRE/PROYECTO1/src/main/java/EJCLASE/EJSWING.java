/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package EJCLASE;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Alumno
 */
public class EJSWING {

public static void main(String[] args) {
 
    JFrame ventana= new JFrame("Mi primera ventana");
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setSize(300,300);
    ventana.setBounds(60,50,500,600);
    ventana.setTitle("CALCULADORA PRUEBA");
    ventana.setResizable(false);
    
    
        //PARA PONER IMAGEN EN LA ESQUINA DE LO Q ESETE HACIENDO
        //Toolkit mipantalla=Toolkit.getDefaultToolkit();
        //Image icono= mipantalla.getImage ("src/imagenes/gokupixel.png");
        //ventana.setIconImage(icono);
        
    
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
    
    //Creando el panel en la parte inferor agregando componentes
    JPanel panel= new JPanel();
    JLabel etiqueta= new JLabel(" ");
    JTextField tf= new JTextField(10);
    JButton enviar= new JButton("=");
    
    //creando otro panel para los números
    JPanel panel2=new JPanel();
    JButton uno= new JButton("1");
    JButton dos= new JButton("2");
    JButton tres= new JButton("3");
    JButton suma= new JButton("+");
    JButton cuatro= new JButton("4");
    JButton cinco= new JButton("5");
    JButton seis= new JButton("6");
    JButton resta= new JButton("-");
    JButton siete= new JButton("7");
    JButton ocho= new JButton("8");
    JButton nueve= new JButton("9");
    JButton cero= new JButton("0");
    
    panel2.add(uno);
    panel2.add(dos);
    panel2.add(tres);
    panel2.add(cuatro);
    panel2.add(cinco);
    panel2.add(seis);
    panel2.add(siete);
    panel2.add(ocho);
    panel2.add(nueve);
    panel2.add(cero);
    panel2.add(suma);
    panel2.add(resta);
    panel2.setLayout(new GridLayout(4, 3, 0, 0));
    
    //creando el boton enviar y su tamaño
    
    enviar.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            System.out.println ("Has pulsado el boton enviar");
        }
    });
    
    enviar.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        System.out.println ("Has pulsado el boton");
    }});
    JButton salir= new JButton ("Salir");
    salir.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        System.out.println("Se acaba el programa");
        System.exit(0);
    }});
      
            
    JButton restablecer= new JButton("Borrar");
    panel.add(etiqueta);
    panel.add(etiqueta);
    panel.add(tf);
    // tf.
    //panel.add(enviar);
    panel.add(restablecer);
    panel.add(salir);
    
  //Área de texto en el centro
  JTextArea ta= new JTextArea();
  
  //Agregar componentes al marco
  ventana.getContentPane().add(BorderLayout.SOUTH, panel);
  ventana.getContentPane().add(BorderLayout.NORTH, barraMenu);
  ventana.getContentPane().add(BorderLayout.CENTER, panel2);
  //ventana.getContentPane().add(BorderLayout.WEST,);
  ventana.setVisible(true);
  
  
}
}
 


