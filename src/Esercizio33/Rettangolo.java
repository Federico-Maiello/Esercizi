package Esercizio33;

public class Rettangolo extends Forma {
    private double x;
    private double y;

    public Rettangolo (double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double calcolaArea() {
        double area = x*y;
        System.out.println("L'area del rettangolo è: " + area);
        return 0;
    }
}
