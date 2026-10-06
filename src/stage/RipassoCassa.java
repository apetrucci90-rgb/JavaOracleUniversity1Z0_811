package stage;

public class RipassoCassa {
    public static void main(String[] args) {
        int coperti = 4;
        int porzioniPane = 9;
        double prezzoPiatto = 12.5;
        int quantita = 3;

        System.out.println("Conto piatti: " + (prezzoPiatto * quantita));

        int paneAPersona = porzioniPane / coperti;
        System.out.println("Pane per persona " + paneAPersona);

        int paneAvanzato = porzioniPane % coperti;
        System.out.println("Pane avanzato: " + paneAvanzato);

        double conto = (prezzoPiatto * quantita) ;
        conto += 5;
        System.out.println("Conto totale: " + conto);

        coperti ++;
        System.out.println("Coperti aggiornati: " + coperti);

        boolean tavoloPieno = coperti >= 5 && conto > 40;
        System.out.println(tavoloPieno);

        String esito = (tavoloPieno == true) ? "Tavolo completo" : "C'è posto";
        System.out.println(esito);

    }
    
}
