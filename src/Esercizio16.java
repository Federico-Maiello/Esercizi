public class Esercizio16 {
    public static void main(String[] args) {
        String string = "Ciao sono Federico Maiello";
        if (string.length() > 10) {
            System.out.println("Lunghezza maggiore di 10");
        } else if (string.length() < 10) {
            System.out.println("Lunghezza minore di 10");
        } else if (string.length() == 10) {
            System.out.println("Lunghezza pari a 10");
        }

    }
}