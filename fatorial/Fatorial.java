package fatorial;

import javax.swing.JOptionPane;

public class Fatorial{
    public static void main(String[] args){
        long resultado = 1;
        long fatorial = Long.parseLong(JOptionPane.showInputDialog("Digite um número: "));
        for(long fact = fatorial;fact > 0;fact--){
            resultado *= fact;
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}
