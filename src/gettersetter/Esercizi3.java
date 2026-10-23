package gettersetter;

public class Esercizi3 {
    public static void main(String[] args) {

        Rettangolo r = new Rettangolo();
        r.setBase(4);
        r.setAltezza(2.5);
        System.out.println("Area: " + r.getArea());
        System.out.println("Quadrato? " + r.isQuadrato());

        Triangolo t = new Triangolo();
        t.setBase(7);
        t.setAltezza(9);
        System.out.println("Area: " + t.getArea());
        System.out.println("Grande? " + t.isGrande());
        t.setBase(-1);
        t.setAltezza(3);
        System.out.println("Area: " + t.getArea());
        System.out.println("Grande? " + t.isGrande());
    }  
}

class Rettangolo {
    private double base;
    private double altezza;
    public void setBase(double base) {
         if (base > 0) {
            this.base = base;
        } else {
            System.out.println("ERRORE: il numero deve essere positivo");
        }
    }
    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("ERRORE: il numero deve essere positivo");
        }
    }
    public double getBase() { return base; }
    public double getAltezza() { return altezza; }

    public double getArea() {
        return base * altezza;
    }

    public boolean isQuadrato() {
        return base == altezza;
    }
}

class Triangolo {
    private double base;
    private double altezza;
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("ERRORE!");
        }
    }
    public void setAltezza(double altezza) {
        if (altezza > 0) {
            this.altezza = altezza;
        } else {
            System.out.println("ERRORE!");
        }
    }
    public double getBase() { return base; }
    public double getAltezza() { return altezza; }

    public double getArea() {
        return (base * altezza) / 2;
    }
    public boolean isGrande() {
        if (getArea() > 10) {
            return true;
        } else {
            return false;
        }
    }
}














