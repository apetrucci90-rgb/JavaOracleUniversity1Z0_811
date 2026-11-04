package interfaces;

// IL CONTRATTO (interface)
/*
'interface' non è una classe. E' un contratto: un elenco
di capacità. Dice COSA si deve saper fare, mai COME.
Non ha stato (state: campi d'istanza), non ha costruttore
(constructor), non si può istanziare (come abstract). 
I suoi metodi sono SENZA corpo: sono promesse che 
qualcun'altro manterrà
*/

interface Pagabile {

    /*
    Firma del metodo (method signatura), niente corpo: 
    solo ;.
    E' implicitamente 'public abstract' -  non serve 
    scriverlo in un interface. Chiunque sia pagabile deve
    saper dire il proprio importo.
    */
    double importo();
}

// PRIMA CLASSE CHE FIRMA IL CONTRATTO (implements)
/*
'implements Pagabile' = Fattura si impegna a rispettare
il contratto Pagabile. Conseguenza OBBLIGATORIA: deve
fornire il corpo di importo(), altrimenti Fattura
resterebbe astratta e, essenco concreta, NON compilerebbe.
*/

class Fattura implements Pagabile {

    /*
    Stato (state) PROPRIO di Fattura: questi campi stanno
    nella classe, NON nel contratto. L'interface non li
    conosce: vuole solo un importo.
    */

    private double imponibile;
    private double iva;

    // Costruttore: esiste nella CLASSE, mai nell'interface
    Fattura(double imponibile, double iva) {
        this.imponibile = imponibile;
        this.iva = iva;
    }
    /*
    Qui sto riempiendo un metodo che il contratto ha
    imposto. Non è obbligatoria, ma se la metto il
    compilatore mi protegge
    */

    @Override
    public double importo() {
        // Il COME è deciso da Fattura: imponibile + iva
        return imponibile + (imponibile * iva / 100);
    }
}

// SECONDA CLASSE, scollegata da Fattura, stesso contratto
/*
Stipendio e Fattura non sono parenti, non hanno un padre 
comune. Con l'abstract class dovevano esserlo. Con
interface no: basta che entrambe sappiano fare importo()
(implements = è capace di)
*/

class Stipendio implements Pagabile {
    private double lordo;
    private double trattenute;

    Stipendio(double lordo, double trattenute) {
        this.lordo = lordo;
        this.trattenute = trattenute;
    }
    @Override
    public double importo() {
        return lordo - trattenute;
    }
}

// TERZA CLASSE

class Bolletta implements Pagabile {
    private double consumo;
    private double tariffa;

    Bolletta(double consumo, double tariffa) {
        this.consumo = consumo;
        this.tariffa = tariffa;
    }

    @Override
    public double importo() {
        return consumo * tariffa;
    }
}








public class Esercizi1 {
    public static void main(String[] args) {

        // IL MAIN - dove si vede il polimorfismo
        /*
        Array del TIPO DELL'INTERFACCIA (Pagabile[]), non 
        delle singole classi. E' questo che permette di mettere
        insieme 3 classi scollegate: la sola cosa in comune
        è "sono Pagabile". Un ogggetto Fattura "è anche" un
        Pagabile -> ci sta dentro (upcasting).
        */

        Pagabile[] daPagare = {
            new Fattura(1000, 22),
            new Stipendio(2000, 300),
            new Bolletta(150, 0.25)
        };
        double totale = 0; // accumulatore

        for (Pagabile p : daPagare) {
            System.out.println("Importo: " + p.importo());

            totale += p.importo();
        }
        System.out.println("Totale da pagare: " + totale);
    }
}


















