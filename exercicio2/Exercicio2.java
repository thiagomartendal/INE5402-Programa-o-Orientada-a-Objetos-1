package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args){
        Raio r = new Raio();
        double area = 3.14*Math.pow(r.getRaio(), 2);
        JOptionPane.showMessageDialog(null, "Área da circunferência: "+area);
    }
}
