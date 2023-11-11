package Esercizio39;
// mi sono aiutato cercando online e con soluzione di chat gpt perché non avrei potuto chiedere aiuto.
public class Esercizio39 {
    public static void main(String[] args) {
        UnicodeCharacterExtractor extractor = new UnicodeCharacterExtractor("Ciao, io sono Federico !!");

        System.out.println(extractor.getUnicodeCharacterAtIndex(0));
        System.out.println(extractor.getUnicodeCharacterAtIndex(6));
        System.out.println(extractor.getUnicodeCharacterAtIndex(12));
        System.out.println(extractor.getUnicodeCharacterAtIndex(18));
        System.out.println(extractor.getUnicodeCharacterAtIndex(24));
        System.out.println(extractor.getUnicodeCharacterAtIndex(30));
    }

    public static class UnicodeCharacterExtractor {

        private final String inputString;

        public UnicodeCharacterExtractor(String inputString) {
            this.inputString = inputString;
        }

        public String getUnicodeCharacterAtIndex(int i) {
            StringBuilder result = new StringBuilder();

            if (i >= 0 && i < inputString.length()) {
                char character = inputString.charAt(i);
                result.append("Il carattere in posizione ").append(i).append(" è: ").append(Integer.toHexString(character | 0x10000).substring(1));
            } else {
                result.append("Errore: Posizione non valida.");
            }

            return result.toString();
        }


    }

}

