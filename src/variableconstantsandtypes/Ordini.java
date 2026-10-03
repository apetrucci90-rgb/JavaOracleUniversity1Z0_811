package variableconstantsandtypes;

public class Ordini {
    public static void main(String[] args) {
    int ordini;
    ordini = 12;
    System.out.println(ordini);
    }
}

/*
L'errore arriva quando javac legge il file: il compilatore si accorge che usi 'ordini'
senza avergli mai dato un valore e si rifiuta di creare il .class. 
____________________________________________________________________________________
Una variabile dichiarata dentro un metodo (local variable) non riceve alcun valore
automatico. Va SEMPRE inizializzata prima di usarla altrimenti il programma non
compila
*/