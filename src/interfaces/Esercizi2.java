package interfaces;

interface Spedibile {
    double costo();
}

class Lettera implements Spedibile {
    private double grammi;
    
    Lettera(double grammi) {
        this.grammi = grammi;
    }

    @Override
    public double costo() {
        return 1.10 + grammi * 0.002;
    }
}

class Pacco implements Spedibile {
    private double kg;

    Pacco(double kg) {
        this.kg = kg;
    }
    @Override
    public double costo() {
        return kg * 3;
    }
}

class PaccoExpress implements Spedibile {
    private double kg;
    private double supplemento;

    PaccoExpress(double kg, double supplemento) {
        this.kg = kg;
        this.supplemento = supplemento;
    }
    @Override
    public double costo() {
        return kg * 3 + supplemento;
    }
}

class Bancale implements Spedibile {
    private int colli;
    private double costoCollo;

    Bancale(int colli, double costoCollo) {
        this.colli = colli;
        this.costoCollo = costoCollo;
    }

    @Override 
    public double costo() {
        return colli * costoCollo;
    }
}

class Container implements Spedibile {
    private double metriCubi;
    private double tariffa;

    Container(double metriCubi, double tariffa) {
        this.metriCubi = metriCubi;
        this.tariffa = tariffa;
    }
    @Override
    public double costo() {
        return metriCubi * tariffa;
    }
}

public class Esercizi2 {
    public static void main(String[] args) {

        Spedibile[] spedizioni = {
            new Lettera(175.0),
            new Pacco(5.55),
            new PaccoExpress(3.89, 15.5),
            new Bancale(8, 120.),
            new Container(1500, 2.25)
        };

        double totaleDaPagare = 0;

        for (Spedibile s : spedizioni) {
        System.out.println("Costo: " + s.costo());

        totaleDaPagare += s.costo();
        }
        System.out.println("Totale: " + totaleDaPagare);
    }  
}
