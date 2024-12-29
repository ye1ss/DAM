package com.mycompany.faunasalvaje;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Box;
import static javax.swing.Box.createVerticalStrut;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Yeismil
 */
public class CentroRecuperacion {
    
    public static ArrayList<Animal> animales = new ArrayList<>();
    

    private static JPanel BotonesConBoxLayout() {
        //Creamos un panel
        JPanel panel= new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        
        JButton Alta= new JButton("Alta");
        JButton Tratamiento= new JButton("Tratamiento");     
        JButton Liberacion= new JButton ("Liberación");
        JButton Listado= new JButton("Listado");
        JButton Baja= new JButton("Baja");
        JButton Salir= new JButton("Salir");
        //Para salir de la aplicación al darle al botón
        Salir.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        System.exit(0); // cierra la aplicación
                }
            });
//        panel.add(Box.createHorizontalStrut(0));
        panel.add(Box.createVerticalStrut(50));
        
        panel.add(Alta);
        AltaBoton(Alta);//Esto es para poder tener el private static void de Alta
        panel.add(Tratamiento);
        panel.add(Liberacion);
        panel.add(Listado);
        ListadoBoton(Listado);
        panel.add(Baja);
        BajaBoton(Baja);
        panel.add(Salir);
        
       return panel;
    }
    //Esto se hace primero hago lo que quiero que haga el boton aqui en donde los botones y luego cojo el codigo de ese boton
    //y le doy a refactor, introduce y method.
    private static void AltaBoton(JButton Alta) {
        //Este accion listener es para poner lo que quiero que haya cuando se pulse el boton
        Alta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventanaAlta= new JFrame("ALTAS");
                ventanaAlta.setSize(350,350);
                
                //pedir los datos: tipo de animal que es ...
                JPanel panelAlta = new JPanel();
                //Agregar componentes al panelAlta aquí
                
                String[] tiposAnimal={"Ave", "Mamífero", "Reptil"};
                        
                JLabel tipAnimal= new JLabel("                                 Tipo de Animal: ");
                JComboBox tipanimal= new JComboBox(tiposAnimal);
                if (tipanimal.getSelectedItem().equals("Ave")) {
                    JLabel mlesion = new JLabel("Motivo lesión: ");
                    JTextField mlesion1 = new JTextField("", 17);
                
                }
                
                //Hacemos las etiquetas de lo que queremos registrar en el panel de alta
                JLabel nombre= new JLabel("Nombre: ");
                JTextField noombre= new JTextField("", 17);
                
                JLabel Entraada= new JLabel("Fecha de entrada: ");
                JTextField entraada= new JTextField("", 17);
                
                JLabel Especiee= new JLabel("Especie: ");
                JTextField especiee= new JTextField("", 17);
                
                JLabel Lesioon= new JLabel("Tipo de lesión: ");
                JTextField lesioon= new JTextField("", 17);
                
                JLabel Graveedad= new JLabel("Gravedad: ");
                JTextField graveedad= new JTextField("", 22);
                
                JLabel peso= new JLabel("Peso: ");
                JTextField pesoo= new JTextField("", 20);
                
                JLabel Condicion= new JLabel("Lesion por caza furtiva");
                JCheckBox CondicionCheck= new JCheckBox();
                
                JButton guardar= new JButton("Guardar");              
                guardar.addActionListener(new ActionListener() {
                
                //Esto es para guardar cada especie en la base de datos
                public void actionPerformed(ActionEvent e) {
                if (tipanimal.getSelectedItem().equals("Ave")){
                    Aves mianimal= new Aves(CondicionCheck.isSelected(), noombre.getText(), entraada.getText(), especiee.getText(), lesioon.getText(), graveedad.getText(), pesoo.getText());
                   animales.add(mianimal);   
                }else if (tipanimal.getSelectedItem().equals("Mamífero")){
                    Mamiferos mianimal= new Mamiferos(CondicionCheck.isSelected(), noombre.getText(), entraada.getText(), especiee.getText(), lesioon.getText(), graveedad.getText(), pesoo.getText());
                    animales.add(mianimal);
                }else if(tipanimal.getSelectedItem().equals("Reptil")){
                    Reptiles mianimal= new Reptiles(CondicionCheck.isSelected(), noombre.getText(), entraada.getText(), especiee.getText(), lesioon.getText(), graveedad.getText(), pesoo.getText());
                    animales.add(mianimal);
                }
                
                    }
                });
                //Esto es para que con el CheckBox podamos eleguir entre las opciones que hemos dicho
                Alta.addActionListener (new ActionListener () {
                @Override
                public void actionPerformed (ActionEvent e) {
                    }
                });
                tipanimal.addActionListener(new ActionListener () {
                @Override
                public void actionPerformed (ActionEvent e) {
                    switch (tipanimal.getSelectedIndex())
                {
                case 0 -> {
                Condicion. setText ("       Caza Furtiva");
                }
                case 1 -> {
                Condicion.setText ("        Atropello");
                }
                case 2 -> {
                Condicion.setText ("        Infeccion Bacteriana");
                }
                    }
                
                }});
                
                panelAlta.add(tipAnimal);
                panelAlta.add(tipanimal);
                panelAlta.add(nombre);
                panelAlta.add(noombre);
                panelAlta.add(Entraada);
                panelAlta.add(entraada);
                panelAlta.add(Especiee);
                panelAlta.add(especiee);
                panelAlta.add(Lesioon);
                panelAlta.add(lesioon);
                panelAlta.add(Graveedad);
                panelAlta.add(graveedad);
                panelAlta.add(peso);
                panelAlta.add(pesoo);
                panelAlta.add(Condicion);
                panelAlta.add(CondicionCheck);
                panelAlta.add(guardar);
                
                ventanaAlta.getContentPane().add(BorderLayout.CENTER, panelAlta);
                ventanaAlta.setVisible(true);
        //Para hacer el boton de ir atras
        JMenuBar menu= new JMenuBar();
        JButton atras= new JButton("Atras");
        menu.add(atras);
        
        ventanaAlta.getContentPane().add(BorderLayout.CENTER,ventanaAlta);
        ventanaAlta.getContentPane().add(BorderLayout.SOUTH,menu);
            }
        });
    }
    private static void ListadoBoton(JButton Listado) {   
       
        Listado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventanaListado = new JFrame("Listado");
                ventanaListado.setSize(650, 350);

                JPanel listar = new JPanel();
                
                
                JComboBox listanimal = new JComboBox(); 
                listanimal.setSize(50,50);
                String elementos[] = {"Aves", "Mamíferos", "Reptiles"};
                DefaultComboBoxModel model = new DefaultComboBoxModel(elementos);
                listanimal.setModel(model);
                if (listanimal.getSelectedItem().equals("Ave")) {
                    JLabel mlistado = new JLabel("Listado del Animal: ");
                    JTextField ml = new JTextField("", 17);
                }
                listar.add(listanimal);
                
                listanimal.addActionListener(new ActionListener() {  
                    
                //Esto es para que con el CheckBox podamos eleguir entre las opciones que hemos dicho        
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        DefaultListModel modelo = new DefaultListModel<>();
                        if (listar.getComponentCount()==2) listar.remove(1);
                        switch (listanimal.getSelectedIndex()) {
                            case 0 -> {
                                modelo.clear();
                                for (Animal eAnimal : animales) {
                                    if (eAnimal instanceof Aves)
                                modelo.addElement(eAnimal.toString());
                                     }
                            }
                            case 1 -> {
                                modelo.clear();
                                for (Animal eAnimal : animales) {
                                    if (eAnimal instanceof Mamiferos)
                                modelo.addElement(eAnimal.toString());
                }
                            }
                            case 2 -> {
                                modelo.clear();
                                for (Animal eAnimal : animales) {
                                    if (eAnimal instanceof Reptiles)
                                modelo.addElement(eAnimal.toString());
                }
                            }
                        }
                        JList lista = new JList(modelo);
                        
                        listar.add(lista);
                        ventanaListado.setVisible(true);
                        
                    }
                });
                        
                ventanaListado.getContentPane().add(BorderLayout.CENTER, listar);
                ventanaListado.setVisible(true);
            }
        });

    }
    //Aqui hacemos el boton para registrar los fallecimientos de los animales
    private static void BajaBoton(JButton Baja) {
        Baja.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) { 
            String name = JOptionPane.showInputDialog("Fecha de fallecimiento del animal: ");
		JOptionPane.showMessageDialog(null, "Gracias por registrar la baja. :( " );
            }
        });  
    }
    //Aqui hacemos el boton salida
    private static void panel(String text, Container container) {
        JButton buttonS = new JButton(text);
        buttonS.setAlignmentX(Component.CENTER_ALIGNMENT);
        container.add(buttonS);
    }
    private static void ventanaa(){
        //Titulo
        JMenuBar menu2= new JMenuBar();
        JLabel etiqueta= new JLabel("         CENTRO DE RECUPERACIÓN, FAUNA SALVAJE");
        menu2.add(etiqueta);
        menu2.add(createVerticalStrut(10)); // Agrega un espacio en blanco vertical
        
        //Aqui llamo lo de arriba para que aparezca dentro de ventanaa
        JPanel panelCentral= BotonesConBoxLayout();
        
        
        //Aqui hacemos la ventana y su tamaño
        JFrame ventana= new JFrame("Web CRFS");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(350,350);
        

        //Para hacer el boton de ir atras
        JMenuBar menu= new JMenuBar();
        JButton atras= new JButton("Atras");
        menu.add(atras);
        
        ventana.getContentPane().add(BorderLayout.NORTH,menu2);
        ventana.getContentPane().add(BorderLayout.CENTER,panelCentral);
        ventana.getContentPane().add(BorderLayout.SOUTH,menu);
        
        ventana.setVisible(true);
    }
    //Aqui hacemos que se ejecute todo el programa
    public static void main(String[] args) {
           javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                    ventanaa();
            }
        });
           
    }            
}        

                
        
        
    
  

