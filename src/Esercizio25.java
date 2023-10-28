public class Esercizio25 {
    public static void main(String[] args) {
        char[] x = numeriArray (10);
        checkChar(x);
    }

    public static char[] numeriArray(int y) {
        char[] x = new char[y];
        for (int i=0; i < y; i++){
            if (i % 2 != 0){
                x[i]= 'a';
            }else {
                x[i]= 'b';
            }
        }
        return x;
    }

    public static void checkChar(char[] x) {
        for (char y : x){
            if (y == 'a'){
                System.out.println("a");
            } else {
                System.out.println("0");
            }
        }

    }
}