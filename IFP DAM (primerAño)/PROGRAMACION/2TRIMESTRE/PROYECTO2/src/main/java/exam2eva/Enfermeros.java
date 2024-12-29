/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2eva;

/**
 *
 * @author Alumno
 */
public class Enfermeros extends Trabajadores{
    private String turno;

    public Enfermeros(String turno, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    
    @Override
    public String toString(){
        return "Enfermero= [Nombre y apellido: "+getNombre()+" "+ getApellido()+" DNI: "+getDni()+" Turno: "+getTurno()+"]";
    }
}
