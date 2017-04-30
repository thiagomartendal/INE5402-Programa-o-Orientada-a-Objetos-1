package banco;

import javax.swing.JOptionPane;

public class Banco{
    public static void main(String[] args){
        Acao_Banco banco = new Acao_Banco();
        Conta conta1 = new Conta("Pedro", 100.0);
        Conta conta2 = new Conta("Joao", 300.0);
    
        JOptionPane.showMessageDialog(null, conta1.toString());
        JOptionPane.showMessageDialog(null, conta2.toString());
        
        JOptionPane.showMessageDialog(null, conta2.compareTo(conta1));
        
        banco.creditarJurosPoupanca(conta1);
        JOptionPane.showMessageDialog(null, conta1.toString());
        
        banco.transferir(conta1, conta2, 200);
        JOptionPane.showMessageDialog(null, conta1.toString());
        JOptionPane.showMessageDialog(null, conta2.toString());
        
        banco.depositar(conta1, 10);
        JOptionPane.showMessageDialog(null, conta1);
    }
}
