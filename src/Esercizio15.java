public class Main14 {
    public static void main(String[] args) {
        int numero = 1;
        fizz(numero);
    }

    public static void fizz(int numero) {
        if (numero > 100) {
            return;
        }

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (numero % 3 == 0) {
            System.out.println("Fizz");
        } else if (numero % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println("Numero = " + numero);
        }

        numero++;
        fizz(numero);
    }
}