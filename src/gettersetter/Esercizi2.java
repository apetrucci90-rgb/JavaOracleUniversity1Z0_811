package gettersetter;

public class Esercizi2 {
    public static void main(String[] args) {
        
        Dipendente d = new Dipendente();
        d.setEta(36);
        System.out.println("Età: " + d.getEta());
        d.setEta(70);
        System.out.println("Età: " + d.getEta());

        Ordine o = new Ordine();
        o.setSconto(35);
        System.out.println("Sconto: " + o.getSconto());
        o.setSconto(150);
        System.out.println("Sconto: " + o.getSconto());

        Magazzino m = new Magazzino();
        m.setQuantita(1080);
        System.out.println("Quantità in magazzino: " +
        m.getQuantita());
        m.setQuantita(-3000);
        System.out.println("Quantità in magazzino: " +
            m.getQuantita());

        Piatto p = new Piatto();
        p.setPrezzo(19.90);
        System.out.println("Prezzo: " + p.getPrezzo() + " €");
        p.setPrezzo(-15.30);
        System.out.println("Prezzo: " + p.getPrezzo() + " €");

        Cliente c = new Cliente();
        c.setNome("Andrea");
        System.out.println("Nome: " + c.getNome());
        c.setNome("");
        System.out.println("Nome: " + c.getNome());

        Porzione w = new Porzione();
        w.setPeso(0.39);
        System.out.println("Peso: " + w.getPeso());
        w.setPeso(0.01);
        System.out.println("Peso: " + w.getPeso());
    }    
}
class Dipendente {
    private int eta;
    public void setEta(int eta) {
        if (eta >= 18 && eta <= 65) {
            this.eta = eta;
        } else {
            System.out.println("Età " + eta + " fuori range" +
            " 18-65: rifiutata");
        }
    }
    public int getEta() { return eta; }
}

class Ordine {
    private int sconto;
    public void setSconto(int sconto) {
        if (sconto >= 0 && sconto <= 100) {
            this.sconto = sconto;
        } else {
            System.out.println("Sconto " + sconto + 
            " fuori range 0-100: rifiutata");
        }
    }
    public int getSconto() { return sconto; }
}

class Magazzino {
    private int quantita;
    public void setQuantita(int quantita) {
        if (quantita >= 0) {
            this.quantita = quantita;
        } else {
            System.out.println("Quantità: " + quantita +
                ". Negativa, valore non valido");
        }
    }
    public int getQuantita() { return quantita; }
}

class Piatto {
    private double prezzo;
    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        } else {
            System.out.println("Prezzo: " + prezzo +
                ". Il prezzo non può essere negativo.");
        }
    }
    public double getPrezzo() { return prezzo; }
}

class Cliente {
    private String nome;
    public void setNome(String nome) {
        if (nome != null && nome.length() > 0) {
            this.nome = nome;
        } else {
            System.out.println("Nome: " + nome + "NON valido." +
                " Deve contenere almeno un carattere."); 
        }
    }
    public String getNome() { return nome; }
}

class Porzione {
    private double peso;
    public void setPeso(double peso) {
        if (peso >= 0.05 && peso <= 5.0) {
            this.peso = peso;
        } else {
            System.out.println("Peso non valido: " + peso +
                " RANGE valido tra 0.05 kg e 5.0 Kg");
        }
    }
    public double getPeso() { return peso; }
}


