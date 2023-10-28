public class Esercizio26 {


    //Questo codice mi sono fatto aiutare a correggerlo da chat GPT perchè non riuscivo a
    //capire come dover reinserire i valori nell'array per farli vedere.
    //Mi dava sempre errore e non riuscivo ad andare avanti.
    //Dopo l'aiuto ho capito come poter fare tutto, ma preferirei comunque una spiegazione
    //appena ci rivediamo.

    public static void main(String[] args) {
        int[] originale = {1, 2, 3, 1, 4, 2, 5, 3, 5, 6, 7, 6, 8, 9};

        int[] risultato = noDuplicati(originale);
        System.out.println("Il risultato dell'array è: ");
        for (int numeri : risultato){
            System.out.println(numeri + ", ");
        }
    }

    public static int[] noDuplicati(int[] originale) {
          int numero = originale.length;
          int newNumber = 0;
          for (int i=0; i < numero; i++){
              boolean numeriDuplicati = false;
              for (int j=0; j < i; j++){
                  if (originale[i] == originale[j]){
                      numeriDuplicati = true;
                      break;
                  }
              }
              if (!numeriDuplicati){
                  newNumber++;
              }

          }


          int[] risultato = new int[newNumber];
          int n = 0;
          for (int i=0; i<numero; i++){
              boolean numeriDuplcati = false;
              for (int j = 0; j<i; j++){
                  if (originale[i] == originale[j]){
                      numeriDuplcati = true;
                      break;
                  }
              }
              if (!numeriDuplcati){
                  risultato[n] = originale[i];
                  n++;
              }
          }
          return risultato;
    }


}
