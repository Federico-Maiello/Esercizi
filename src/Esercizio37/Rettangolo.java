package Esercizio37;

public class Rettangolo extends Forma {
    private double x;
    private double y;
    private TipoForma  tipo;
    public Rettangolo(double x, double y, TipoForma tipo){
        this.x = x;
        this.y = y;
        this.tipo=tipo;
    }
    @Override
    public double calcolaArea() {
        double area = x*y;
        System.out.println("Rettangolo e l'area è: " + area);
        return 0;
    }
}
