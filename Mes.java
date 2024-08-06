package com.mycompany.mes;

import javax.swing.JOptionPane;

public class Mes {

    public static void main(String[] args) {
        // Array con los nombres de los meses
        String[] meses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
            "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        // Solicitar el número del mes al usuario
        String numeroMesStr = JOptionPane.showInputDialog("Ingrese el número del mes (1-12): ");
        
        // Convertir el String a entero
        int numeroMes = Integer.parseInt(numeroMesStr);
        
        // Validar el rango del número del mes
        if (numeroMes < 1 || numeroMes > 12) {
            JOptionPane.showMessageDialog(null, "Número de mes inválido. Debe estar entre 1 y 12.");
        } else {
            // Obtener el nombre del mes
            String nombreMes = meses[numeroMes - 1];
            
            // Mostrar el nombre del mes en una ventana emergente
            JOptionPane.showMessageDialog(null, "El nombre del mes es: " + nombreMes);
        }
    }
}
