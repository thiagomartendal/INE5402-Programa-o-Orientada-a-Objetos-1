package areacirculo;

import javax.swing.JOptionPane;

public class AreaCirculo{
    public static void main(String[] args) {
        String num = String.valueOf(JOptionPane.showInputDialog("Digite um número: "));
        Calcular c = new Calcular();
        String resultado = String.valueOf(c.raio(Double.parseDouble(num)));
        JOptionPane.showMessageDialog(null, "O Raio do círculo é: "+resultado);
    }
}
