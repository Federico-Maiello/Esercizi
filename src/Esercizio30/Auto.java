package Esercizio30;

public record Auto(int cilindrata, String targa, String marca, String modello) {

    @Override
    public String toString() {
        return "Studente{" +
                "cilindrata='" + cilindrata + '\'' +
                ", targa='" + targa + '\'' +
                ", marca='" + marca + '\'' +
                ", modello=" + modello +
                '}';
    }
}
