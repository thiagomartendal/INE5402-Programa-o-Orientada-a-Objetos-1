package baskara;

import javax.swing.JOptionPane;

public class Baskara{
    public static void main(String[] args){
        int a,b,c;
        a = 7;
        b = 13;
        c = -2;
        double delta = Math.sqrt(Math.pow(b, 2)-4*a*c);
        double x1 = (-b+delta)/(2*a);
        double x2 = (-b-delta)/(2*a);
        System.out.println("X1 = "+x1+" X2 = "+x2);
        Inicializador init = new Inicializador();
        JOptionPane.showMessageDialog(null, init.init());
    }
}
