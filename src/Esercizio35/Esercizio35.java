package Esercizio35;

import Esercizio34.Triangolo;

public class Esercizio35 {
        public static void main(String[] args) {
            System.out.println("La forma è: ");
            Rettangolo rettangolo = new Rettangolo(10, 5);
            rettangolo.calcolaArea();
            Esercizio34.Triangolo triangolo= new Triangolo(10, 5);
            triangolo.calcolaArea();
        }


    }


