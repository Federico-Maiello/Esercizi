public class Esercizio19 {
    public static void main(String[] args) {
        int x = 8;
        int sum = ciclo(x);
        System.out.println("il risultato della somma è: "+ sum);
    }

    public static int ciclo(int x) {
        int y = 0;
        int inc = 1;
        while (inc < x) {
            y += inc;
            inc++;

        }
        return y;
    }
}

