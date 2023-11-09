package Esercizio37;

public class Triangolo extends Forma {
    private double x;
    private double y;
    private TipoForma tipo;
    public Triangolo(double x, double y, TipoForma tipo){
        this.x = x;
        this.y = y;
        this.tipo=tipo;
    }
    @Override
    public double calcolaArea() {
        double area = x*y/2;
        System.out.println("Triangolo e l'area è: " + area);
        return 0;
    }
}
