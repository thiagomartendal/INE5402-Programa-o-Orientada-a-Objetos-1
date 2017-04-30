package balde;

import javax.swing.JOptionPane;

public class Balde{
    public static void main(String[] args){
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Litros de água: "));
        Propriedades p = new Propriedades();
        p.Encher(valor);
        JOptionPane.showMessageDialog(null, p.Status());
        JOptionPane.showMessageDialog(null, p.Recebe());
        JOptionPane.showMessageDialog(null, p.Derramar());
    }
}
