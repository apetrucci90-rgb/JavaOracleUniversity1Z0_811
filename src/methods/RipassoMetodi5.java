package methods;

/*
RIPASSO METODI 5
1) minimo(int[] valori)   -> DOMANDA (int): il voto più BASSO dell'array.
2) giudizio(double media) -> DOMANDA (String): ridà
     "ottimo"        se media >= 8
     "sufficiente"   se media >= 6
     "insufficiente" altrimenti
Nel main: dato int[] voti = {7, 8, 6, 9}
  - stampa minimo(voti)
  - stampa giudizio(9.0), giudizio(7.0), giudizio(4.5)

Output atteso:
minimo = 6
giudizio 9.0 = ottimo
giudizio 7.0 = sufficiente
giudizio 4.5 = insufficiente
*/

public class RipassoMetodi5 {
    public static void main(String[] args) {
        int[] voti = {7, 8, 6, 9};

        System.out.println("minimo = " + minimo(voti));
        System.out.println("giudizio 9.0 = " + giudizio(9));
        System.out.println("giudizio 7.0 = " + giudizio(7));
        System.out.println("giudizio 4.5 = " + giudizio(4.5));

    }
    static int minimo(int[] valori) {
        int min = valori[0];
        for (int i = 0; i < valori.length; i++) {
            if (valori[i] < min) {
                min = valori[i];
            }
        }
        return min;
    }
    static String giudizio(double media) {
        if (media >= 8) {
            return "ottimo";
        } else if (media >= 6) {
            return "sufficiente";
        } else {
            return "insufficiente";
        }
        }
    }
    

