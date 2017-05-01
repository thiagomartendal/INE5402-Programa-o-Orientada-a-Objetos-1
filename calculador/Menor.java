package calculador;

public class Menor{
    public String Analize(int X, int Y, int Z){
        int m = Math.min(X, Y);
        int menor = Math.min(m, Z);
        return "O menor de "+X+", "+Y+", "+Z+" é "+menor+".";
    }
}