package Esercizio34;

import Esercizio34.Forma;

public class Rettangolo extends Forma {
    private double x;
    private double y;

    public Rettangolo(double x, double y){
        this.x = x;
        this.y = y;
    }
    @Override
    public void calcolaArea() {
        double area = x*y;
        System.out.println("Rettangolo e l'area è: " + area);
    }
}
