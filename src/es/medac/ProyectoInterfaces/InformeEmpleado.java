/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Andrés
 */
public class InformeEmpleado extends Empleado {

    // atributos
    private int cant_hijos;
    private String hacienda;
    private String rentencion;

    // constructor sin parámetro
    public InformeEmpleado() {
        super();
        this.cant_hijos = 0;
        this.hacienda = "nada";
        this.rentencion = "nada";
    }

    //constructor con parámetros
    public InformeEmpleado(String nombre, String apellido, String dni,
            String direccion, int edad, String formacionacademica, int añosExperiencia,
            int horas_trabajadas, int PagoPorHora, int cant_hijos,
            String hacienda, String rentencion) {
        super(nombre, apellido, dni, direccion, edad, formacionacademica,
                añosExperiencia, horas_trabajadas, PagoPorHora);
        this.cant_hijos = cant_hijos;
        this.hacienda = hacienda;
        this.rentencion = rentencion;

    }
    //Getters, Setters y métodos abstractos(Igual que en el apartado anterior)

    public int getCantHijos() {
        return this.cant_hijos;
    }

    public void setCantHijos(int cant_hijos) {
        this.cant_hijos = cant_hijos;
    }

    public String getHacienda() {
        return this.hacienda;
    }

    public void setHacienda(String hacienda) {
        this.hacienda = hacienda;
    }

    public String getRentencion() {
        return this.rentencion;
    }

    public void setRentencion(String rentencion) {
        this.rentencion = rentencion;
    }

    private double pension() {
        if (rentencion.equals("rentencion 2.5%")) {
            return sueldoBruto() * 0.025;
        } else if (hacienda.equals("hacienda 1.5%")) {
            return sueldoBruto() * 0.015;
        } else {
            return 0.0;
        }
    }

    private double bonoHijos() {
        double sueldoBruto = sueldoBruto();

        if (cant_hijos >= 1 && cant_hijos <= 2) {
            return sueldoBruto * 0.032;
        } else if (cant_hijos > 2 && cant_hijos <= 4) {
            return sueldoBruto * 0.05;
        } else if (cant_hijos > 4) {
            return sueldoBruto * 0.075;
        } else {
            return 0.0;
        }

    }

    @Override
    public String imprimirReciboPago() {
        return "INFORME DEL TRABAJADOR" + "\n"
                + "---------------------" + "\n"
                + " " + "\n"
                + "Datos del Empleado" + "\n"
                + "Nombres: " + super.getNombre() + "\n"
                + "Apellidos: " + super.getapellido() + "\n"
                + "DNI: " + super.getdni() + "\n"
                + "Edad: " + super.getedad() + "\n"
                + "Dirección: " + super.getdireccion() + "\n"
                + "Formación Academica: " + super.getFormacionAcademica() + "\n"
                + "Años de experiencia: " + super.getAñosExperiencia() + "\n" + " " + "\n"
                + "Resumen de Pago" + "\n" + " " + "\n"
                + "Sueldo Bruto: S/ " + this.sueldoBruto() + "\n"
                + "Horas Extras: " + cant_horas_extras() + "\n"
                + "Pago por horas Extras: S/ " + horasExtras() + "\n"
                + "Pension: S/ " + pension() + "\n"
                + "Bono por hijos: S/ " + bonoHijos() + "\n" + "Sueldo Neto: S/ " + sueldoNeto();
    }

    @Override
    public int horasExtras() {
         int horasNormales = 40; 
        int horasExtras = 0; 
        
        if (getHorasTrabajadas() > horasNormales) {
            horasExtras = getHorasTrabajadas() - horasNormales;
        }
        
        return horasExtras;
    }

    @Override
    public int cant_horas_extras() {
        double montoHoraExtra = getPagoPorHora() * 2;
        return (int) (montoHoraExtra * horasExtras());
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
