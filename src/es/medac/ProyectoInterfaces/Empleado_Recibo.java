/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Andrés
 */
public class Empleado_Recibo extends Empleado {

    private String recibo;
    
    //Constructor vacío
    
    public Empleado_Recibo(String nombre, String apellido, String dni){
        super();
        this.recibo = "vacio";
    }
    //Constructor con parámetros
    public Empleado_Recibo (String nombre, String apellido, String dni, 
            String direccion, int edad, String formacionacademica, int añosExperiencia,
            int horas_trabajadas, int PagoPorHora, String recibo){
        super(nombre, apellido, dni, direccion, edad, formacionacademica,
        añosExperiencia, horas_trabajadas, PagoPorHora);
        this.recibo = recibo;
    }
    //Get y Set
    
    public String getRecibo(){
            return this.recibo;
        }
    
    public void setRecibo (String recibo){
        this.recibo = recibo;
    }
    
    //Métodos heredados
    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
                + "----------------------" + "\n"
                + " " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + super.getNombre() + "\n"
                + "Apellidos: " + super.getapellido() + "\n"
                + "DNI: " + super.getdni() + "\n"
                + "Edad: " + super.getedad() + "\n"
                + "Dirección: " + super.getdireccion() + "\n"
                + "Formación Academica: " + super.getFormacionAcademica() + "\n"
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n"
                + " " + "\n"
                + "Resumen de Pago " +this.recibo+ "\n"
                + "Sueldo Bruto: S/ " + sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Sueldo Neto: S/ " + sueldoNeto();
    }
     @Override
    public int cant_horas_extras() {
        int horasNormales = 40; 
        int horasExtras = 0; 
        
        if (getHorasTrabajadas() > horasNormales) {
            horasExtras = getHorasTrabajadas() - horasNormales;
        }
        
        return horasExtras;
    }
    
    @Override
    public int horasExtras() {
        double montoHoraExtra = getPagoPorHora() * 2;
        return (int) (montoHoraExtra * cant_horas_extras());
    }

   

    @Override
    public double sueldoBruto() {
        return getHorasTrabajadas() * getPagoPorHora();
    }

    @Override
    public double sueldoNeto() {
        return sueldoBruto() + horasExtras();
    }
}
