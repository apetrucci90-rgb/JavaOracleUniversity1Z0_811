package ripassomirato;

public class OverrideOverload {
    public static void main(String[] args) {
        
        Animale a = new Cane();
        System.out.println(a.verso());
        System.out.println(a.verso(3));
    }
}

class Animale {
    String verso() { return "..."; }
}

class Cane extends Animale {
    @Override
    public String verso() { return "Bau"; }

    String verso(int volte) {
        String risultato = "";
        for (int i = 0; i < volte; i++) risultato += "Bau ";
        return risultato;
    }
}