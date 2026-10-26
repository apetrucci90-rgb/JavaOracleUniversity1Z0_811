/*
FILE: Piatto.java - package codeaggregration.cucina
Classe mattone: rappresenta un piatto. Vive in un package SUO (cucina),
separato dalla classe col main, così quella la devo importare.
*/
package codeaggregration.cucina;
/*
prima riga di codice

public così Piatto è visibile da ALTRI package

Senza public la classe è visibile solo nel suo stesso package,
non da un altro package.
*/
public class Piatto {
    // campo private: incapsulato, si tocca solo da dentro questa classe
    private String nome;

    //costruttore: riceve il nome e lo salva. this.nome = campo, nome = parametro
    public Piatto(String nome) {
        this.nome = nome;
    }
    // il getter è il solo modo per leggere il nome da fuori, visto che il campo
    // è private.
    public String getNome() {
        return nome;
    }
    
}
