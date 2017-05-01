package baskara;

public class Calcular{
    public String Baskara(int a, int b, int c){
        double delta = Math.sqrt(Math.pow(b, 2)-4*a*c);
        String dt = "";
        double x1 = 0,x2 = 0;
        if(delta < 0){
            dt = "Delta negativo.";
        }else{
            dt = "Delta = "+String.valueOf(delta)+".";
            x1 = (-b+delta)/(2*a);
            x2 = (-b-delta)/(2*a);
        }
        return "X' = "+String.valueOf(x1)+". | X'' = "+String.valueOf(x2)+". | "+dt;
    }
}
