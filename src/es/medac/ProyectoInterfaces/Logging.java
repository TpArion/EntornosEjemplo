/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.medac.ProyectoInterfaces;

/**
 *
 * @author Andrés
 */
public class Logging {

    public String logging_usuario(String usuario, String password) {
        String mensaje;
        if (usuario.equals("Admin") && password.equals("1111")) {
            mensaje = "Log Admin correcto";
        } else if ((usuario.equals("Juan") && password.equals("1234"))) {
            mensaje = "Log Juan correcto";
        } else if ((usuario.equals("Diego") && password.equals("7777"))) {
            mensaje = "Log Diego correcto";
        } else if ((usuario.equals("Kevin") && password.equals("9895"))) {
            mensaje = "Log Kevin correcto";
        } else {
            mensaje = "Usuario Incorrecto ";
        }
        return mensaje;
    }
}
