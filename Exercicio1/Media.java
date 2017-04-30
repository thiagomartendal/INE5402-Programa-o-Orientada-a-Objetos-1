package exercicio1;

public class Media {
    private double prova1;
    private double prova2;
    private double trabalho1;
    private double trabalho2;

    public void setProva1(double prova1) {
        this.prova1 = prova1;
    }

    public void setProva2(double prova2) {
        this.prova2 = prova2;
    }

    public void setTrabalho1(double trabalho1) {
        this.trabalho1 = trabalho1;
    }

    public void setTrabalho2(double trabalho2) {
        this.trabalho2 = trabalho2;
    }

    public double getProva1() {
        return this.prova1;
    }

    public double getProva2() {
        return this.prova2;
    }

    public double getTrabalho1() {
        return this.trabalho1;
    }

    public double getTrabalho2() {
        return this.trabalho2;
    }

    public double getMedia() {
        return ((this.prova1*0.3)+(this.prova2*0.4)+(this.trabalho1*0.1)+(this.trabalho2*0.2));
    }
}
