/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package EJCLASE;

/**
 *
 * @author Jorge Wang Wang y yeis
 * Ejercicio crear una calculadora
 */
import java.util.*;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //eleccion de operaciones
        int exit = 0;
        while(exit == 0){
            int operador;
        System.out.println("Eliga la operación que quiera realizar");//recordar cambiar a swing 
        System.out.println("1.Suma, 2.Resta, 3.multiplicación, 4.División, 5.factorización, 6.raiz, 7. potencia, 8.seno, 9. coseno 10. tangente, 11. arcoseno, 12. arcocoseno,13. arcotangente, 14.mayor, 15.menor, 16.factorial, 17.logaritmo, 18.neperiano, 19.resto, 20 porcentaje, 21.nPr, 22.Salir calculadora ");//añadir mas operaciones
        double operator = sc.nextDouble();
         operador =(int) operator;
        if(operador<=0 || operador>22){
            System.out.println("Error no existe ese ópcion");
        }else{
        switch (operador){
            case 1://suma
           System.out.println("Inserte un número:");
           double numSuma = sc.nextDouble();
           System.out.println("Inserte otro número: ");
           double numSuma2 = sc.nextDouble();
           suma(numSuma,numSuma2);
                break;
            case 2://resta
           System.out.println("Inserte un número:");
           double numResta = sc.nextDouble();
           System.out.println("Inserte otro número: ");
           double numResta2 = sc.nextDouble();
           resta(numResta,numResta2);
                break;
            case 3://multiplicación
             System.out.println("Inserte un número:");
           double numMulti = sc.nextDouble();
           System.out.println("Inserte otro número: ");
           double numMulti2 = sc.nextDouble();
           multiplicacion(numMulti,numMulti2);
           break;
            case 4://división
                System.out.println("Inserte un número:");
           double numDiv = sc.nextDouble();
           System.out.println("Inserte otro número: ");
           double numDiv2 = sc.nextDouble();
            division(numDiv,numDiv2);
            
                break;
            case 5://factorizacion
                System.out.println("Escribe un numero entero");
                //datos
                int factorizador = sc.nextInt();
                //operacion
                factorizar(factorizador);
                break;

            case 6://raiz
                System.out.println("Escriba un número para la raiz");
                int numRaiz = sc.nextInt();
                raiz(numRaiz);
                break;
            case 7://potencia
                System.out.println("Inserte un número:");
                int numpotencia = sc.nextInt();
                System.out.println("Inserte otro número: ");
                int numpotenciaelevado = sc.nextInt();
                potencia(numpotencia,numpotenciaelevado);
                break;
            case 8://seno
                System.out.println("Inserte un ángulo:");
           int numseno = sc.nextInt();
            seno(numseno);

                break;
            case 9://coseno
System.out.println("Inserte un ángulo:");
           int numcoseno = sc.nextInt();
                coseno(numcoseno);
                break;
            case 10://tangente
System.out.println("Inserte un ángulo:");
           int numtan = sc.nextInt();
                tangente(numtan);
                break;
            case 11://arcoseno
                System.out.println("Inserte un ángulo:");
           double numarcseno = sc.nextDouble();
          if(numarcseno<-1||numarcseno>1){
                  System.out.println("Error no existe arcoseno de numeros mayores que 1 o menores que -1");
              } else{
           arcoseno(numarcseno);
          }
                break;
            case 12://arcocoseno
                
                System.out.println("Inserte un ángulo:");
           double numarcocoseno = sc.nextDouble();
           if(numarcocoseno<-1||numarcocoseno>1){//en caso que el numero sea superior a -1 o mayor que 1
                System.out.println("Error no existe arcocoseno de numeros mayores que 1 o menores que -1");
           }else{
           arcocoseno(numarcocoseno);
           }     
           break;
            case 13://arcotangente
                 System.out.println("Inserte un ángulo:");
           double numartan = sc.nextDouble();
                arcotangente(numartan);
           break;
            case 14://mayor
                System.out.println("Inserte un número:");
                double numMayor = sc.nextDouble();
                System.out.println("Inserte otro número: ");
                double numMayor2 = sc.nextDouble();
                mayor(numMayor,numMayor2);
                break;
            case 15://menor
                System.out.println("Inserte un número:");
                double numMenor = sc.nextDouble();
                System.out.println("Inserte otro número: ");
                double numMenor2 = sc.nextDouble();
                menor(numMenor,numMenor2);
                break;
            case 16://factorial
                System.out.println("Escriba un numero");
                int numnPr = sc.nextInt();
                factorial(numnPr);
                break;
            case 17://logaritmo
               System.out.println("Escriba el numero de log x");
                double numLogaritmo = sc.nextDouble();
                System.out.println("Escriba la base del logaritmo");
                double numBase = sc.nextDouble();
                logaritmo(numLogaritmo,numBase);
                break;
            case 18://neperianos
                System.out.println("Escriba el numero de ln x");
                double numNeperiano = sc.nextDouble();
                neperiano(numNeperiano);
                break;
            case 19://resto
                System.out.println("Inserte un número:");
           double numRes = sc.nextDouble();
           System.out.println("Inserte otro número: ");
           double numRes2 = sc.nextDouble();
            resto(numRes,numRes2);
                break;
            case 20://porcentaje
                System.out.println("Inserte un número que quiera calcular:");
                int numPorcentaje1 = sc.nextInt();
                System.out.println("Inserte el porcentaje que quiera calcular");
                int numPorcentajecal = sc.nextInt();
                porcentaje(numPorcentaje1,numPorcentajecal);
                break;
            case 21://nPr
                System.out.println("Inserte el numero total");
                int numTotal = sc.nextInt();
                System.out.println("Inserte la muestra");
                int muestra = sc.nextInt();
                if(muestra>numTotal){
                    System.out.println("La muestra no puede superar el numero total");
                }else{
                
                nPr(numTotal,muestra);
                }
                break;
            case 22://combinaciones
                System.out.println("Inserte el numero");
                int n = sc.nextInt();
                System.out.println("Inserte r");
                int r = sc.nextInt();
                combinacion(n,r);
                break;
                       
            case 23: //salir
                System.out.println("Salistes de la calculadora");
                exit = 1;
                break;
            
        }
        }
    
        }
    }
         //factorizacion
         public static void factorizar(int dato){//jorge
             int divisor = 2;
      
        while(dato != 1) {
            if(dato % divisor == 0){
               System.out.print(divisor +" ");
               dato = dato / divisor;

            }else {
                divisor++;
            }
        }
        System.out.println("");
        }
    
         
    public static void logaritmo(double numero, double base){//jorge
        if(numero<=0 || base<=0){
            System.out.println("La base o el valor del numero no puede ser negativo o 0");
        }else{
        double resultado = Math.log(numero)/Math.log(base);
        System.out.printf("El resultado del logaritmo es %.2f\n",resultado);
    }
    }
    //neperiano
   public static void neperiano(double numero){//jorge
       if(numero<=0){
           System.out.println("El valor del numero no puede ser negativo o 0");
       }else{
       final double e = 2.71828;
       double resultado = Math.log(numero)/Math.log(e);
       System.out.printf("El resultado del neperiano es %.2f\n",resultado);
       }
    }  
    public static void factorial(int a){//jorge
        int resultado = 1;
        for(int i=1;i<a+1;i++){
            resultado = resultado * i; 
    }
        System.out.println(resultado);
    }
 public static void nPr(int a,int b){//jorge
     int denominador = a - b;
     int numeradorTotal=1;
     int denominadorTotal = 1;
     for(int i = 1;i<a+1;i++){
         numeradorTotal = i * numeradorTotal;
         
     }
     for(int i = 1;i<denominador+1;i++){
     denominadorTotal = denominadorTotal * i;
 }
     int resultado = numeradorTotal/denominadorTotal;
     System.out.println(resultado);
 }
 public static void porcentaje(int a,int b){//jorge
     double resultado = (a *b) /(100);
     System.out.printf("%.2f\n",resultado);
 }

public static void suma(double a, double b){ //yeiss

        double resultado=(a + b); 

        System.out.printf("%.2f\n",resultado); 
        }
public static void mayor(double a, double b){//jorge
    if(a==b){
        System.out.println("Los numeros son iguales");
    } else{
        if(a>b){
            System.out.println("El número " + a + " es mayor que " + b);
        } else{
            System.out.println("El número " + b + " es mayor que " + a);
        }
    }
}
public static void menor(double a, double b){//jorge
    if(a==b){
        System.out.println("Los numeros son iguales");
    } else{
        if(a<b){
            System.out.println("El número " + a + " es menor que " + b);
        } else{
            System.out.println("El número " + b + " es menor que " + a);
        }
    }
}

    public static void resta(double a, double b){ //yeiss

        double resultado=(a - b); 

        System.out.printf("%.2f\n",resultado); 
        }
       public static void multiplicacion(double a, double b){//yeiss 

        double resultado=(a * b); 

        System.out.printf("%.2f\n",resultado); 


       } 
public static void division(double a, double b){//yeiss 
    if(b == 0){
        System.out.println("ERROR no se puede dividir entre 0");
    }else{
        double resultado=(a / b); 
        System.out.printf("el resultado es %.2f\n",resultado); 
    }
        
}
public static void raiz(int a){ //yeiss

    
        if(a<0){
           System.out.println("ERROR no se puede realizar raices negativas");
        }else{
        double resultado=Math.sqrt(a); 

        System.out.printf("el resultado es %.2f\n",resultado); 
        }
}
    
    public static void resto(double a,double b){//yeiss 
    if(b == 0){
        System.out.println("ERROR no se puede dividir entre 0");
    }else{
        double resultado =(a % b); 
        System.out.printf("el resultado es %.2f\n",resultado); 
    }
        
}


public static void potencia(int a,int b){ //yeiss

        int resultado=(int) Math.pow(a, b); 

        System.out.println (resultado); 
}
public static void seno(int a){//yeiss
    double resultado=Math.sin(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void coseno(int a){//yeiss
    double resultado=Math.cos(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void tangente(int a){//yeiss
    double resultado=Math.tan(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void arcoseno(double a){//yeiss
    double resultado=Math.asin(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void arcocoseno(double a){//yeiss
    double resultado=Math.acos(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void arcotangente(double a){//yeiss
    double resultado=Math.atan(a);
    System.out.printf("el resultado es %.2f\n",resultado);
}
public static void combinacion(int a,int b){
    int numerador = 1;
    int denominador = 1;
    int denab = 1;
    int ab = a-b;
    for(int i = 1;i<a+1;i++){
        numerador = numerador * i;
        
    }
    
    for(int i = 1;i<b+1;i++){
        denominador =denominador* i;
    }
    
    for(int i= 1;i<ab+1;i++){
        denab = denab * i;
    }
    
    double resultado = ((numerador)/(denominador*denab));
    System.out.printf("la combinación es %.2f\n",resultado);
}
}