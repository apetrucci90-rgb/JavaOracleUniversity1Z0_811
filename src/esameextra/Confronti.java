package esameextra;

public class Confronti {
    public static void main(String[] args) {

        String a = "ciao";
        String b = "ciao";
        String c = new String("ciao");

        System.out.println(a == b); // true
        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true
        System.out.println(a.compareTo("ciao")); // 0
        System.out.println(a.compareTo("casa")); // 8

    }    
}

/*
______________________________
1) System.out.println(a == b);
a e b sono lo stesso letterale. Java tiene i letterali uguali in un deposito
condiviso (String pool): puntano allo stesso oggetto in memoria 

______________________________
2) System.out.println(a == c);
c = new String; il new crea un oggetto nuovo e separato. Stesso contenuto,
indirizzo diverso. == confronta i riferimenti, non le lettere.

___________________________________
3) System.out.println(a.equals(c));
.equals() confronta il contenuto, carattere per carattere. a e c sono
uguali: per vedere se il contenuto di una String combacia uso sempre il
metodo .equals(), dà risposta giusta sia col Pool che col new.

___________________________________________
4) System.out.println(a.compareTo("ciao"));
.compareTo() cammina sulle due stringhe, una lettera per volta e, appena
ne trova una diversa si ferma. Appena due lettere differiscono, restituisce 
la differenza dei loro codici e si ferma. Qui finisce il giro senza trovare
differenze e restituisce 0.

____________________________________________
5) System.out.println(a.compareTo("casa"));
.compareTo() restituisce la differenza dei codici: 'i' - 'a' = 105 - 97 = 8
Il conto è sempre: ricevente - argomento.
Il segno lo ricavo dall'ordine alfabetico: negativo / 0 / positivo. Il segno
si ricava dall'ordine alfabetico: 'm' viene dopo di 'd' quindi sarà positivo;
'm' == 'm' quindi ottendo 0
'a' viene prima di 'm' ed ottengo un negativo
*/









