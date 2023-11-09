package Esercizio35;

public class Triangolo extends Forma {
    private double x;
    private double y;

    public Triangolo(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void calcolaArea() {
        double area = x*y/2;
        System.out.println("Triangolo e l'area è: " + area);
    }
}
