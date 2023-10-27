public class Esercizio20 {
    public static void main(String[] args) {
        int x = 4;
        risultato(x);
    }

    public static int risultato(int y) {
        for (int x=0;x<=10;x++){
            System.out.println(x + "x" + y + "=" + x*y);
        }
        return y;
    }

}
