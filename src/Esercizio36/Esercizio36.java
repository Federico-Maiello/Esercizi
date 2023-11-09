package Esercizio36;

public class Esercizio36 {
    public static void main(String[] args) {
        System.out.println("La forma è: ");
        Rettangolo rettangolo = new Rettangolo(10, 5);
        rettangolo.calcolaArea();
        Triangolo triangolo= new Triangolo(10, 5);
        triangolo.calcolaArea();
    }

}


