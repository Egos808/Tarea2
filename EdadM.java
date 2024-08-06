package com.mycompany.edadm;
import javax.swing.JOptionPane;

public class EdadM {

    public static void main(String[] args) {
        //Se solicita edad a usuario
     String Edad = JOptionPane.showInputDialog("Ingrese su edad: ");
     
        //Convertir en Entero
    int Ed = Integer.parseInt(Edad);
        
        //Se declara mensaje a mostrar y con If se valida si es menor o mayor.
     String mensaje;
     if (Ed < 18) {
         mensaje =      "Su edad es: " + Ed + "\n" +
                        "Usted es menor de edad :(";
     }else{
         mensaje =      "Su edad es: " + Ed + "\n" +
                        "Usted es mayor de edad :)";
     }
            
        //Ventana emergente con resultados
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
