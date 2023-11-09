package Esercizio37;

public class Esercizio37 {
    public static void main(String[] args) {
        System.out.println("La forma è: ");
        Rettangolo rettangolo = new Rettangolo(10, 5, TipoForma.Rettangolo);
        rettangolo.calcolaArea();
        Triangolo triangolo= new Triangolo(10, 5, TipoForma.Triangolo);
        triangolo.calcolaArea();
    }

}


