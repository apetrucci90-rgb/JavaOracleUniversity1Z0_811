package stage;

public class TemperatureLab {
    public static void main(String[] args) {

        // Temperature in Celsius
        double t1 = 21.5, t2 = 4.0, t3 = 37.0;

        // final non si può più riassegnare, è una
        // costante. Convenzione: maiuscolo
        final double ABSOLUTE_ZERO = -273.15;

        /* 
        Conversione da Celsiu a Fahrenheit
            F = C * 9.0 / 5 + 32
        Conversione da Celsius a Kelvin
            K = C + 273.15
        */ 

        // Conversoni di t1, uso 9.0 così la divisione
        // è tra double e NON tronca
        
        double f = t1 * 9.0 / 5 + 32;

        double k = t1 + 273.15;

        System.out.println(t1 + " C = " + f + " F");
        System.out.println(t1 + " C = " + k + " K");

        /*
        Media: stesso calcolo, due meccanismi diversi.
        int tronca i decimali
        Con double li tengo
        */
        int mediaInt = (int) ((t1 + t2 + t3) / 3);
        double mediaDouble = (t1 + t2 + t3) / 3;

        System.out.println("media (int): " + mediaInt);
        System.out.println("media (double): " + mediaDouble);

        // Il bug del troncamento: (9 / 5) tra interi 
        // fa 1, non 1.8

        double senzaParentesi = t1 * 9 / 5 + 32; // t1 * 9 è già double -> 70.7 OK
        double conParentesi = t1 * (9 / 5) + 32; // t1 * (...) si fa prima e da 1 -> 53.5

        System.out.println("f = " + senzaParentesi);
        System.out.println("g = " + conParentesi);

        // ESERCIZIO

        int caramelle = 25;
        int bambini = 4;

        int carBam = caramelle / bambini;

        System.out.println("Caramelle a testa: " + carBam);

        int carRes = caramelle % bambini;
        System.out.println("Avanzano: " + carRes);
        
        double valReal = caramelle / (double)bambini;
        System.out.println("Valore reale: " + valReal);

        double sbagliato = caramelle / bambini;
        double giusto = caramelle / (double)bambini;

        System.out.println("sbagliato = " + sbagliato);
        System.out.println("giusto = " + giusto);

    }
    
}
