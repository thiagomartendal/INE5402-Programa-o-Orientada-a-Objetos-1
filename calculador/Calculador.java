package calculador;

import javax.swing.JOptionPane;

public class Calculador{
    public Calculador(){
        int X = Integer.parseInt(JOptionPane.showInputDialog("X: "));
        int Y = Integer.parseInt(JOptionPane.showInputDialog("Y: "));
        int Z = Integer.parseInt(JOptionPane.showInputDialog("Z: "));
        Menor m = new Menor();
        Media med = new Media();
        Soma s = new Soma();
        Paridade p = new Paridade();
        String menor = m.Analize(X, Y, Z);
        String media = med.calcular(X, Y, Z);
        String soma = s.calcular(X, Y, Z);
        String paridade = p.comparador(X, Y, Z);
        JOptionPane.showMessageDialog(null, menor+" "+media+" "+soma+" "+paridade);
    }
    
    public static void main(String[] args){
        new Calculador();
    }
}