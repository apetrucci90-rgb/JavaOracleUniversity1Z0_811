package abstractclasses;

abstract class Figura {
    protected String nome;

    Figura(String nome) {
        this.nome = nome;
    }

    /*
    public -> visibilità: chiunque può chiamare area e perimetro 
    dall'esterno.

    abstract -> la parola chiave che dice che questo metodo non ha corpo.

    area() -> il nome del metodo.

    () -> il metodo non riceve parametri.
    */
    public abstract double area();
    public abstract double perimetro();

    public String descrizione() {
        return nome + " | area: " + area() + " | perimetro: " + perimetro();
    }
}

class Cerchio extends Figura {
    private double raggio;

    Cerchio(double raggio) {
        super("Cerchio");
        this.raggio = raggio;
    }
    @Override
    public double area() {
        // Math.PI = pi greco
        return Math.PI * raggio * raggio;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * raggio;
    }
}

class Quadrato extends Figura {
    private double lato;

    Quadrato(double lato) {
        super("Quadrato");
        this.lato = lato;
    }
    @Override
    public double area() {
        return lato * lato;
    }
    @Override
    public double perimetro() {
        return lato * 4;
    }
}

class Rettangolo extends Figura {
    private double base;
    private double altezza;

    Rettangolo(double base, double altezza) {
        super("Rettangolo");
        this.base = base;
        this.altezza = altezza;
    }
    @Override
    public double area() {
        return base * altezza;
    }
    @Override
    public double perimetro() {
        return (base + altezza) * 2;
    }
}

class TriangoloRettangolo extends Figura {
    private double cateto1;
    private double cateto2;
     TriangoloRettangolo(double cateto1, double cateto2) {
        super("Triangolo Rettangolo");
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    @Override
    public double area() {
        return (cateto1 * cateto2) / 2;
    }
    @Override
    public double perimetro() {
        return cateto1 + cateto2 + Math.sqrt(cateto1*cateto1 + cateto2 * cateto2);
    }
}

class TriangoloEquilatero extends Figura {
    private double lato;

    TriangoloEquilatero(double lato) {
        super("Triangolo Equilatero");
        this.lato = lato;
    }
    @Override
    public double area() {
        return lato * lato * Math.sqrt(3) / 4;
    }
    @Override
    public double perimetro() {
        return lato * 3;
    }
}


















public class Esercizi1 {
    
}
