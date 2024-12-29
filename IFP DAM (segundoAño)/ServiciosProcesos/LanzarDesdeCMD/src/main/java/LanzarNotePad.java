/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Alumno
 */
public class LanzarNotePad {
//Abrir el notepad desde aqui
    public static void main(String[] args) throws IOException {
        
        //He puesto que abra note pad pero todo lo q se pueda abrir asi desde la cmd tmbien se pude abrir aqui
        ProcessBuilder pb= new ProcessBuilder("notepad");
        pb.start();
        
        
        }
    }

