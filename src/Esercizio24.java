public class Esercizio24 {
    public static void main(String[] args) {
        int[] numbers = fill(10);
        int sum = sumNumber(numbers);
        System.out.println("Il risultato della somma dei numeri è " + sum);
    }

    public static int[] fill(int x) {
        int[] numbers = new int[x];
        for (int i = 0; i < x; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }

    public static int sumNumber(int[] numbers) {
        int sum = 0;
        for (int y : numbers) {
            sum += y;
        }
        return sum;
    }
}
