package calculador;

import java.math.BigDecimal;

public class Media{
    public String calcular(int X, int Y, int Z){
        float media = (X+Y+Z)/3;
        return "A média de "+X+", "+Y+" e "+Z+" é "+new BigDecimal(media)+".";
    }
}
