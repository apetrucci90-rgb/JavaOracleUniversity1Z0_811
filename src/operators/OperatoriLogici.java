package operators;

public class OperatoriLogici {
    public static void main(String[] args) {
        int temp = 80;
        int minuti = 3;

        boolean servibile = temp >= 75 && minuti >= 2;
        boolean nonServibile = temp < 75 || minuti < 2;

        System.out.println(servibile);
        System.out.println(nonServibile);
    }
    
}
