/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conectandoconbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class ConectandoConBDD {

    public static void main(String[] args) {
        
        // Librería de MySQL
        public String driver = "com.mysql.jdbc.Driver";
        // Nombre de usuario
        public String username = "root";
        // Clave de usuario
        public String password = "";
        
        

        // Nombre de la base de datos
        public String database = "databaseSakila";

        // Host
        public String hostname = "localhost";

        // Puerto
        public String port = "3306";

        // Ruta de nuestra base de datos (desactivamos el uso de SSL con "?useSSL=false")
        public String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false";

        

        

        public Connection conectarMySQL() {
            Connection conn = null;

            try {
                Class.forName(driver);
                conn = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            return conn;
        }

    }
}
