package com.mycompany.anio;

import javax.swing.JOptionPane;

public class Anio {

    public static void main(String[] args) {
        // Solicitar el año al usuario
        String anioStr = JOptionPane.showInputDialog("Ingrese un año: ");
        
        // Convertir el String a entero
        int anio = Integer.parseInt(anioStr);
        
        // Determinar si el año es bisiesto
        boolean esBisiesto;
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            esBisiesto = true;
        } else {
            esBisiesto = false;
        }
        
        // Construir el mensaje a mostrar
        String mensaje;
        if (esBisiesto) {
            mensaje = "El año " + anio + " es bisiesto.";
        } else {
            mensaje = "El año " + anio + " no es bisiesto.";
        }
        
        // Mostrar el mensaje en una ventana emergente
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

