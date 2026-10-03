package operators;

public class OperationResults {
    public static void main(String[] args) {
        /*
        Se entrambi gli operandi di una divisione sono
        int, il risultato è int: la parte decimale viene troncata
        prima ancora di essere assegnata, anche se le inserisco
        in una variabile double.
        */
       
        int pizze = 7;
        int persone = 2;

        double pizzePersona = pizze / persone;

        System.out.println(pizze / persone);
        System.out.println(pizzePersona);
        System.out.println(pizze / (double)persone);

        int pizze1 = 7;
        double persone1 = 2;

        System.out.println(pizze1 / persone1);

    }
    
}
