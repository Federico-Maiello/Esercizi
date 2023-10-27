public class Esercizio12 {
    public static void main(String[] args) {
            char x = 'D';
            char y = 'd';

            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("I due valori sono uguali: " + xEgual(x, y));
        }
        public static boolean xEgual (double x, double y){
            boolean egual = x == y;
            return egual;
        }
}

