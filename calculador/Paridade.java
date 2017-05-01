package calculador;

public class Paridade{
    public String comparador(int X, int Y, int Z){
        float h1 = X % 2;
        float h2 = Y % 2;
        float h3 = Z % 2;
        String xp,yp,zp;
        if(h1 == 0){
            xp = "Par";
        }else{
            xp = "Ímpar";
        }
        if(h2 == 0){
            yp = "Par";
        }else{
            yp = "Ímpar";
        }
        if(h3 == 0){
            zp = "Par";
        }else{
            zp = "Ímpar";
        }
        return X+" é "+xp+". "+Y+" é "+yp+". "+Z+" é "+zp+".";
    }
}