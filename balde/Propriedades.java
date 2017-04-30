package balde;

import javax.swing.JOptionPane;

public class Propriedades{
    double balde = 0;
    double balde2 = 5;
    double balde3 = 0;
    
    public double Encher(double b1){
        if(b1 > 5){
            balde = 5;
            JOptionPane.showMessageDialog(null, "A quantidade de água ultrapassou o limite do balde. Foram perdidos "+(b1-5)+" litros de água.");
        }else{
            balde = b1;
        }
        return this.balde;
    }
    
    public String Status(){
        String st = "";
        if(balde == 5){
            st = "O balde 1 está cheio. Possui "+balde+" litros de água.";
        }else if(balde == 0){
            st = "O balde 1 está vazio. Possui "+balde+" litros de água.";
        }else{
            st = "O balde 1 tem água. Possui "+balde+" litros de água.";
        }
        return st;
    }
    
    public String Recebe(){
        String rc = "";
        if(balde == 5){
            rc = "O balde 1 não pode receber o conteúdo do balde 2, pois está cheio.";
        }else{
            rc = "O balde 1 recebeu o conteúdo do balde 2. O balde 2 ficou com "+(balde)+" litros, e o balde 1 ficou com 5 litros de água.";
            balde = 5;
        }
        return rc;
    }
    
    public String Derramar(){
        balde3 = balde;
        String dr = "O balde 3 recebeu o conteúdo do balde 1 e ficou com "+balde3+" litros.";
        return dr;
    }
}
