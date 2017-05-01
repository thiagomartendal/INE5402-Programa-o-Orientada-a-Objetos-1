package calculador;

import java.math.BigDecimal;

public class Soma{
    public String calcular(int X, int Y, int Z){
        double soma = X+Y+Z;
        return X+"+"+Y+"+"+Z+" = "+new BigDecimal(soma)+".";
    }
}