/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Andrés
 */
public abstract class Empleado {
    
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private int edad;
    private String formacionAcademica;
    private int añosExperiencia;
    private int horas_trabajadas;
    private int pagoPorHora;
    
    public Empleado(){
        this.nombre = "ninguno";
        this.apellido= "ninguno";
        this.dni= "ninguno";
        this.direccion= "ninguno";
        this.edad= 0;
        this.formacionAcademica= "ninguna";
        this.añosExperiencia = 0;
        this.horas_trabajadas= 0;
        this.pagoPorHora = 0;
    }
    
    public Empleado (String nombre, String apellido, String dni,
            String direccion, int edad, String formacionAcademica, int
                    añosExperiencia, int horas_trabajadas, int pagoPorHora){
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.edad = edad;
        this.formacionAcademica= formacionAcademica;
        this.añosExperiencia = añosExperiencia;
        this.horas_trabajadas = horas_trabajadas;
        this.pagoPorHora = pagoPorHora;
              
    }
    
    
    // Getters y Setters
    public String getNombre(){
            return this.nombre;
        }
        
    public void setNombre(String nombre){
            this.nombre= nombre;
    }
    
    public String getapellido(){
        return this.apellido;
    }
    public void setApellido (String apellido){
        this.apellido = apellido;
    }
    public String getdni (){
        return this.dni;
    }
    public void setDni (String dni){
        this.dni = dni;
    }
    public String getdireccion (){
        return this.direccion;
    }
    public void setDireccion (String direccion){
        this.direccion = direccion;
    }
    public int getedad (){
        return this.edad;
    }
    public void setEdad (int edad){
        this.edad = edad;
    }
    public String getFormacionAcademica (){
        return this.formacionAcademica;
    }
    public void setFormacionAcademica (String formacionAcademica){
        this.formacionAcademica = formacionAcademica;
    }
    public int getAñosExperiencia(){
        return this.añosExperiencia;
    }
    public void setAñosExperiencia (int añosExperiencia){
        this.añosExperiencia = añosExperiencia;
    }
    public int getHorasTrabajadas(){
        return this.horas_trabajadas;
    }
    public void setHorasTrabajadas (int horas_trabajadas){
        this.horas_trabajadas = horas_trabajadas;
    }
    public int getPagoPorHora(){
        return this.pagoPorHora;
    }
    public void setPagoPorHora (int pagoPorHora){
        this.pagoPorHora = pagoPorHora; 
    }
    
    public abstract String imprimirReciboPago();
    public abstract int horasExtras();
    public abstract int cant_horas_extras();
    public abstract double sueldoBruto();
    public abstract double sueldoNeto();
    
    
}
