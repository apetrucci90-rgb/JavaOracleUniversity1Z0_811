package exceptions;

public class Esercizi3 {
    /*
    static = lo chiamo senza creare un oggetto, direttamente dal main.

    void = non restituisce niente (non fa return di un valore)

    controllaEta(int eta) = il nome che ho scelto che riceve un parametro.

    throw new IllegalArgumentException(...) = costruisce l'oggetto-eccezione, 
        passandogli un messaggio. Il testo diventerà e.getMessage()
        
        throw = lancia quell'oggetto, da questo istante il metodo si interrompe:
            salta tutto il resto e l'eccezione "sale" verso chi l'ha chiamata.
    */
   //ETA'
    static void controllaEta(int eta) {
        if (eta < 0) {
            throw new IllegalArgumentException("Eta' negativa: " + eta);
        }
        System.out.println("Eta' OK: " + eta);
    }
    
    // PREZZO
    static void controllaPrezzo(double prezzo) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Prezzo negativo: " + prezzo);
        }
        System.out.println("Prezzo OK: " + prezzo);
    }

    // VOTO
    static void controllaVoto(int voto) {
        if (voto < 0 || voto > 10) {
            throw new IllegalArgumentException("Voto fuori da 0-10: " + voto);
        }
        System.out.println("Voto OK: " + voto);
    }

    // PERCENTUALE
    static void controllaPercentuale(double percentuale) {
        if (percentuale < 0 || percentuale > 100) {
            throw new IllegalArgumentException("Percentuale fuori range 0-100: " 
                + percentuale);
        }
        System.out.println("Percentuale OK: " + percentuale);
    }

    // NOME
    static void controllaNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Stringa vuota: " + nome + " .");
        }
        System.out.println("Nome OK: " + nome);
    }

    // QUANTITA
    static void controllaQuantita(int quantita) {
        if (quantita <= 0) {
            throw new IllegalArgumentException("Quantita' <= 0: " + quantita);
        }
        System.out.println("Quantita' OK: " + quantita);
    }

    // TEMPERATURA
    static void controllaTemperatura(double temperatura) {
        if (temperatura < 0 || temperatura > 300) {
            throw new IllegalArgumentException("Temperatura fuori 0-300 °C: " + temperatura);
        }
        System.out.println("Temperatura OK: " + temperatura);
    }

    // ANNO
    static void controllaAnno(int anno) {
        if (anno < 1900 || anno > 2026) {
            throw new IllegalArgumentException("Anno fuori range (1900-2026): " 
                + anno);
        }
        System.out.println("Anno OK: " + anno);
    }

    // SCONTO
    static void controllaSconto(double sconto) {
        if (sconto < 0 || sconto > 50) {
            throw new IllegalArgumentException("Sconto fuori range 0-50: " + sconto);
        }
        System.out.println("Sconto OK: " + sconto);
    }
    
    // POSITIVO
    static int leggiPositivo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Numero negativo: " + n);
        } else {
            return n;
        }
    }
    
    
    
    
    public static void main(String[] args) {

        controllaEta(34); // chiamo il metodo passandogli 34
        // controllaEta(-55); // l'if è vero, scatta il throw, l'eccezione sale al
                            // main, nessun try/catch la prende, stop qui.
        

        /*
        try { ... } -- prova ad eseguire queste righe, sapendo che potrebbero
            scoppiare. Dentro ci metto solo la chiamata pericolosa.
        
        catch (IllegalArgumentException e) -- la rete. Prende l'eccezione solo se
            è di quel tipo. e è l'oggetto-eccezione catturato: da questo tiro
            fuori e.getMessage()
        */

        // =======================================
        // PREZZO

        controllaPrezzo(22.59);
        try {
            controllaPrezzo(-5.25);
        } catch (IllegalArgumentException e) {
            System.out.println("Preso: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // =======================================
        // VOTO
        controllaVoto(9);
        try {
            controllaVoto(-8);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        try {
            controllaVoto(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Preso: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // ========================================
        // PERCENTUALE
        controllaPercentuale(85.55);
        try {
            controllaPercentuale(-15);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        try  {
            controllaPercentuale(150);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // ========================================
        // NOME
        controllaNome("Andrea");
        try {
            controllaNome("");
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // =========================================
        // QUANTITA
        controllaQuantita(1400);
        try {
            controllaQuantita(0);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // =========================================
        // TEMPERATURA
        controllaTemperatura(220);
        try {
            controllaTemperatura(-150);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        try {
            controllaTemperatura(301);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // ==========================================
        // ANNO
        controllaAnno(1990);
        try {
            controllaAnno(1799);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        try {
            controllaAnno(2028);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // ==========================================
        // SCONTO
        controllaSconto(45.5);
        try {
            controllaSconto(-15.5);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");

        // ==========================================
        // POSITIVO
        int x = leggiPositivo(7);
        System.out.println("Ricevuto: " + x);
        try {
            leggiPositivo(-2);
        } catch (IllegalArgumentException e) {
            System.out.println("PRESO: " + e.getMessage());
        }
        System.out.println("...il programma CONTINUA");
    }   
}
