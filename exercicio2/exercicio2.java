package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args){
        String raio = JOptionPane.showInputDialog("Digite o ráio da circunferência: ");
        double r = Double.parseDouble(raio);
        double area = 3.14*Math.pow(r, 2);
        JOptionPane.showMessageDialog(null, "Área da circunferência: "+area);
    }
}
