package methods;

/*
RIPASSO METODI 4 - "Pagella"
Dati nel main
  int[] votiAnna = {7, 8, 6, 9};
  int[] votiLuca = {4, 5, 6, 3};

Scrivere 3 metodi:
  1) media(int[] voti)    -> DOMANDA (double): la media dei voti (cast a double).
  2) promosso(int[] voti) -> DOMANDA (boolean): true se la media è >= 6.
                             Dentro RICHIAMA media (composizione).
  3) pagella(String nome, int[] voti) -> COMANDO (void): stampa
     "<nome>: media X, promosso? true/false", richiamando media e promosso.

Nel main: pagella("Anna", votiAnna);  e  pagella("Luca", votiLuca);
*/
public class RipassoMetodi4 {
    public static void main(String[] args) {
        int[] votiAnna = {7, 8, 6, 9};
        int[] votiLuca = {4, 5, 6, 3};
        
        System.out.println("media voti Anna: " + media(votiAnna) + ", promosso? " 
                            + promosso(votiAnna));
        System.out.println("media voti Luca: " + media(votiLuca) + ", promosso? "
                            + promosso(votiLuca));

    }
    static double media(int[] voti) {
        int somma = 0;
        for (int i = 0; i < voti.length; i++) {
            somma += voti[i];
        }
        return (double) somma / voti.length;
    }
    static boolean promosso(int[] voti) {
        return media(voti) >= 6;
    }
    static void pagella(String nome, int[] voti) {
        System.out.println("Nome: " + nome + "| media: " + media(voti) + 
        " | promosso? " + promosso(voti));
    }
}
