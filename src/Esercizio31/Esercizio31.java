package Esercizio31;

public class Esercizio31 {
    public static void main(String[] args) {
        Auto car1 = new Auto (1800, "FF000II", "Mitsubishi", "Lancer");
        System.out.println("Marca: "+ car1.getMarca());
        System.out.println("Modello: "+ car1.getModello());
        System.out.println("Cilindrata: "+ car1.getCilindrata());
        System.out.println("Targa: "+ car1.getTarga());

        car1.setMarca("Toyota");
        car1.setModello("Yaris");

        System.out.println("Marca nuova: " + car1.getMarca());
        System.out.println("Modello nuovo: "+ car1.getModello());
    }
}
