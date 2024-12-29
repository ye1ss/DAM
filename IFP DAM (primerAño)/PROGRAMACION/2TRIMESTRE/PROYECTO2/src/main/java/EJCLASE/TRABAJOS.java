/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package EJCLASE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author yeism
 */
public class TRABAJOS {

static String[] menu={"Crear ", "Leer ", "Escribir ", "Salir"};
    
public static void main(String[] args) {

int opcion;
while(true){
opcion =JOptionPane.showOptionDialog(null, "Elije opción", "Ficheros", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu, menu[0]);
    switch (opcion){
        case 0:
            crear();
            break;
        case 1:
            leer();
            break;
        case 2:
            escribir();
            break;
        case 3:
            //salir();
            System.out.println("Has salido de la gestión de ficheros");
            System.exit(0);
            break;
        }
    }
}
        private static void crear(){
         JFileChooser fc =new JFileChooser();
           int result = fc.showSaveDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                 File file = fc.getSelectedFile();
             try {
                 if (file.createNewFile()) {
                     System.out.println("!Archivo creado!");
             } else {
                     System.out.println("Este archivo ya existe");
             }
                } catch (IOException e) {
                         e.printStackTrace();
                    }
                }
            }    
        private static void leer(){
          JFileChooser fC = new JFileChooser();
            if (fC.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                File fl = fC.getSelectedFile();
                StringBuilder fileContents = new StringBuilder();
                try (BufferedReader reader = new BufferedReader(new FileReader(fl))) {
                    String line = null;
                        while ((line = reader.readLine()) != null) {
                             fileContents.append(line).append("\n");
                              }
                                    }   catch (Exception e) {
                                // Muestra mensaje de problrma si hay error
                                        }
                                            JTextArea textArea = new JTextArea(fileContents.toString());
                                            textArea.setEditable(false);
                                            JOptionPane.showMessageDialog(null, new JScrollPane(textArea));
        }          
    }   
        
        private static void escribir(){
           JFileChooser fC = new JFileChooser();
                if (fC.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
                  File fl = fC.getSelectedFile();
                  StringBuilder fileContents = new StringBuilder();
                  try (BufferedReader reader = new BufferedReader(new FileReader(fl))) {
                      String line = null;
                      while ((line = reader.readLine()) != null) {
                         fileContents.append(line).append("\n");
                        }
                         } catch (Exception e) {
                             System.out.println("Error");
                        }
                            JTextArea textArea = new JTextArea(fileContents.toString());
                            textArea.setEditable(true);
                            int result = JOptionPane.showConfirmDialog(null, new JScrollPane(textArea), "Editar archivo", JOptionPane.OK_CANCEL_OPTION);
                            if (result == JOptionPane.OK_OPTION) {
                                try (BufferedWriter writer = new BufferedWriter(new FileWriter(fl))) {
                                    writer.write(textArea.getText());
                                        } catch (Exception e) {
                                                }
                  }
               }      
            }
}
