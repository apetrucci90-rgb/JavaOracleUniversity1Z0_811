package arrays;

public class Voti {
    public static void main(String[] args) {
        int[] voti = {7, 9, 6, 8, 10};
        int somma = 0;

        for (int voto : voti) {
            System.out.println("voto: " + voto);
            somma = somma + voto;
        }

        System.out.println("somma = " + somma);
    }
}
