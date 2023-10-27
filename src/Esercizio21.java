public class Esercizio21 {
    public static void main(String[] args) {
        int numeroPartenza = 6;
        int numeroMinimo = 3;
        numeriInversi(numeroPartenza, numeroMinimo);
    }

    public static int numeriInversi(int numeroPartenza, int numeroMinimo) {
        for (int x=numeroPartenza; x>=numeroPartenza - numeroMinimo + 1; x--){
            System.out.println(x + " ");
        }
        return (numeroPartenza);

    }
}
