package operators;

public class OperatoriComposti {
    public static void main(String[] args) {
        
    int totale = 100;

    totale += 20;
    System.out.println(totale);

    totale -= 30;
    System.out.println(totale);

    totale *= 2;
    System.out.println(totale);

    totale /= 3;
    System.out.println(totale);

    totale %= 7;
    System.out.println(totale);
    
    /*
    1. 5 % 8 = ? 
    2. 20 % 5 = ? // 0
    3. 17 % 5 = ? // 2 (5 * 3) -> 17 - 15 = 2 

    1. Quante volte ci sta 8 in 5? ZERO VOLTE (8 è più grande di 5). Quindi:
        - resto = 5 - (0 * 8) = 5 - 0 = 5
    
    SE IL DIVIDENDO E' PIU' PICCOLO DEL DIVISORE, non ci sta nemmeno una volta.
    Il resto è il dividendo stesso intero.
    E.g.= 3 % 10 = 3, 7 % 100 = 7, 0 % 4 = 0
    */

    }
}
