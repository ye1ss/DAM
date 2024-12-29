/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package FTP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Alumno
 */
public class Practica3ClienteFTP {

    public static void main(String[] args) {

        FTPClient ftp = new FTPClient();

        String direccionServidor = JOptionPane.showInputDialog(null, "Inroduce la dirección del servidor: ");// es mi ip
        // " *** "

        String usuario = JOptionPane.showInputDialog(null, "Usuario: "); // el usuario es "usuario"
        String contraseña = JOptionPane.showInputDialog(null, "Contraseña: "); // la contraseña es "0000"

        int port = 21;

        // conectarme al servidor ftp
        try {

            ftp.connect(direccionServidor, port); // nos conectamos
            ftp.login(usuario, contraseña); // nos logueamos
            boolean login = ftp.login(usuario, contraseña);

            if (login) {

                JOptionPane.showMessageDialog(null, "Conexion realizada con éxito");

                JFrame ventana = new JFrame("Conexion FTP");
                ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                ventana.setSize(500, 280);
                JPanel panel = new JPanel();

                // BOTON 1
                JButton boton1 = new JButton("Descargar Fichero");
                boton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("Seleccionar ubicación de descarga");
                        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

                        int userSelection = fileChooser.showSaveDialog(null);

                        if (userSelection == JFileChooser.APPROVE_OPTION) {
                            String downloadPath = fileChooser.getSelectedFile().getAbsolutePath();

                            String fileName = JOptionPane.showInputDialog(null,
                                    "Introduce el nombre del archivo a descargar: ");

                            try {
                                boolean success = ftp.retrieveFile(fileName,
                                        new FileOutputStream(downloadPath + "/" + fileName));
                                if (success) {
                                    JOptionPane.showMessageDialog(null, "Fichero descargado correctamente.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al intentar descargar el fichero.");
                                }
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,
                                        "Error al descargar el fichero: " + ex.getMessage());
                            }
                        }
                    }
                });

                // BOTON 2
                JButton boton2 = new JButton("Subir Fichero");
                //
                boton1.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setDialogTitle("Seleccionar archivo para subir");
                        int userSelection = fileChooser.showOpenDialog(null);

                        if (userSelection == JFileChooser.APPROVE_OPTION) {
                            File fileToUpload = fileChooser.getSelectedFile();
                            String fileName = fileToUpload.getName();

                            try (FileInputStream inputStream = new FileInputStream(fileToUpload)) {
                                boolean success = ftp.storeFile(fileName, inputStream);
                                if (success) {
                                    JOptionPane.showMessageDialog(null, "Archivo subido correctamente.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Error al intentar subir el archivo.");
                                }
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null, "Error al subir el archivo: " + ex.getMessage());
                            }
                        }
                    }
                });

                // BOTON 3
                JButton boton3 = new JButton("Borrar Fichero");
                boton3.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String eliminarFichero = JOptionPane.showInputDialog(null, "Fichero que deseas eliminar:");
                        try {
                            // ftp.deleteFile(eliminarFichero);
                            boolean sucess = ftp.deleteFile(eliminarFichero);
                            if (sucess) {
                                JOptionPane.showMessageDialog(null, "Fichero borrado correctamente.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al intenar borrar el fichero.");
                            }
                        } catch (IOException a) {
                            a.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al borrar el fichero: " + a.getMessage());

                        }
                    }
                });

                // BOTON 4
                JButton boton4 = new JButton("Crear Carpeta");
                boton4.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nombreCarpeta = JOptionPane.showInputDialog(null,
                                "Introduce el nombre de la carpeta a crear:");

                        try {
                            boolean success = ftp.makeDirectory(nombreCarpeta);
                            if (success) {
                                JOptionPane.showMessageDialog(null, "Carpeta creada correctamente.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al intentar crear la carpeta.");
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al crear la carpeta: " + ex.getMessage());
                        }
                    }
                });

                // BOTON 5
                JButton boton5 = new JButton("Borrar Carpeta");
                boton5.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nombreCarpeta = JOptionPane.showInputDialog(null,
                                "Introduce el nombre de la carpeta a borrar:");

                        try {
                            boolean success = ftp.removeDirectory(nombreCarpeta);
                            if (success) {
                                JOptionPane.showMessageDialog(null, "Carpeta borrada correctamente.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al intentar borrar la carpeta.");
                            }
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null, "Error al borrar la carpeta: " + ex.getMessage());
                        }
                    }
                });

                // BOTON 6
                JButton boton6 = new JButton("Desconectar del Servidor");
                boton6.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            ftp.logout();
                            ftp.disconnect();
                            JOptionPane.showMessageDialog(null, "Desconexión del servidor FTP exitosa.");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                            JOptionPane.showMessageDialog(null,
                                    "Error al desconectar del servidor FTP: " + ex.getMessage());
                        }
                    }
                });

                // BOTON 7
                JButton boton7 = new JButton("Salir de la Aplicacion");
                boton7.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int confirmacion = JOptionPane.showConfirmDialog(null,
                                "¿Estás seguro de que deseas salir de la aplicación?", "Salir de la Aplicación",
                                JOptionPane.YES_NO_OPTION);

                        if (confirmacion == JOptionPane.YES_OPTION) {
                            try {
                                ftp.logout();
                                ftp.disconnect();
                            } catch (IOException ex) {
                                ex.printStackTrace();
                                JOptionPane.showMessageDialog(null,
                                        "Error al desconectar del servidor FTP: " + ex.getMessage());
                            }
                            System.exit(0);
                        }
                    }
                });

                panel.add(boton1);
                panel.add(boton2);
                panel.add(boton3);
                panel.add(boton4);
                panel.add(boton5);
                panel.add(boton6);
                panel.add(boton7);

                // utilizar el componente boxLayout
                panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
                ventana.getContentPane().add(panel);
                ventana.pack();
                ventana.setVisible(true);

            } else {
                // Si la conexion no es correcta
                System.out.println("La conexion al servidor no es correcta.");
                JOptionPane.showMessageDialog(null, "La conexión al servidor no es correcta.");
                ftp.disconnect();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }

    }
}
