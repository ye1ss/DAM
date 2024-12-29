/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EjerciciosClasee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

/**
 *
 * @author Jorge Wamg y Yeismil del Rosario 
 * Diseño con el javax.swing para la creacion de una calculadora que se pueda realizar distintas operaciones.
 */
public class calculadora {

   public static void main(String args[]) {      
        //calculo de tamano de pantalla y configuracion para creacion de la lamina 
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanopantalla = mipantalla.getScreenSize();//coje los sizes de la pantalla
        int alturapantalla = tamanopantalla.height;//coje la altura de la pantalla
        int anchopantalla = tamanopantalla.width; //coje el ancho de la pantalla
        //creacion de la ventana principal para la calculadora
        JFrame J = new JFrame();
        J.setBounds(anchopantalla/4,alturapantalla/8,anchopantalla/2,(alturapantalla/4)*3);//anchura altura y colocacion de la ventana
        
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setResizable(false);
        //tamaño programa
       
        // Creacion de los botones con las operaciones //Grupos a los que pertenece
        JButton suma = new JButton("+");//operaciones simples
        JButton salir = new JButton("salir");//ponerlo en la esquina
        JButton resta = new JButton("-");//operaciones simples
        JButton multiplicacion = new JButton("*");//operaciones simples
        JButton division = new JButton("/");//operaciones simples
        JButton factorizacion = new JButton("FACT");//operaciones complejas de un valor
        JButton seno = new JButton("sen");//angulos
        JButton coseno = new JButton("cos");//angulos
        JButton tangente = new JButton("tan");//angulos
        JButton arcoseno = new JButton("arcsen");//angulos
        JButton arcocoseno = new JButton("cosc");//angulos
        JButton arcotangente = new JButton("ArcTan");//angulos
        JButton mayor = new JButton(">");//operaciones simples
        JButton menor = new JButton("<");//operaciones simples
        JButton raiz = new JButton("raiz^1/2");//operaciones complejas de un valor
        JButton potencia = new JButton("^");//logaritmos y potencias
        JButton factorial = new JButton("!");//operaciones complejas de un valor
        JButton logaritmo = new JButton("log");//logaritmos y potencias
        JButton neperiano = new JButton("ln");//operaciones complejas de un valor
        JButton resto = new JButton("MOD");//operaciones simples
        JButton porcentaje = new JButton("%");//probabilidad y estadistica
        JButton raiz3 = new JButton("raiz^1/3 ");//operaciones complejas de un valor
         JButton nPr = new JButton("nPk");////probabilidad y estadistica
        JButton Combinaci = new JButton("nCk");////probabilidad y estadistica
        
        //Creaciones botones de borrado
        JButton AC = new JButton("AC");
        JButton AC1 = new JButton("AC");
        JButton AC2 = new JButton("AC");
        JButton AC3 = new JButton("AC");
        JButton AC4 = new JButton("AC");
        JButton AC5 = new JButton("AC");
        JButton AC6 = new JButton("AC");
        JButton AC7 = new JButton("AC");
     
        //tamaño de los botones y colocacion
        suma.setBounds(100, 150, 75, 50);//añadido
        salir.setBounds(850,671,100,100);//añadido
        resta.setBounds(100,200,75,50);//añadido
        multiplicacion.setBounds(100,250,75,50);//añadido
        division.setBounds(100,300,75,50);//añadido
        factorizacion.setBounds(400,200,75,50);//añadido 
        seno.setBounds(400,450,75,50);//añadido 
        coseno.setBounds(400,500,75,50);//añadido 
        tangente.setBounds(400,550,75,50);//añadido 
        arcoseno.setBounds(475,450,75,50);//añadido 
        arcocoseno.setBounds(475,500,75,50);//añadido 
        arcotangente.setBounds(475,550,75,50);//añadido 
        mayor.setBounds(100,350,75,50);//añadido
        menor.setBounds(100,400,75,50);//añadido
        raiz.setBounds(375,250,100,50);//añadido pero 
        potencia.setBounds(775,475,75,50);//añadido 
        factorial.setBounds(475,200,75,50);//añadido
        logaritmo.setBounds(700,475,75,50);//añadido 
        neperiano.setBounds(435,150,75,50);//añadido 
        resto.setBounds(100,450,75,50);//añadido
        porcentaje.setBounds(735,225,75,50);//añadido 
        nPr.setBounds(775,175,75,50);//añadido 
        raiz3.setBounds(475,250,100,50);//añadido 
        Combinaci.setBounds(700,175,75,50);//añadido 
        
        //añadir los botones en el JFrame
        J.add(suma);
        J.add(salir);
        J.add(resta);
        J.add(multiplicacion);
        J.add(division);
        J.add(menor);
        J.add(mayor);
        J.add(resto);
        J.add(factorizacion);
        J.add(factorial);
        J.add(raiz);
        J.add(raiz3);
        J.add(neperiano);
        J.add(seno);
        J.add(coseno);
        J.add(tangente);
        J.add(arcoseno);
        J.add(arcocoseno);
        J.add(arcotangente);
        J.add(Combinaci);
        J.add(nPr);
        J.add(porcentaje);
        J.add(potencia);
        J.add(logaritmo);
        
        //creacion de los JLabel
        JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;//nombre de los botones
        JLabel operacion,operacionunico,angulo,probabilidad,logpo;//categorias
        
        //los declaramos un valor
        l1 = new JLabel("Primer numero");
        l2 = new JLabel("Segundo numero");
        l3 = new JLabel("Inserte n elementos");
        l4 = new JLabel("Escriba un angulo o un dato del arc");
        l5 =new JLabel("Escriba un numero");
        l6= new JLabel("inserte la prob o la muestra k");
        l7 = new JLabel("Inserte un numero");
        l8= new JLabel("Inserte su base");
        
        //JLabel para nombrar los botones de borrado de texto
        l9= new JLabel("AC");//para el textfield tf
        l10= new JLabel("AC");//para el textfield tf3
        l11= new JLabel("AC");//para el textfield tf4
        l12= new JLabel("AC");//para el textfield tf5
        l13= new JLabel("AC");//para el textfield tf7
        l14= new JLabel("AC");//para el textfield tf2
        l15= new JLabel("AC");//para el textfield tf6
        l16= new JLabel("AC");//para el textfield tf8
        
        //categorias
        operacion= new JLabel("operaciones simples");
        operacionunico = new JLabel("operacion avazanda con solo un valor");
        angulo = new JLabel("angulos");
        probabilidad = new JLabel("Probabilidad y Estadistica");
        logpo = new JLabel("Logaritmo y potencia");
        
        //colocacion y tamaño de los JLabel
        l1.setBounds(100,-80,200,200);//primer numero
        l2.setBounds(100,-30,200,200);//segundo numero
        l3.setBounds(725,-80,200,200);//inserte n elementos
        l4.setBounds(400,280,200,200);//Escriba un angulo o un dato del arc
        l5.setBounds(425,-60,200,200);//Escriba un numero
        l6.setBounds(700,-10,200,200);//inserte la prob o la muestra k
        l7.setBounds(725,240,200,200);//inserte un numero
        l8.setBounds(725,300,200,200);//inserte su base
        l9.setBounds(70,5, 30,30);//AC
        l10.setBounds(390,30,30,30);//AC
        l11.setBounds(360,400,30,30);//AC
        l12.setBounds(690,20,30,30);//AC
        l13.setBounds(690,325,30,30);//AC
        l14.setBounds(70,60,30,30);//ac
        l15.setBounds(690,85,30,30);//AC
        l16.setBounds(690,400,30,30);//AC
        operacion.setBounds(80, 110, 200, 50);//operaciones simples
        operacionunico.setBounds(380,110,300,50);//operacion avazanda con solo un valor
        angulo.setBounds(450,410,200,50);//angulos
        probabilidad.setBounds(700,135,300,50);//Probabilidad y Estadistica
        logpo.setBounds(720,440,200,50);//Logaritmo y potencia
        
        //añadir los JLabel dentro del JFrame
        J.add(l1);
        J.add(l2);
        J.add(l3);
        J.add(l4);
        J.add(l5);
        J.add(l6);
        J.add(l7);
        J.add(l8);
        J.add(l9);
        J.add(l10);
        J.add(l11);
        J.add(l12);
        J.add(l13);
        J.add(l14);
        J.add(l15);
        J.add(l16);
        J.add(operacion);
        J.add(operacionunico);       
        J.add(angulo);
        J.add(probabilidad);
        J.add(logpo);
        
       //creacion de un JField
        JTextField tf = new JTextField();//primer numero de calculos de 2 operaciones
        JTextField tf2 = new JTextField();//segundo numero de calculos de operacion 2 resultado
        JTextField tf3 = new JTextField();//para los calculos de 1 resultado
        JTextField tf4 = new JTextField();//para los senos cosenos y tangente
        JTextField tf5 = new JTextField();//para permutaciones combinaciones y estadistica
        JTextField tf6 = new JTextField(); //para muestras probabilidades etc
        JTextField tf7 = new JTextField();//para logaritmos o potencia
        JTextField tf8 = new JTextField();//potencias o logaritmos sus bases
        
        //posicion de cada texto
        tf.setBounds(100,30, 100, 30);//operaciones normales
        tf2.setBounds(100,85,100,30);//operaciones normales 2
        tf3.setBounds(425,55,100,30);//operaciones especiales 1
        tf4.setBounds(425,400,100,30);//angulos
        tf5.setBounds(725,50,100,30);//combinatoria
        tf6.setBounds(725,110,100,30);//combinatoria y su muestra
        tf7.setBounds(725,350,100,30);//logaritmo raiz
        tf8.setBounds(725,425,100,30);//sus potencias de los log y raiz
        
        //botones de borrado tamaño
        AC.setBounds(60,30, 30,30);//borrado del tf
        AC1.setBounds(60,85,30,30);//borrado del tf2
        AC2.setBounds(385,55,30,30);//borrado del tf3
        AC3.setBounds(385,400,30,30);//borrado del tf4
        AC4.setBounds(685,50,30,30);//borrado del tf5
        AC5.setBounds(685,110,30,30);//borrado del tf6
        AC6.setBounds(685,350,30,30);//borrado del tf7
        AC7.setBounds(685,425,30,30);//borrado del tf8

        //añadimos los botones de borrado de los textField
        J.add(AC);
        J.add(AC1);
        J.add(AC2);
        J.add(AC3);
        J.add(AC4);
        J.add(AC5);
        J.add(AC6);
        J.add(AC7);
        
        //añadimos los jFIELD
        J.add(tf);
        J.add(tf2);
        J.add(tf3);
        J.add(tf4);
        J.add(tf5);
        J.add(tf6);
        J.add(tf7);
        J.add(tf8);
        
        J.setLayout(null);//para deshabilitar el layout
        
       DecimalFormat df = new DecimalFormat("#0.00");//declaramos este formato para que limite los decimales de  cada respuestas
       //los action listener
       //funcion suma
        suma.addActionListener(new ActionListener() {//suma
            public void actionPerformed(ActionEvent e) {
                try{
                double dato=Double.parseDouble(tf.getText());//recoge los datos y los convierte en double tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y convierte en double de la tf2
                double resultado = dato + dato2;//los calculos de suma
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//los imprime, el df es para limitar los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o contiene un simbolo que no es un número","Error",JOptionPane.ERROR_MESSAGE);
                }
                }});
        
        //funcion salir de la pantalla
        salir.addActionListener(new ActionListener(){//salir
            public void actionPerformed(ActionEvent e){
                System.exit(0);//boton de salida cuyo funcion es salir de la calculadora
            }
            });
        
        //funcion resta
        resta.addActionListener(new ActionListener() {//resta
            public void actionPerformed(ActionEvent e) {
                try{
                  double dato=Double.parseDouble(tf.getText());//recoge datos y los convierte en double de la tabla tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de la tabla tf2
                double resultado = dato - dato2;//resta los datos
               
           JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//muestra el resultado df es para reducir los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
        
        //funcion multiplicacion
        multiplicacion.addActionListener(new ActionListener() {//multiplicacion
            public void actionPerformed(ActionEvent e) {
                try{
                   double dato=Double.parseDouble(tf.getText());//recogida de datos y su conversion en double de la tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de la tabla tf2
                double resultado = dato * dato2;//multiplica
               
           JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime resultado df es para reducir los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }});
        
        //funcion division
        division.addActionListener(new ActionListener() {//division
            public void actionPerformed(ActionEvent e) {
                try{
                   double dato=Double.parseDouble(tf.getText());//recoge los datos y los convierte en double de los tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de los tf2
            if(dato2==0){    //en caso que pongan un 0
                 JOptionPane.showMessageDialog(null,"ERROR no se puede dividir entre 0","Error",JOptionPane.ERROR_MESSAGE);

            }else{
                double resultado = dato / dato2;
                
                 JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado)); //imprime los resultados df es para reducir los decimales
            }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            
            }});
        
         //funcion mayor
        mayor.addActionListener(new ActionListener() {//mayor
            public void actionPerformed(ActionEvent e) {
                try{
                   double dato=Double.parseDouble(tf.getText());//recoge los datos y los convierte en double de los tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de los tf2
            if(dato==dato2){    //si son iguales
                JOptionPane.showMessageDialog(null, "Los numeros son iguales");
            }else{
                if(dato>dato2){//si dato 1 es mayor que el 2
                    
                    JOptionPane.showMessageDialog(null, "el número " + df.format(dato) + " es mayor que " + df.format(dato2));
                }else{// encaso contrario
                    JOptionPane.showMessageDialog(null,"el número " + df.format(dato2) + " es mayor que " + df.format(dato));
                }
            }
            }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
        
        //funcion menor  
         menor.addActionListener(new ActionListener() {//menor
            public void actionPerformed(ActionEvent e) {
                try{
             double dato=Double.parseDouble(tf.getText());//recoge los datos y los convierte en double de los tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de los tf2
            if(dato==dato2){    //si son iguales
                JOptionPane.showMessageDialog(null, "Los numeros son iguales");
            }else{
                if(dato>dato2){//si dato 2 es mayor que 1
                    JOptionPane.showMessageDialog(null,"el número " + df.format(dato2) + " es menor que " + df.format(dato));
                }else{//si dato 1 es menor que 2
                     JOptionPane.showMessageDialog(null, "el número " + df.format(dato) + " es menor que " + df.format(dato2));
                }
            }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
         
         //funcion resto 
          resto.addActionListener(new ActionListener() {//resto
            public void actionPerformed(ActionEvent e) {
                try{
         double dato=Double.parseDouble(tf.getText());//recoge los datos y los convierte en double de los tf
         double dato2=Double.parseDouble(tf2.getText());//recoge los datos y los convierte en double de los tf2
            if(dato2==0){    //no existe divisiones divididas entre 0
                JOptionPane.showMessageDialog(null,"ERROR no se puede dividir entre 0","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                int resultado = (int) (dato % dato2);//calcula el resto
                
                JOptionPane.showMessageDialog(null,"el resultado es " + resultado);//imprime resultado df es para reducir los decimales
            }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño" ,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
          
          //funcion factorial
          factorizacion.addActionListener(new ActionListener() {//factorial
            public void actionPerformed(ActionEvent e) {
         try{
         int dato =Integer.parseInt(tf3.getText());//recoge datos y convierte en int de la tf3
         long resultado = 1;// recoge el resultado
        if(dato>26){
                    JOptionPane.showMessageDialog(null,"Error el resultado es demasiado grande","Error",JOptionPane.ERROR_MESSAGE);
        }else{
          for(int i =1;i<dato+1;i++){//for para calcular el factorial
             resultado = resultado*i;
          }
            JOptionPane.showMessageDialog(null, "el resultado es "+resultado);
         }
         }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }   
         }});
          
          //funcion raiz
           raiz.addActionListener(new ActionListener() {//raiz
            public void actionPerformed(ActionEvent e) {
                try{ 
                int dato = Integer.parseInt(tf3.getText());//recoge datos y convierte en int de la tf3
              if(dato<0){//en caso que sea negativo
                  JOptionPane.showMessageDialog(null,"Error no existen raices negativas","Error",JOptionPane.ERROR_MESSAGE);
              }else{
                double resultado = Math.sqrt(dato);
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime resultado df es para reducir los decimales
                  
            }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }}); 
           
           //funcion raiz al cubo
           raiz3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {//raiz al cubo
                try{
                     int dato = Integer.parseInt(tf3.getText());//recoge datos y convierte en int del tf3

                    if(dato<=0){//no existe neperianos 0 o negativos
                    JOptionPane.showMessageDialog(null,"No existen neperianos negativos o de valor 0 ","Error",JOptionPane.ERROR_MESSAGE);
                } else{
                             
                double resultado = Math.cbrt(dato);
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime el resultado df es para reducir los decimales
                    }
                    }catch(NumberFormatException ex){//coje el error en caso que pongan un simbolo o este vacio el cuadro
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                }}); 
           
           //funcion neperiano
           neperiano.addActionListener(new ActionListener() {//neperianos
            public void actionPerformed(ActionEvent e) {
                try{
                int dato = Integer.parseInt(tf3.getText());//recoge datos y convierte en int del tf3
                
                double resultado;
                if(dato<=0){//no existe neperianos 0 o negativos
                    JOptionPane.showMessageDialog(null,"No existen neperianos negativos o de valor 0 ","Error",JOptionPane.ERROR_MESSAGE);
                } else{
                double numerador = Math.log(dato);//calculamos el numerador debido a la caracteristica de logb a/logb c = logc a
                double denominador = Math.log(Math.E);//calculamos el denominador, el Math.E es el numero de euler usada en neperianos
                resultado = numerador/denominador;//calculo del logaritmo con la anterior formula
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime el resultado df es para reducir los decimales
                }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                
            }}); 
          
          //funcion seno
          seno.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) {
              try{
                  int dato = Integer.parseInt(tf4.getText());//recoge datos y convierte en int del tf4
              double dato2 = Math.toRadians(dato);//los convierte en radianes
                double resultado = Math.sin(dato2);//calculo del seno
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));
            }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
          
            }});
          
          //funcion coseno
          coseno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                int dato = Integer.parseInt(tf4.getText());//recoge datos y convierte en int del tf4 
              double dato2 = Math.toRadians(dato);//los convierte en radianes 
                double resultado = Math.cos(dato2);//caclulo del coseno
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado)); //imprime el resultado df es para reducir los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                }});
          
          //funcion tangente
          tangente.addActionListener(new ActionListener() {//tangente
            public void actionPerformed(ActionEvent e) {
                try{
                    
                int dato = Integer.parseInt(tf4.getText());//recoge datos y convierte en int del tf4
              double dato2 = Math.toRadians(dato);//convierte en radianes
              if(dato==90){//en las reglas trigonometricas no existe la tan de 90 por lo que este if recoge el error
                   JOptionPane.showMessageDialog(null,"No existe la tan de 90","Error",JOptionPane.ERROR_MESSAGE);
              }else{
              double resultado = Math.tan(dato2);//calculo del tangente
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime un JOptionPane df es para reducir los decimales
              }  
              }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                }});
                    
          //funcion arcoseno
          arcoseno.addActionListener(new ActionListener() {//arcsen
            public void actionPerformed(ActionEvent e) {
                try{
                double dato = Double.parseDouble(tf4.getText());//recoge datos y convierte en double del tf4
              if(dato<-1||dato>1){//por si supera 1 o -1
                  JOptionPane.showMessageDialog(null,"Error, no puede existir un seno mayor que 1 o menor que -1","Error",JOptionPane.ERROR_MESSAGE);   
              } else{
                double radiones = Math.asin(dato);//calculo de la arcoseno en radianes
               double resultado = Math.toDegrees(radiones);// lo pasamos de radianes a grados
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime resultado df es para reducir los decimales
              }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
              }});
                   
          //funcion arcocoseno
          arcocoseno.addActionListener(new ActionListener() {//arccos
            public void actionPerformed(ActionEvent e) {
                try{
                double dato = Double.parseDouble(tf4.getText());//recoge datos y convierte en double del tf4
              
                if(dato<-1||dato>1){//por si es mayor que 1 o menor que -1
                  JOptionPane.showMessageDialog(null,"Error, no puede existir un seno mayor que 1 o menor que -1","Error",JOptionPane.ERROR_MESSAGE);   
              } else{
                double radiones = Math.acos(dato);//calculo del arcocoseno en radianes
               double resultado = Math.toDegrees(radiones);// lo pasamos a grados
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime los resultados en Jpane df es para reducir los decimales
                  
              }
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
                    
          //funcion arcotangente
                    arcotangente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                double dato = Double.parseDouble(tf4.getText());//recoge datos y convierte en double del tf4
              
                double radiones = Math.atan(dato);//calculo de arcotangente en radianes
                double resultado = Math.toDegrees(radiones);//los convertimos en grados
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//imprime el resultado  df es para reducir los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                }});
                    
             //funcion factorizacion
             factorial.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                long dato = Integer.parseInt(tf3.getText());//recoge datos y convierte en int del tf3
                 long divisor = 2;//declaramos el divisor
                 if(dato==0){
                     JOptionPane.showMessageDialog(null,"el resultado es 0,");
                 }else{
      String resultado = new String();//declaramos un string para recoger los datos
         while(dato != 1) {//while para que hasta el numero no sea 1 el bucle no pare
                if(dato % divisor == 0){//si el resto es 0 significa que es factorizar
                  resultado = (resultado  + divisor + ", ");//guarda el valor en un string
                 dato = dato / divisor;//divide el dato y lo va convertiendo mas pequeño

            }else {
                divisor++;//en caso que no sea resto 0 
            }
        }
                       
                  JOptionPane.showMessageDialog(null,"el resultado es " + resultado);//imrpime el resultado df es para reducir los decimales
                 }
                 }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
                }});
             
             //funcion porcentaje
      porcentaje.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                double dato = Double.parseDouble(tf5.getText());//recoge datos y convierte en int del tf5
                double dato1 = Double.parseDouble(tf6.getText());//recoge datos y convierte en int del tf6
                double resultado = ((dato * dato1)/100);//calcula su porcentaje
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//muestra el resultado df es para reducir los decimales
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }    
                }});
      
      //funcion combinacion
      Combinaci.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                int dato = Integer.parseInt(tf5.getText());//recoge datos y convierte en int del tf5
                int dato1 = Integer.parseInt(tf6.getText());//recoge datos y convierte en int del tf6
                if(dato<dato1){//por si ponen un numero mayor en la muestra(dato1) que dato
                   JOptionPane.showMessageDialog(null,"Error el N no puede ser mayor que R o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                    
                }else{
                double resultado = combinacion(dato,dato1);//calcula un modulo
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//muestra resultado df es para reducir los decimales
            }       
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
      
      //funcion nPr
      nPr.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try{
                int dato = Integer.parseInt(tf5.getText());//recoge datos y convierte en int del tf5
                int dato1 = Integer.parseInt(tf6.getText());//recoge datos y convierte en int del tf6
                if(dato<dato1){//por si la muestra(dato1) es mayor que dato
                   JOptionPane.showMessageDialog(null,"Error el N no puede ser mayor que R o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                    
                }else{
                double resultado = nPr(dato,dato1);//calcula el modulo
               
                  JOptionPane.showMessageDialog(null,"el resultado es " + df.format(resultado));//muestra los resultados df es para reducir los decimales
            }        
                }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
      
      //funcion logaritmo
      logaritmo.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
            int dato = Integer.parseInt(tf7.getText());//recoge datos y convierte en int del tf7
            int dato1 = Integer.parseInt(tf8.getText());//recoge datos y convierte en int del tf8
            double numeroLog, base,resultado;//declaramos las variables
            if(dato<=0 ||dato1<=0){//No existen logaritmos de 0 o -1
                   JOptionPane.showMessageDialog(null,"Los logaritmos no pueden tener la base o numero negativo o ser 0","Error",JOptionPane.ERROR_MESSAGE);
            } else{
                    numeroLog = Math.log(dato);//calcula el numerador
                    base = Math.log(dato1);//calcula la base, debido a la propiedad de los logaratimo que logb a / logb c = logc a
                    resultado = numeroLog/base;//calcula el log por la formula
                    JOptionPane.showMessageDialog(null,"El resultado es " + df.format(resultado));//imprime resultado df es para reducir los decimales
               
                }
            }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
        }});
      
      //funcion potencia
      potencia.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            try{
            int dato = Integer.parseInt(tf7.getText());//recoge datos y convierte en int del tf7
            int dato1 = Integer.parseInt(tf8.getText());//recoge datos y convierte en int del tf8
            int resultado = (int) Math.pow(dato, dato1);//parece que hay posible perdida por lo que se añade un int
            JOptionPane.showMessageDialog(null,"El resultado es " + resultado);//muestra e el resultado df es para reducir los decimales
            }catch(NumberFormatException ex){//en caso que los JTexfield esten vacios coje el error
                    JOptionPane.showMessageDialog(null,"Error la tabla esta vacio o tiene un simbolo extraño","Error",JOptionPane.ERROR_MESSAGE);
                }
            }});
          //todas las funciones de borrado
          AC.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
           tf.setText(null);//boton de borrar tf
        }});
          AC1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf2.setText(null);//boton de borrar tf2
        }});
        AC2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf3.setText(null);//boton de borrar tf3
        }});
        AC3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf4.setText(null);//boton de borrar tf4
        }});
        AC4.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf5.setText(null);//boton de borrar tf5
        }});
        AC5.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf6.setText(null);//boton de borrar tf6
        }});
        AC6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf7.setText(null);//boton de borrar tf7
        }});
        AC7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
           tf8.setText(null);//boton de borrar tf8
        }});

          J.setVisible(true);
    }
   public static double combinacion(int a,int b){
    int numerador = 1;//recoge los datos del numerador en factorial
    int denominador = 1;//recoge la factorial de la muestra(b)
    int denab = 1;//recoge el factorial de a - b
    int ab = a-b;//en combinatoria en el denominador esta escrito ((a-b)!a!) por lo que
    for(int i = 1;i<a+1;i++){//calculo de factorial de n
        numerador = numerador * i;
        
    }
    
    for(int i = 1;i<b+1;i++){ //caluclo del factorial r
        denominador =denominador* i;
    }
    
    for(int i= 1;i<ab+1;i++){//calculo del factorial de la resta entre n y r
        denab = denab * i;
    }
    
    double resultado = ((numerador)/(denominador*denab));
    return resultado;//devuelve el resultado
}
   public static double nPr(int a,int b){//jorge
     int denominador = a - b;//el denominador es (a-b)!
     int numeradorTotal=1;//recoge el numerador factorial
     int denominadorTotal = 1;//recoge el factorial de denominador
     for(int i = 1;i<a+1;i++){//factorial de a
         numeradorTotal = i * numeradorTotal;
         
     }
     for(int i = 1;i<denominador+1;i++){//factorial de b
     denominadorTotal = denominadorTotal * i;
 }
     double resultado = numeradorTotal/denominadorTotal;//calculo de la permutacion
    return resultado;//devuelve resultado
 }
}

        