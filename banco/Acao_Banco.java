package banco;

public class Acao_Banco{
    double jurosPoupanca = 1.05;
    double jurosChequeEspecial = 1.1;
    
    public void transferir(Conta origem, Conta destino, double valor){
        origem.setSaldo(origem.getSaldo()-valor);
        destino.setSaldo(destino.getSaldo()+valor);
    }
    
    public void depositar(Conta conta, double valor){
        if(conta.getSaldo() < 0){
            conta.setSaldo(conta.getSaldo()*this.jurosChequeEspecial);
        }
        conta.setSaldo(conta.getSaldo()+valor);
    }
    
    public void creditarJurosPoupanca(Conta conta){
        if(conta.getSaldo() > 0){
            conta.setSaldo(conta.getSaldo()*1.10);
        }
    }
}
