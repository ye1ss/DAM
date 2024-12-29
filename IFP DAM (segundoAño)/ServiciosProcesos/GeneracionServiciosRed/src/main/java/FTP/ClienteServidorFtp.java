/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package FTP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

/**
 *
 * @author Alumno
 */
public class ClienteServidorFtp {

    public static void main(String[] args) {
        
        FTPClient ftp = new FTPClient();

        // Datos de conexión
        String server = "192.168.1.59";
        int port = 28;
        String user = "usuario";
        String pass = "0000";

        try {
            // Conexión al servidor FTP
            ftp.connect(server, port);
            ftp.login(user, pass);
            ftp.setFileType(FTP.BINARY_FILE_TYPE);

            // Crear un nuevo directorio
            String directoryName = obtenerEntradaUsuario("Introduce el nombre del nuevo directorio: ");
            if (crearDirectorio(ftp, directoryName)) {
                // Subir un archivo al nuevo directorio
                String localFilePath = obtenerEntradaUsuario("Introduce la ruta local del archivo a subir: ");
                subirArchivo(ftp, localFilePath, directoryName);

                // Mostrar contenido del directorio después de la subida
                listarContenidoDirectorio(ftp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // Cerrar la conexión al salir
                if (ftp.isConnected()) {
                    ftp.logout();
                    ftp.disconnect();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static boolean crearDirectorio(FTPClient ftp, String directoryName) {
        try {
            return ftp.makeDirectory(directoryName);
        } catch (IOException e) {
            System.out.println("No se pudo crear el directorio: " + e.getMessage());
            return false;
        }
    }

    private static void subirArchivo(FTPClient ftp, String localFilePath, String remoteDirectory) {
        try (FileInputStream fis = new FileInputStream(new File(localFilePath))) {
            if (ftp.storeFile(remoteDirectory + "/" + new File(localFilePath).getName(), fis)) {
                System.out.println("Archivo subido con éxito.");
            } else {
                System.out.println("No se pudo subir el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al subir el archivo: " + e.getMessage());
        }
    }

    private static void listarContenidoDirectorio(FTPClient ftp) {
        try {
            String[] files = ftp.listNames();
            System.out.println("Contenido del directorio:");
            for (String file : files) {
                System.out.println(file);
            }
        } catch (IOException e) {
            System.out.println("No se pudo obtener el contenido del directorio: " + e.getMessage());
        }
    }

    //para coger el nombre de la carpeta
    private static String obtenerEntradaUsuario(String mensaje) {
        System.out.print(mensaje);
        Scanner sc= new Scanner(System.in);
        return sc.nextLine();
    }
}
        
    

