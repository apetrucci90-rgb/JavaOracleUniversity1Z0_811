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

class Rombo extends Figura {
    private double diag1;
    private double diag2;
    private double lato;

    Rombo(double diag1, double diag2, double lato) {
        super("Rombo");
        this.diag1 = diag1;
        this.diag2 = diag2;
        this.lato = lato;
    }
    @Override
    public double area() {
        return (diag1 * diag2) / 2;
    }
    @Override
    public double perimetro() {
        return lato * 4;
    }
}

class Parallelogramma extends Figura {
    private double base;
    private double altezza;
    private double latoObliquo;
    
    Parallelogramma(double base, double altezza, double latoObliquo) {
        super("Parallelogramma");
        this.base = base;
        this.altezza = altezza;
        this.latoObliquo = latoObliquo;
    }
    @Override
    public double area() {
        return base * altezza;
    }
    @Override
    public double perimetro() {
        return (base + latoObliquo) * 2;
    }
}

class Trapezio extends Figura {
    private double baseMag;
    private double baseMin;
    private double altezza;
    private double lato1;
    private double lato2;

    Trapezio(double baseMag, double baseMin, double altezza,
        double lato1, double lato2) {
            super("Trapezio");
            this.baseMag = baseMag;
            this.baseMin = baseMin;
            this.altezza = altezza;
            this.lato1 = lato1;
            this.lato2 = lato2;
    }
    @Override 
    public double area() {
        return (baseMag + baseMin) * altezza / 2;
    }
    @Override
    public double perimetro() {
        return baseMag + baseMin + lato1 + lato2;
    }
}

class PentagonoRegolare extends Figura {
    private double lato;
    private double apotema;

    PentagonoRegolare(double lato, double apotema) {
        super("Pentagono Regolare");
        this.lato = lato;
        this.apotema = apotema;
    }
    @Override
    public double perimetro() {
        return lato * 5;
    }
    @Override
    public double area() {
        return perimetro() * apotema / 2;
    }
}

class EsagonoRegolare extends Figura {
    private double lato;
    private double apotema;

    EsagonoRegolare(double lato, double apotema) {
        super("Esagono Regolare");
        this.lato = lato;
        this.apotema = apotema;
    }
    @Override
    public double perimetro() {
        return lato * 6;
    }
    @Override
    public double area() {
        return perimetro() * apotema / 2;
    }
}


public class Esercizi1 {
    public static void main(String[] args) {
        // Figura f1 = new Figura("test");

        Figura[] figure = {
        new Cerchio(5),
        new Quadrato(6),
        new Rettangolo(9, 3),
        new TriangoloRettangolo(3, 7),
        new TriangoloEquilatero(8),
        new Rombo(3, 4, 5),
        new Parallelogramma(4, 6, 8),
        new Trapezio(8, 5, 15, 4, 4),
        new PentagonoRegolare(4, 6),
        new EsagonoRegolare(5, 8)
        };
    }
    for (Figura f : figure) {
        System.out.println()
    } 
}
