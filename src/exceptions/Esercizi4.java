package exceptions;

public class Esercizi4 {

    /*
    Thread.sleep(ms)
    Mette in pausa il programma per un tot di millisecondi. Durante questa 
    pausa non esegue niente, aspetta e basta. I millisecondi li decide il 
    metodo Thread.sleep(...), sono il conteggio implicito.

    Thread -> è una classe di Java (java.lang). E' il filo di esecuzione

    .sleep(...) -> chiama il metodo sleep che appartiene a Thread. E' lo stesso
        meccanismo di System.out.print(...) = nome.metodo(...)

    Una checked come InterruptedException deve essere fermata ad ogni piano
    che attraversa, in due modi:
        1) la catturo con try / catch
        2) la dichiaro con throws
        
    
    */
    static void attendi(int ms) throws InterruptedException {
        Thread.sleep(ms);
        System.out.println("Atteso " + ms + " ms");
    }
    
    static void fase() throws InterruptedException {
        System.out.println("Inizio fase");
        attendi(200);
        System.out.println("Fine fase");

    }





    public static void main(String[] args) throws InterruptedException {
        attendi(100);
        fase();

    
    }
}
