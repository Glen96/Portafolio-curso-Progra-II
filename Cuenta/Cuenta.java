package Cuenta;

import javax.swing.JOptionPane;

public class Cuenta {

  public static void main(String[] args) {
    implements Vista{
      
    }

    int ingreso, egreso, balance;
    

    JOptionPane.showMessageDialog(null, "Bienvenido al Banco");
    ingreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto ingresado?"));
    egreso = Integer.parseInt(JOptionPane.showInputDialog(null, "Monto retirado?"));

    balance = (ingreso - egreso);

    if (balance >= 1) {
     
      JOptionPane.showMessageDialog(null, "Su balance es positivo, tiene una cantidad de:" + balance + " colones");

    } else {
      JOptionPane.showMessageDialog(null, "Usted esta sobre girado por:" + balance + " colones");
    }

  }
}