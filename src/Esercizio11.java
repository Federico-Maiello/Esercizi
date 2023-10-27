public class Esercizio11 {
    public static void main(String[] args) {
        int x = 22;
        int y = 33;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("I due valore sono uguali: " + xEgual(x, y));
    }
    public static boolean xEgual (double x, double y){
        boolean egual = x == y;
        return egual;
    }
}