package arrays;
import java.util.ArrayList;
import java.util.Arrays;


public class RipassoArray2 {
    public static void main(String[] args) {
        
        int[] prezzi = {12,  5, 20, 8};
        System.out.println("Numero prezzi: " + prezzi.length);
        System.out.println("Ultimo elemento: " + (prezzi[prezzi.length - 1]));

        int[] ordinati = Arrays.copyOf(prezzi, prezzi.length);
        Arrays.sort(ordinati);
        System.out.println("prezzi: " + Arrays.toString(prezzi));
        System.out.println("ordinati: " + Arrays.toString(ordinati));

        int [] alias = prezzi;
        alias[0] = 999;
        System.out.println("primo prezzo: " + alias[0]);

        // RIPASSO TAPPA 9
        ArrayList<String> turni = new ArrayList<>();
        turni.add("mattina");
        turni.add("pomeriggio");
        turni.add("notte");
        
        turni.remove("pomeriggio");

        System.out.println("lista turni: " + turni + " | lunghezza lista: " + turni.size());
    }
    
}
