package com.mycompany.enteros;
import javax.swing.JOptionPane;

public class Enteros {

    public static void main(String[] args) {
        //Se solicita el primer número
        String num1 = JOptionPane.showInputDialog("Por favor ingrese un número entero: ");
        //Se solicita el primer número
        String num2 = JOptionPane.showInputDialog("Por favor ingrese un número entero: ");
        
        //Convetir números en enteros
        int N1 = Integer.parseInt(num1);
        int N2 = Integer.parseInt(num2);
        
        //comparamos los numeros con If
        String mensaje;
        if (N1 > N2){
            mensaje =   "El Primer numero ingresado es: " + N1 + "\n" +
                        "El Segundo numero ingresado es: " + N2 + "\n" +
                        "El primer número es mayor.";
        }else if (N1 < N2){
            mensaje =   "El Primer numero ingresado es: " + N1 + "\n" +
                        "El Segundo numero ingresado es: " + N2 + "\n" +
                        "El Segundo número es mayor.";
        }else{
            mensaje =   "El Primer numero ingresado es: " + N1 + "\n" +
                        "El Segundo numero ingresado es: " + N2 + "\n" +
                        "Ambos números son iguales.";
        }
        //Ventana emergente con resultados
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
