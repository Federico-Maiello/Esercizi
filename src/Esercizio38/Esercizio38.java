package Esercizio38;

public class Esercizio38 {
    public static void main(String[] args) {
        String string1 = "Ciao, sono Federico";
        String string2 = "Ciao, sono federico";

        String egual = compareString(string1, string2);

        System.out.println(egual);
        }
    public static String compareString(String string1, String string2) {
        StringBuilder egual = new StringBuilder();

        int compare = string1.compareTo(string2);

        if (compare == 0) {
            egual.append("Le due stringhe sono uguali");
        } else {
            egual.append("Le due stringhe sono differenti");
        }

        return egual.toString();
    }
}
