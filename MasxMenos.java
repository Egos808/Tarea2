package com.mycompany.masxmenos;
import javax.swing.JOptionPane;

public class MasxMenos {

    public static void main(String[] args) {
        //Se pide el número Entero
        String Entero = JOptionPane.showInputDialog("Por favor ingreseun Número Entero: ");
        
        //Convetir número en entero
        int Ent = Integer.parseInt(Entero);
        
        String TPN;
        if (Ent > 0){
            TPN = "positivo";
        }else if(Ent < 0){
            TPN = "Negativo";
        }else{
            TPN = "cero";
        }
        
        String mensaje = "El número es: " + Ent + " Por lo tanto el numero es: " + TPN;
        
     //Ventana emergente con resultados   
     JOptionPane.showMessageDialog(null,mensaje);
    }
}
