package stage;
/*
Hai i coperti serviti in 10 servizi di sala, in 
quest’ordine: 45, 60, 0, 80, 52, 0, 95, 38, 70, 0. 
Un servizio con zero coperti è un giorno di chiusura, 
non un servizio reale, e va ignorato esattamente come 
ignoravi gli storni negli incassi. La capienza massima 
della sala è 90 coperti.

Nella prima parte, con una sola scansione dell’array e 
saltando i giorni di chiusura, calcoli quanti servizi 
sono stati davvero aperti, il totale dei coperti serviti,
 e la media dei coperti per servizio aperto facendo 
 attenzione al cast, perché stavolta la media non viene 
 un numero tondo. Nella stessa scansione individui anche 
 il servizio più pieno e quello più vuoto, ciascuno con 
 la sua posizione nell’array, e alla fine calcoli la 
 forbice, cioè la differenza tra il più pieno e il più 
vuoto.

Nella seconda parte fai un controllo di sicurezza a sé: 
scorri di nuovo i servizi e, appena incontri il primo 
servizio aperto che supera la capienza massima della 
sala, segnali a quale posizione è accaduto e fermi 
subito la ricerca, senza continuare a guardare i servizi 
successivi.

Alla fine il programma deve stampare, nell’ordine: 
servizi aperti, totale coperti, media, servizio più pieno
con posizione, servizio più vuoto con posizione, forbice,
e la riga dell’overbooking.
*/
public class ControlloSala {
    public static void main(String[] args) {
        int[] coperti = {45, 60, 0, 80, 52, 0, 95, 38, 70, 0};
        int capienzaMaxSala = 90;
        int totCoperti = 0;
        int serviziAperti = 0;
        int max = coperti[0];
        int indiceMax = 0;
        int min = coperti[0];
        int indiceMin = 0;
        
        for (int i = 0; i < coperti.length; i++) {
            if (coperti[i] == 0) {
                continue;
            }
            totCoperti = totCoperti + coperti[i];
            serviziAperti++;

            if (coperti[i] > max) {
                max = coperti[i];
                indiceMax = i;
            }
            if (coperti[i] < min) {
                min = coperti[i];
                indiceMin = i;
            }
        }
        double mediaServizi = (double)totCoperti / serviziAperti;
        int forbice = max - min;

        System.out.println("Servizi aperti: " + serviziAperti);
        System.out.println("Totale coperti: " + totCoperti);
        System.out.println("Media coperti per servizi aperti: " + mediaServizi);
        System.out.println("massimo = " + max + " posizione " + indiceMax);
        System.out.println("minimo = " + min + " posizione " + indiceMin);
        System.out.println("Forbice (max - min): " + forbice);
        
        for (int i = 0; i <coperti.length; i++) {
            if (coperti[i] == 0) {
                continue;
            }
            if (coperti[i] > capienzaMaxSala) {
                System.out.println("Overbooking al servizio: " + i + " (" + coperti[i] + " coperti)");
                break;

            }
        }
    }
}
    

/*

ESERCIZIO 1.

OUTPUT ATTESO:
Servizi aperti: 7
Totale coperti: 440
Media coperti per servizio aperto: 62.857142857142854
massimo = 95 posizione 6
minimo = 38 posizione 7
Forbice (max - min): 57
Overbooking al servizio 6 (95 coperti)
*/