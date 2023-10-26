public class Esercizio18 {
    public static void main(String[] args) {
        char simbolo = '/';
        String risultato = simboloIdentificato(simbolo);
        System.out.println("L'operazione risulta: " + risultato);

    }

    public static String simboloIdentificato(char simbolo) {
        switch (simbolo){
            case '+':
                return "Addizione.";
            case '-':
                return "Sottrazione.";
            case '*':
                return "Moltiplicazione.";
            case '/':
                return "Divisione.";
            default:
                return "Errore nessun simbolo definito è stato riconosciuto.";
        }
    }
}
