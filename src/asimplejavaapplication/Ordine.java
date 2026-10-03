package asimplejavaapplication;

public class Ordine {
    public static void main(String[] args) {
        System.out.println("Ordine per: " + args[0]);
        System.out.println("Tavolo: " + args[1]);
    } 
}

/*
Dato che non ho scritto niente dopo il nome della classe, la JVM ja creato args
vuoto, con 0 caselle.
EXAM
compile != run
*/