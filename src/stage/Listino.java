package stage;

public class Listino {

    public static void main(String[] args) {
        String piatto1 = "Carbonara";
        double prezzo1 = 12.5;
        
        String piatto2 = "Amatriciana";
        double prezzo2 = 11.0;

        String piatto3 = "Cacio e pepe";
        double prezzo3 = 10.5;

        String piatto4 = "Gricia";
        double prezzo4 = 11.5;

        String piatto5 = "Tiramisù";
        double prezzo5 = 6.0;

        System.out.println(piatto1 + " - " + prezzo1);
        System.out.println(piatto2 + " - " + prezzo2);
        System.out.println(piatto3 + " - " + prezzo3);
        System.out.println(piatto4 + " - " + prezzo4);
        System.out.println(piatto5 + " - " + prezzo5);

        double totale = prezzo1 + prezzo2 + prezzo3 + prezzo4 + prezzo5;        
        System.out.println("Totale: " + totale);
        
        double media = totale / 5;
        System.out.println("Media: " + media);

        double sconto = totale * 10 / 100;
        System.out.println("Totale Scontato: " + (totale - sconto));

        System.out.println("4 Carbonara: " + (prezzo1 * 4));

    }
    
}
