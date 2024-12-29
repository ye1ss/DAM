package org.example;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame ventana= new JFrame("FIle manager");
        ventana.setSize(750,550);
                
        JPanel panel= new JPanel();
        panel.setLayout(new GridLayout(3,3));
        
        JButton boton1= new JButton("Permisos");
        ImageIcon icono1 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton1Permisos.png");
        Image imagen1 = icono1.getImage();
        Image iconoRedimensionado1 = imagen1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono1.setImage(iconoRedimensionado1);
        boton1.setIcon(icono1);
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File f= null;
        File g= null;
        FileInputStream in= null;
        FileOutputStream out= null;
        
        String[] strs={"File1.txt", "File2.txt","File3.txt"};
        /*Vamos a crear un for para recorrer un vector(array) y utilizar los métodos del objetp File para ver si es ejecutable o no.
        Utilizamos el try y catch para capturar las excepciones que es necesario cuando utilizamos las clase file o clases de acceso a fichero*/
        try{
            for(String s:strs){
                f= new File(s);
                //Veo si el fichero file1 que he leido del vector es ejecutable o no mediante el metodo canExecute
                boolean bool= f.canExecute();
                //Miro la ruta absoluta del fichero con (getAbsolutePath)
                String b= f.getAbsolutePath();
                //Imprimo los resultados de los métodos canExecute y getAbsolutePath
                System.out.println();
                System.out.println(b);
                System.out.println();
                System.out.println("El fichero es ejecutable: "+ bool);
                int i=0;
                do{
                    i++;
                }while(i !=3);
            }
                g= new File("d:/Proyectos Oracle Java Ada/File4.txt");
        }catch(Exception a){
                    System.out.println("Fallo");
                }
            }
        });
        
        JButton boton2= new JButton("Copiar");
        ImageIcon icono2 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton2Copiar.png");
        Image imagen2 = icono2.getImage();
        Image iconoRedimensionado2 = imagen2.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono2.setImage(iconoRedimensionado2);
        boton2.setIcon(icono2);
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String origen= JOptionPane.showInputDialog(null, "Ruta del archivo de origen:");
        String destino= JOptionPane.showInputDialog(null, "Ruta del archivo de destino: ");
        
        File archivoOrigen= new File(origen);
        File archivoDestino= new File(destino);
        
        if (archivoOrigen.exists() && archivoOrigen.isFile()) {
            if (archivoDestino.exists() && archivoDestino.isFile()) {
                int opcion = JOptionPane.showConfirmDialog(null, "El archivo destino ya existe. ¿Quieres reemplazarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    realizarCopia(archivoOrigen, archivoDestino);
                    JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada.");
                }
            } else if (archivoDestino.exists() && archivoDestino.isDirectory()) {
                File archivoDestinoFinal = new File(archivoDestino, archivoOrigen.getName());
                realizarCopia(archivoOrigen, archivoDestinoFinal);
                JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
            } else {
                realizarCopia(archivoOrigen, archivoDestino);
                JOptionPane.showMessageDialog(null, "El archivo fue copiado exitosamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El archivo de origen no existe o no es válido.");
        }
    }

    private static void realizarCopia(File origen, File destino) {
        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + e.getMessage());
        }
    
            }
        });
                
        JButton boton3= new JButton("Crear Fichero");
        ImageIcon icono3 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton3Crear.png");
        Image imagen3 = icono3.getImage();
        Image iconoRedimensionado3 = imagen3.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono3.setImage(iconoRedimensionado3);
        boton3.setIcon(icono3);
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = new JFrame("Crear fichero");
        ventana.setSize(400, 300);

        // Creamos el botón
        JButton botonCrear = new JButton("Crear");

        // Añadimos el action listener al botón
        botonCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creamos el cuadro de diálogo de selección de ficheros
                JFileChooser selectorFichero = new JFileChooser();

                // Mostramos el cuadro de diálogo
                int resultado = selectorFichero.showSaveDialog(ventana);

                // Si el usuario selecciona un fichero
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    // Obtenemos el objeto File del fichero seleccionado
                    File fichero = selectorFichero.getSelectedFile();

                    // Creamos el fichero
                    try {
                        fichero.createNewFile();
                    } catch (IOException ex) {
                        System.err.println("Error al crear el fichero: " + ex.getMessage());
                    }

                    // Mostramos un mensaje de confirmación
                    JOptionPane.showMessageDialog(ventana, "Fichero creado correctamente.");
                }
            }
        });

        // Añadimos el botón a la ventana
        ventana.add(botonCrear);

        ventana.setVisible(true);
    
    } 
        });
                
        JButton boton4= new JButton("Borrar Fichero");
        ImageIcon icono4 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton4Borrar.png");
        Image imagen4 = icono4.getImage();
        Image iconoRedimensionado4 = imagen4.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono4.setImage(iconoRedimensionado4);
        boton4.setIcon(icono4);
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
        });
        
        
        JButton boton5= new JButton("Extensiones");
        ImageIcon icono5 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton5Extensiones.png");
        Image imagen5 = icono5.getImage();
        Image iconoRedimensionado5 = imagen5.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono5.setImage(iconoRedimensionado5);
        boton5.setIcon(icono5);
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileManager fileManager1= new FileManager(); //Esto es de la actividad 5
            }
        });
                
        JButton boton6= new JButton("Leer Fichero");
        ImageIcon icono6 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton6Leer.png");
        Image imagen6 = icono6.getImage();
        Image iconoRedimensionado6 = imagen6.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono6.setImage(iconoRedimensionado6);
        boton6.setIcon(icono6);
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                   JFrame ventana = new JFrame("Ficheros");

        JFileChooser selectorArchivo = new JFileChooser();
        selectorArchivo.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int resultado = selectorArchivo.showOpenDialog(ventana);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            File archivo = selectorArchivo.getSelectedFile();

            try {
                FileReader lector = new FileReader(archivo);
                JTextArea areaTexto = new JTextArea();

                int caracter;
                while ((caracter = lector.read()) != -1) {
                    areaTexto.append(Character.toString((char) caracter));
                }

                ventana.add(areaTexto);
                ventana.setSize(300, 200);
                ventana.setVisible(true);

                lector.close();
            } catch (IOException i) {
                System.out.println("Hubo un error al leer el archivo");
                i.printStackTrace();
            }
        } 
    }

    private static void realizarCopia(File origen, File destino) {
        try (FileInputStream fis = new FileInputStream(origen);
             FileOutputStream fos = new FileOutputStream(destino)) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al copiar el archivo: " + e.getMessage());
        }
    }
        
            
        });
                
        JButton boton7= new JButton("Escribir Fichero");
        ImageIcon icono7 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton7Escribir.png");
        Image imagen7 = icono7.getImage();
        Image iconoRedimensionado7 = imagen7.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono7.setImage(iconoRedimensionado7);
        boton7.setIcon(icono7);
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = new JFrame("Escribir en fichero");
        ventana.setSize(400, 300);

        // Creamos el botón
        JButton botonEscribir = new JButton("Escribir");

        // Añadimos el action listener al botón
        botonEscribir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creamos el cuadro de diálogo de selección de ficheros
                JFileChooser selectorFichero = new JFileChooser();

                // Mostramos el cuadro de diálogo
                int resultado = selectorFichero.showOpenDialog(ventana);

                // Si el usuario selecciona un fichero
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    // Obtenemos el objeto File del fichero seleccionado
                    File fichero = selectorFichero.getSelectedFile();

                    // Creamos el objeto FileOutputStream
                    try (FileOutputStream salida = new FileOutputStream(fichero)) {
                        // Obtenemos el texto del campo de texto
                        String texto = JOptionPane.showInputDialog("Introduce el texto que quieres escribir:");

                        // Escribimos en el fichero el texto que introduzca el usuario
                        salida.write(texto.getBytes());
                    } catch (IOException ex) {
                        System.err.println("Error al escribir en el fichero: " + ex.getMessage());
                    }
                }
            }
        });

        // Añadimos el botón a la ventana
        ventana.add(botonEscribir);

        ventana.setVisible(true);
            }
        });
                
        JButton boton8= new JButton("Ruta Fichero");
        ImageIcon icono8 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton8Ruta.png");
        Image imagen8 = icono8.getImage();
        Image iconoRedimensionado8 = imagen8.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono8.setImage(iconoRedimensionado8);
        boton8.setIcon(icono8);
        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = new JFrame("Abrir archivo");
        ventana.setSize(400, 300);

        // Creamos el botón
        JButton botonAbrir = new JButton("Abrir");

        // Añadimos el action listener al botón
        botonAbrir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creamos el cuadro de diálogo de selección de archivos
                JFileChooser selectorFichero = new JFileChooser();

                // Mostramos el cuadro de diálogo
                int resultado = selectorFichero.showOpenDialog(ventana);

                // Si el usuario selecciona un archivo
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    // Obtenemos el objeto File del archivo seleccionado
                    File fichero = selectorFichero.getSelectedFile();

                    // Obtenemos la ruta del archivo seleccionado
                    String rutaFichero = fichero.getAbsolutePath();

                    // Mostramos la ruta del archivo seleccionado en un mensaje de confirmación
                    JOptionPane.showMessageDialog(ventana, "La ruta del archivo seleccionado es: " + rutaFichero);
                }
            }
        });

        // Añadimos el botón a la ventana
        ventana.add(botonAbrir);

        ventana.setVisible(true);
            }
        });
                
        JButton boton9= new JButton("Listado Directorio");
        ImageIcon icono9 = new ImageIcon("C:\\DEVELOPER\\IFP\\AccesoDatos\\ActividadFinal\\boton9Listado.png");
        Image imagen9 = icono9.getImage();
        Image iconoRedimensionado9 = imagen9.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icono9.setImage(iconoRedimensionado9);
        boton9.setIcon(icono9);
        boton9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame ventana = new JFrame("Listado de directorios");
        ventana.setSize(400, 300);

        // Creamos el botón
        JButton botonListar = new JButton("Listar");

        // Añadimos el action listener al botón
        botonListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Creamos el cuadro de diálogo de selección de archivos
                JFileChooser selectorDirectorios = new JFileChooser();

                // Establecemos el modo de selección en DIRECTORIES_ONLY
                selectorDirectorios.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                // Mostramos el cuadro de diálogo
                int resultado = selectorDirectorios.showOpenDialog(ventana);

                // Si el usuario selecciona un directorio
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    // Obtenemos el objeto File del directorio seleccionado
                    File directorio = selectorDirectorios.getSelectedFile();

                    // Obtenemos la lista de directorios del directorio seleccionado
                    File[] listaDirectorios = directorio.listFiles();

                    // Recorremos la lista de directorios
                    for (File directorioActual : listaDirectorios) {
                        // Mostramos el directorio en un mensaje de confirmación
                        JOptionPane.showMessageDialog(ventana, directorioActual.getName());
                    }
                }
            }
        });

        // Añadimos el botón a la ventana
        ventana.add(botonListar);

        ventana.setVisible(true);
            }
        });
        
        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);
        panel.add(boton4);
        panel.add(boton5);
        panel.add(boton6);
        panel.add(boton7);
        panel.add(boton8);
        panel.add(boton9);
        ventana.add(panel);
        ventana.setVisible(true);
    }
    //ESTO DE ABAJO ES LA ACTIVIDAD5
        public static class FileManager {

        private JFrame frame;
        private JLabel label;
        private JButton button1;
        private JButton button2;
    
        public FileManager() {
            frame = new JFrame("Archivos y Directorios");
            
            

            label = new JLabel("Seleccione una opción");
            button1 = new JButton("1. Directorio");
            button2 = new JButton("2. Archivos");

            button1.addActionListener(e -> showDirectories());
            button2.addActionListener(e -> showFiles());

            frame.add(label, BorderLayout.NORTH);
            frame.add(button1, BorderLayout.CENTER);
            frame.add(button2, BorderLayout.SOUTH);
            
            frame.pack();
            frame.setSize(300,100);
            frame.setVisible(true);
        }
    
        private void showDirectories() {
            // Solicitamos el directorio al usuario
            String directorio = JOptionPane.showInputDialog("Introduce el directorio");

            // Creamos un objeto File para el directorio
            File dir = new File(directorio);

            // Obtenemos una lista de los archivos y directorios del directorio
            List<File> files = Arrays.asList(dir.listFiles());

            // Mostramos la lista de archivos y directorios
            label.setText("Archivos y directorios del directorio: " + directorio);
            for (File file : files) {
                label.setText(label.getText() + "\n" + file.getName());
            }
            JOptionPane.showMessageDialog(frame, label.toString(), "Lista de archivos y directorios", JOptionPane.INFORMATION_MESSAGE);
        }

        private void showFiles() {
            // Solicitamos el directorio al usuario
            String directorio = JOptionPane.showInputDialog("Introduce el directorio");

            // Solicitamos la extensión al usuario
            String extension = JOptionPane.showInputDialog("Introduce la extensión");

            // Creamos un objeto File para el directorio
            File dir = new File(directorio);

            // Obtenemos una lista de los archivos del directorio
            List<File> files = Arrays.asList(dir.listFiles());

            // Filtramos la lista para obtener solo los archivos con la extensión solicitada
            List<File> filteredFiles = files.stream()
                    .filter(file -> file.getName().endsWith(extension))
                    .toList();

            // Mostramos la lista de archivos
            label.setText("Archivos del directorio con la extensión " + extension + ":");
            for (File file : filteredFiles) {
                label.setText(label.getText() + "\n" + file.getName());
            }
            JOptionPane.showMessageDialog(frame, label.toString(), "Lista de archivos ", JOptionPane.INFORMATION_MESSAGE);

        }
        
    }
}