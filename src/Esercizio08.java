public class Esercizio08 {
    public static void main(String args[]) {
        int x = 38;
        int y = 22;
        int z = 43;

        System.out.println("La media è " + midOf (x, y, z));
    }
    public static float sumOf (double x, double y, double z){
        double k = x+y+z;
        return (float) k;
    }
    public static float midOf (double x, double y, double z){
        double g = (x+y+z)/3;
        return (float) g;
    }
}