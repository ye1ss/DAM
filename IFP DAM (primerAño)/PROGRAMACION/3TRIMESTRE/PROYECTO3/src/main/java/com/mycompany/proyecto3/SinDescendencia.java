/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto3;
/**
 * @author Garbine
 * Ejemplo de clase final - clase de la que no se puede heredar con elementos final en su interior (atributos, variables, mÃ©todo y parÃ¡metros)
 * En comentarios ejemplos de cÃ³digo que darÃ­an error por tratarse de elementos final.
 */
public final class SinDescendencia {
    //Atributos final
    // Valor constante conocido en tiempo de compilaciÃ³n
    static final double PI = 3.14159265;
    // Valor constante conocido solamente en tiempo de ejecuciÃ³n
    static final int SEMILLA = (int) Math.random() * 10 + 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        System.out.println("EJEMPLO DE USO DEL MODIFICADOR FINAL");
        // No se puede modificar el valor del atributo PI por ser final
        // PI=PI+5;
        System.out.println("El valor de PI es: "+PI);
        System.out.println("El valor de SEMILLA es: "+SEMILLA);
         // Referencia constante: siempre se apuntarÃ¡ al mismo objeto Alumno reciÃ©n creado, el objeto no podrÃ¡ cambiar
        // aunque este objeto pueda sufrir modificaciones, por ejempo cambiar su atributo nombre.
        final Alumno PRIMER_ALUMNO = new Alumno("Ana","Torres",8);
        System.out.println(PRIMER_ALUMNO.toString());
        System.out.println("El nombre del primer alumno es " +PRIMER_ALUMNO.getNombre());
        PRIMER_ALUMNO.setNombre("Elena");
        System.out.println("Ahora su nombre es " +PRIMER_ALUMNO.getNombre());
        // Ref. constante
        // Si la variable no es una referencia (tipo primitivo), serÃ­a una constante mÃ¡s
        // (como un atributo constante).
        final int NUMERO_DIEZ = 10; // Valor constante (dentro del Ã¡mbito de vida de la variable)
        metodoConParametrosFijos(NUMERO_DIEZ,5);
    }
    
    // MÃ©todo â€œno redefinibleâ€ no podremos reescribirlo en una clase hija (@Override)
    public final void metodoNoRedefinible(int parametro1) { 
        System.out.println("El mÃ©todo metodoNoRedefinible no se puede redefinir en una clase hija.");  
    }

    public static void metodoConParametrosFijos(final int par1, final int par2) {

        System.out.println("Los parÃ¡metros de este mÃ©todo no se pueden modificar ");
        int suma = par1+par2;
        System.out.println("su suma es "+suma);    
        // Los parÃ¡metros â€œpar1â€ y â€œpar2â€ no podrÃ¡n sufrir modificaciones aquÃ­ dentro
        //par1= suma;    
    }
}

//No podemos crear una clase hija de ClaseSinDescendencia porque es final
//class Hija extends ClaseSinDescendencia {  
//}

class Alumno {
    
    String nombre, apellido;
    float nota;
    
    public Alumno(String nombre, String apellido, float nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public float getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + '}';
    }
        
}