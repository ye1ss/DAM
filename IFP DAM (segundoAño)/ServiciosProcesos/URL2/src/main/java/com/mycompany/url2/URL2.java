/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.url2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.net.URL;

/**
 *
 * @author Alumno
 */
public class URL2 {

    public static void main(String[] args) throws IOException {
        URL url = null;
        try {
            url = new URL("https://www.playstation.com/es-es/ps5/");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in;
        try {
            InputStream inputStream = url.openStream();
            in =new BufferedReader(new InputStreamReader(inputStream));
            String inputLine;
            while ((inputLine = in.readLine())!= null) {
                 System.out.println(inputLine);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}