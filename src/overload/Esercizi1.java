package overload;

/*
Una classe Calcolatrice con tre metodi somma (stesso nome, parametri diversi
 = overload). Il main ne chiama una ciascuna e stampa il risultato. Java 
 sceglie da solo quale versione in base agli argomenti.
*/
public class Esercizi1 {
    public static void main(String[] args) {

        Calcolatrice c = new Calcolatrice();
        System.out.println(c.somma(3, 4));
        System.out.println(c.somma(3, 5, 2));
        System.out.println(c.somma(2.4, 6.3));
        System.out.println(c.raddoppia(9));
        System.out.println(c.raddoppia("Java "));
        System.out.println(c.descrivi("Andrea", 36));
        System.out.println(c.descrivi(36, "Andrea"));

    }
}

class Calcolatrice {
    public int somma(int a, int b) {
        return a + b;
    }
    public int somma(int a, int b, int c) {
        return a + b + c;
    }
    public double somma(double a, double b) {
        return a + b;
    }
    public int raddoppia(int n) {
        return n * 2;
    }
    public String raddoppia(String s) {
        return s + s;
    }
    public String descrivi(String nome, int eta) {
        return nome + " ha " + eta + " anni";
    }
    public String descrivi(int eta, String nome) {
        return eta + " anni per " + nome;
    }
}
