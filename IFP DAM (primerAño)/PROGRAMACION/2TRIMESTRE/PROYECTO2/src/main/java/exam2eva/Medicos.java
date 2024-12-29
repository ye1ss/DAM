/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exam2eva;

/**
 *
 * @author Alumno
 */
public class Medicos extends Trabajadores{
    private String turno;
    private String especialidad;

    public Medicos(String turno, String especialidad, String nombre, String apellido, String dni) {
        super(nombre, apellido, dni);
        this.turno = turno;
        this.especialidad = especialidad;
    }

    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString(){
        return "Médico= [Nombre y apellido: "+getNombre()+" "+ getApellido()+" DNI: "+getDni()+" Turno: "+getTurno()+" Especialidad: "+getEspecialidad()+"]";
    }
    
}
