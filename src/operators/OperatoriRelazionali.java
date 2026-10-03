package operators;

public class OperatoriRelazionali {
    public static void main(String[] args) {
        /*
        Gli operatori relazionali confrontano due valori
        e danno SEMPRE un boolean: ==, !=, >, >=, <, <=,
        ! (inverte un booleano)
        */

        int temperatura = 75;

        System.out.println(temperatura == 75);
        System.out.println(! (temperatura == 75));
        System.out.println(temperatura != 100);
    }
    
}
