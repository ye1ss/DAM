/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadgaraje;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yeismil
 */
//cambiar en el pom el compiler, en casa es 17 en clase 19
public class ActividadGaraje {

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Garaje");
        ventana.setSize(600, 600);
        ventana.setResizable(false);

        // Crear un JLabel para mostrar la imagen
        ImageIcon imageIcon = new ImageIcon("D:\\YeismilIFP\\1Trimestre\\AccesoDatos\\ActividadGaraje\\imgGaraje.jpg");
        JLabel imageLabel = new JLabel(imageIcon);

        // Panel para la imagen
        JPanel panelImagen = new JPanel();
        panelImagen.add(imageLabel);

        JMenuBar barraArriba = new JMenuBar();
        JMenu menu = new JMenu("Opciones P1");
        JMenu menu2 = new JMenu("Opcion P2");
        //JMenu menu2 = new JMenu("Opción 2");

        JMenuItem opcion1 = new JMenuItem("Usuario del Seat Ibiza");
        JMenuItem opcion2 = new JMenuItem("Número de coches y modelo de Jonas");
        JMenuItem opcion3 = new JMenuItem("Plazas libres");

        menu.add(opcion1);
        menu.add(opcion2);
        menu2.add(opcion3);
        barraArriba.add(menu);
        barraArriba.add(menu2);

        // Añadir el botón al JFrame
        JButton btnIntroducirCoche = new JButton("Introducir Coche         ");
        btnIntroducirCoche.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para introducir un nuevo coche
                introducirNuevoCoche();
            }
        });

        // Añadir el botón al JFrame
        JButton btnIntroducirUsuario = new JButton("Introducir Usuario      ");
        btnIntroducirUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para introducir un nuevo coche
                btnIntroducirUsuario();
            }
        });

        // Añadir el botón al JFrame
        JButton btnMuestraPlazaGaraje = new JButton("Mostrar Plaza Garaje");
        btnMuestraPlazaGaraje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para introducir un nuevo coche
                //btnMuestraPlazaGaraje();          ARREGLAR ESTE BOTON
            }
        });
        
        JButton mostrarUsuariosDelGaraje = new JButton("Usuarios del garaje   ");
        mostrarUsuariosDelGaraje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarUsuariosDelGaraje();
                
            }
        });
        
        JButton mostrarPlazasDelGaraje = new JButton("Plazas del garaje       ");
        mostrarPlazasDelGaraje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarPlazasDelGaraje();
            }
        });

        // Panel para los botones
        JPanel panelBoton = new JPanel();
        panelBoton.setLayout(new BoxLayout(panelBoton, BoxLayout.Y_AXIS));

        // Obtener el ancho máximo entre los botones
        int maxWidth = Math.max(btnMuestraPlazaGaraje.getPreferredSize().width, btnMuestraPlazaGaraje.getPreferredSize().width);

        // Establecer el mismo ancho para ambos botones
        Dimension buttonSize = new Dimension(maxWidth, btnMuestraPlazaGaraje.getPreferredSize().height);
        btnIntroducirCoche.setPreferredSize(buttonSize);
        btnIntroducirUsuario.setPreferredSize(buttonSize);
        btnMuestraPlazaGaraje.setPreferredSize(buttonSize);
        

        panelBoton.add(btnIntroducirCoche);
        panelBoton.add(btnIntroducirUsuario);
        panelBoton.add(btnMuestraPlazaGaraje);
        panelBoton.add(mostrarUsuariosDelGaraje);
        panelBoton.add(mostrarPlazasDelGaraje);
        
        // Panel principal con BorderLayout
        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelImagen, BorderLayout.CENTER);

        // Panel lateral con GridLayout para los botones
        JPanel panelLateral = new JPanel(new GridLayout(2, 1));
        panelLateral.add(panelBoton);

        panelPrincipal.add(panelLateral, BorderLayout.EAST);

        ventana.add(panelPrincipal);
        ventana.getContentPane().add(BorderLayout.NORTH, barraArriba);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

        //Nos conectamos a la base de datos para hacer las consultas y que salgan en el menu
        String url = "jdbc:mysql://localhost:3306/garaje"; //en casa es 3307
        String usuario = "root";
        String contraseña = ""; //en casa la contraseña es root

        //Accion de opcion1
        opcion1.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Connection conexion = null;
                Statement sentencia = null;

                try {
                    conexion = DriverManager.getConnection(url, usuario, contraseña);
                    sentencia = conexion.createStatement();

                    if (conexion != null) {
                        System.out.println("Conexión correcta a la base de datos");
                        // Realizar consultas u otras operaciones con la base de datos aquí
                        String consulta = "select Nombre, Apellidos from Usuarios where Numero_Coche= 1";
                        ResultSet resultado = sentencia.executeQuery(consulta);

                        // Procesar los resultados (esto es solo un ejemplo)
                        StringBuilder mensaje = new StringBuilder("Nombre y apellido del Seat Ibiza:\n");
                        while (resultado.next()) {
                            String nombre = resultado.getString("Nombre");
                            String apellidos = resultado.getString("Apellidos");
                            mensaje.append(" ").append(nombre).append(" ").append(apellidos).append("\n");
                        }
                        // Mostrar el mensaje en un JOptionPane
                        JOptionPane.showMessageDialog(ventana, mensaje.toString(), "Resultados de la consulta", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (SQLException i) {
                    System.out.println("Error al intentar conectar con la base de datos");
                    i.printStackTrace();
                } finally {
                    try {
                        if (sentencia != null) {
                            sentencia.close();
                        }
                        if (conexion != null) {
                            conexion.close();
                        }
                    } catch (SQLException i) {
                        i.printStackTrace();
                    }
                }
            }
        });

        //Accion de opcion2
        opcion2.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Connection conexion = null;
                Statement sentencia = null;

                try {
                    conexion = DriverManager.getConnection(url, usuario, contraseña);
                    sentencia = conexion.createStatement();

                    if (conexion != null) {
                        System.out.println("Conexión correcta a la base de datos");
                        // Realizar consultas u otras operaciones con la base de datos aquí
                        String consulta = "select Numero_Coche, Modelo from Coches where Numero_Coche= 3";
                        ResultSet resultado = sentencia.executeQuery(consulta);

                        // Procesar los resultados (esto es solo un ejemplo)
                        StringBuilder mensaje = new StringBuilder("Número de coche y modelo de Jonas:\n");
                        while (resultado.next()) {
                            String numeroCoche = resultado.getString("Numero_Coche");
                            String modelo = resultado.getString("Modelo");
                            mensaje.append(" ").append(numeroCoche).append(" ").append(modelo).append("\n");
                        }
                        // Mostrar el mensaje en un JOptionPane
                        JOptionPane.showMessageDialog(ventana, mensaje.toString(), "Resultados de la consulta", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (SQLException i) {
                    System.out.println("Error al intentar conectar con la base de datos");
                    i.printStackTrace();
                } finally {
                    try {
                        if (sentencia != null) {
                            sentencia.close();
                        }
                        if (conexion != null) {
                            conexion.close();
                        }
                    } catch (SQLException i) {
                        i.printStackTrace();
                    }
                }
            }
        });

        //Accion del menu2
        opcion3.addActionListener(new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {
                Connection conexion = null;
                Statement sentencia = null;

                try {
                    conexion = DriverManager.getConnection(url, usuario, contraseña);
                    sentencia = conexion.createStatement();

                    if (conexion != null) {
                        System.out.println("Conexión correcta a la base de datos");
                        // Realizar consultas u otras operaciones con la base de datos aquí
                        String consulta = "select Numero_Plaza from Plazas_Garaje where Tipo_Plaza= 'libre';";
                        ResultSet resultado = sentencia.executeQuery(consulta);

                        // Procesar los resultados (esto es solo un ejemplo)
                        StringBuilder mensaje = new StringBuilder("Plazas libres:\n");
                        while (resultado.next()) {
                            String nombre = resultado.getString("Numero_Plaza");
                            mensaje.append(" ").append(nombre).append("\n");
                        }
                        // Mostrar el mensaje en un JOptionPane
                        JOptionPane.showMessageDialog(ventana, mensaje.toString(), "Resultados de la consulta", JOptionPane.INFORMATION_MESSAGE);

                    }
                } catch (SQLException i) {
                    System.out.println("Error al intentar conectar con la base de datos");
                    i.printStackTrace();
                } finally {
                    try {
                        if (sentencia != null) {
                            sentencia.close();
                        }
                        if (conexion != null) {
                            conexion.close();
                        }
                    } catch (SQLException i) {
                        i.printStackTrace();
                    }
                }
            }
        });
    }

    //Para introducir nuevo coche
    private static void introducirNuevoCoche() {
        //Nos conectamos a la base de datos para hacer las consultas y que salgan en el menu
        String url = "jdbc:mysql://localhost:3306/garaje"; //en casa es 3307
        String usuario = "root";
        String contraseña = ""; //en casa la contraseña es root

        // Lógica para mostrar JPanels y preguntar al usuario los campos
        JTextField marcaField = new JTextField();
        JTextField modeloField = new JTextField();
        JTextField anoField = new JTextField();

        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.add(new JLabel("Marca:"));
        panel.add(marcaField);
        panel.add(new JLabel("Modelo:"));
        panel.add(modeloField);
        panel.add(new JLabel("Año:"));
        panel.add(anoField);

        int result = JOptionPane.showConfirmDialog(null, panel, "Introducir Coche",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            // Obtener los valores introducidos por el usuario
            String marca = marcaField.getText();
            String modelo = modeloField.getText();
            int ano = Integer.parseInt(anoField.getText()); // Asumiendo que el año es un número

            // Lógica para insertar el nuevo coche en la base de datos (similar a tu código existente)
            Connection conexion = null;
            PreparedStatement preparedStatement = null;

            try {
                conexion = DriverManager.getConnection(url, usuario, contraseña);

                if (conexion != null) {
                    String consulta = "INSERT INTO Coches (Marca, Modelo, Año) VALUES (?, ?, ?)";
                    preparedStatement = conexion.prepareStatement(consulta);
                    preparedStatement.setString(1, marca);
                    preparedStatement.setString(2, modelo);
                    preparedStatement.setInt(3, ano);

                    int filasAfectadas = preparedStatement.executeUpdate();

                    if (filasAfectadas > 0) {
                        JOptionPane.showMessageDialog(null, "Coche insertado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Se ha insertado el coche correctamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al insertar el coche", "Error", JOptionPane.ERROR_MESSAGE);
                        System.out.println("Error al insertar el coche");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error al intentar conectar con la base de datos");
                e.printStackTrace();
            } finally {
                try {
                    if (preparedStatement != null) {
                        preparedStatement.close();
                    }
                    if (conexion != null) {
                        conexion.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void btnIntroducirUsuario() {
        String url = "jdbc:mysql://localhost:3306/garaje";
        String usuario = "root";
        String contraseña = "";

        // Obtener el número de coche del usuario
        String numeroCocheStr = JOptionPane.showInputDialog(null, "Ingrese el número de coche del usuario:", "Número de Coche", JOptionPane.QUESTION_MESSAGE);

        if (numeroCocheStr != null && !numeroCocheStr.isEmpty()) {
            int numeroCoche = Integer.parseInt(numeroCocheStr);

            // Verificar si el número de coche existe en la tabla Coches
            if (verificarExistenciaCoche(numeroCoche, url, usuario, contraseña)) {
                // Obtener los datos del usuario
                JTextField nombreField = new JTextField();
                JTextField apellidosField = new JTextField();
                JTextField fechaNacimientoField = new JTextField();

                JPanel panelUsuario = new JPanel(new GridLayout(0, 1));
                panelUsuario.add(new JLabel("Nombre:"));
                panelUsuario.add(nombreField);
                panelUsuario.add(new JLabel("Apellidos:"));
                panelUsuario.add(apellidosField);
                panelUsuario.add(new JLabel("Fecha de Nacimiento (YYYY-MM-DD):"));
                panelUsuario.add(fechaNacimientoField);

                int result = JOptionPane.showConfirmDialog(null, panelUsuario, "Introducir Usuario",
                        JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

                if (result == JOptionPane.OK_OPTION) {
                    String nombre = nombreField.getText();
                    String apellidos = apellidosField.getText();
                    String fechaNacimiento = fechaNacimientoField.getText();

                    // Lógica para insertar el nuevo usuario en la base de datos
                    Connection conexion = null;
                    PreparedStatement preparedStatement = null;

                    try {
                        conexion = DriverManager.getConnection(url, usuario, contraseña);

                        if (conexion != null) {
                            String consulta = "INSERT INTO Usuarios (Nombre, Apellidos, Fecha_Nacimiento, Numero_Coche) VALUES (?, ?, ?, ?)";
                            preparedStatement = conexion.prepareStatement(consulta);
                            preparedStatement.setString(1, nombre);
                            preparedStatement.setString(2, apellidos);
                            preparedStatement.setString(3, fechaNacimiento);
                            preparedStatement.setInt(4, numeroCoche);

                            int filasAfectadas = preparedStatement.executeUpdate();

                            if (filasAfectadas > 0) {
                                JOptionPane.showMessageDialog(null, "Usuario insertado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                            } else {
                                JOptionPane.showMessageDialog(null, "Error al insertar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } catch (SQLException e) {
                        System.out.println("Error al intentar conectar con la base de datos");
                        e.printStackTrace();
                    } finally {
                        try {
                            if (preparedStatement != null) {
                                preparedStatement.close();
                            }
                            if (conexion != null) {
                                conexion.close();
                            }
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Coche no introducido. Por favor, introduzca primero el coche.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private static boolean verificarExistenciaCoche(int numeroCoche, String url, String usuario, String contraseña) {
        Connection conexion = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        boolean existeCoche = false;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);

            if (conexion != null) {
                String consulta = "SELECT 1 FROM Coches WHERE Numero_Coche = ?";
                preparedStatement = conexion.prepareStatement(consulta);
                preparedStatement.setInt(1, numeroCoche);

                resultSet = preparedStatement.executeQuery();
                existeCoche = resultSet.next();
            }
        } catch (SQLException e) {
            System.out.println("Error al intentar conectar con la base de datos");
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return existeCoche;
    }

//    private void btnMuestraPlazaGaraje() {
//        // Lógica para ocupar una plaza de garage
//        // Mostrar un JOptionPane con un menú desplegable para seleccionar una plaza libre
//        String[] plazasLibres = obtenerPlazasLibres(); // Debes implementar este método para obtener las plazas libres
//
//        if (plazasLibres.length > 0) {
//            // Mostrar el menú desplegable para seleccionar una plaza libre
//            String selectedPlaza = (String) JOptionPane.showInputDialog(
//                    ventana,
//                    "Seleccione una plaza libre:",
//                    "Ocupar Plaza",
//                    JOptionPane.QUESTION_MESSAGE,
//                    null,
//                    plazasLibres,
//                    plazasLibres[0]
//            );
//
//            if (selectedPlaza != null) {
//                // Obtener el número de coche
//                String numeroCoche = JOptionPane.showInputDialog(ventana, "Introduzca el número de coche:");
//
//                // Lógica para ocupar la plaza seleccionada y asignar el número de coche
//                ocuparPlazaSeleccionada(selectedPlaza, numeroCoche);
//            }
//        } else {
//            JOptionPane.showMessageDialog(ventana, "No hay plazas libres disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
//    }
//
//// Método para obtener las plazas de garage libres
//    private String[] obtenerPlazasLibres() {
//        // Lógica para obtener las plazas libres desde la base de datos
//        // Debes implementar este método según tu estructura de base de datos
//
//        // Ejemplo de implementación:
//        String[] plazasLibres = {"Plaza 1", "Plaza 2", "Plaza 3", "Plaza 4"}; // Simulación de plazas libres
//        return plazasLibres;
//    }
//
//// Método para ocupar la plaza seleccionada y asignar el número de coche
//    private void ocuparPlazaSeleccionada(String plazaSeleccionada, String numeroCoche) {
//        // Lógica para ocupar la plaza y asignar el número de coche en la base de datos
//        // Debes implementar este método según tu estructura de base de datos
//
//        JOptionPane.showMessageDialog(ventana, "Plaza " + plazaSeleccionada + " ocupada por el coche " + numeroCoche, "Éxito", JOptionPane.INFORMATION_MESSAGE);
//
//    }
    // Método para mostrar los usuarios del garaje
    private static void mostrarUsuariosDelGaraje() {
        String url = "jdbc:mysql://localhost:3306/garaje";
        String usuario = "root";
        String contraseña = "";
        
        Connection conexion = null;
        Statement sentencia = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            if (conexion != null) {
                System.out.println("Conexión correcta a la base de datos");

                // Realizar la consulta para obtener los usuarios del garaje
                String consultaUsuarios = "SELECT * FROM Usuarios";
                ResultSet resultadoUsuarios = sentencia.executeQuery(consultaUsuarios);

                // Procesar los resultados y mostrarlos en un JFrame
                JFrame frameUsuarios = new JFrame("Usuarios del Garaje");
                JTextArea areaTextoUsuarios = new JTextArea(20, 50);

                while (resultadoUsuarios.next()) {
                    String nombre = resultadoUsuarios.getString("Nombre");
                    String apellidos = resultadoUsuarios.getString("Apellidos");
                    areaTextoUsuarios.append(nombre + " " + apellidos + "\n");
                }

                frameUsuarios.add(new JScrollPane(areaTextoUsuarios));
                frameUsuarios.setSize(400, 300);
                frameUsuarios.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frameUsuarios.setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectar con la base de datos");
            ex.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    // Método para mostrar las plazas del garaje
    private static void mostrarPlazasDelGaraje() {
        String url = "jdbc:mysql://localhost:3306/garaje";
        String usuario = "root";
        String contraseña = "";
        
        Connection conexion = null;
        Statement sentencia = null;

        try {
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            sentencia = conexion.createStatement();

            if (conexion != null) {
                System.out.println("Conexión correcta a la base de datos");

                // Realizar la consulta para obtener las plazas del garaje
                String consultaPlazas = "SELECT * FROM Plazas_Garaje";
                ResultSet resultadoPlazas = sentencia.executeQuery(consultaPlazas);

                // Procesar los resultados y mostrarlos en un JFrame
                JFrame framePlazas = new JFrame("Plazas del Garaje");
                JTextArea areaTextoPlazas = new JTextArea(20, 50);

                while (resultadoPlazas.next()) {
                    int numeroPlaza = resultadoPlazas.getInt("Numero_Plaza");
                    String tipoPlaza = resultadoPlazas.getString("Tipo_Plaza");
                    areaTextoPlazas.append("Plaza " + numeroPlaza + ": " + tipoPlaza + "\n");
                }

                framePlazas.add(new JScrollPane(areaTextoPlazas));
                framePlazas.setSize(400, 300);
                framePlazas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                framePlazas.setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectar con la base de datos");
            ex.printStackTrace();
        } finally {
            // Cerrar recursos
            try {
                if (sentencia != null) {
                    sentencia.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}

