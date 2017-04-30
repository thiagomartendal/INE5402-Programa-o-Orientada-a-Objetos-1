package exercicio2;

import javax.swing.JOptionPane;

public class Raio {
    private String raio;
    
    Raio() {
        this.raio = JOptionPane.showInputDialog("Digite o ráio da circunferência: ");
    }

    public double getRaio() {
        return Double.parseDouble(this.raio);
    }
}
