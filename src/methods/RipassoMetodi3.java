package methods;

public class RipassoMetodi3 {
    public static void main(String[] args) {

        System.out.println("Il maggiore tra 8 e 3 è: " + massimo(8, 3));
        System.out.println("Il maggiore tra 2.5 e 9.1 è: " + massimo(2.5, 9.1));

    }
    /*
    ES. 7 - OVERLOADING
    Due metodi con lo STESSO nome "massimo" ma parametri diversi:
        - massimo(int a, int b) -> il più grande fra due interi
        - massimo(double a, double b)  -> il più grande fra due decimali
    Nel main li provo tutti e due: massimo(8, 3) e massimo(2.5, 9.1).
    Java sceglie quale chiamare in base ai TIPI degli argomenti (la
     signature = nome + tipi dei parametri, NON il tipo di ritorno).
    
    Corpo di ogni metodo: if(a > b) return a; else return b;
    */
    static int massimo(int a, int b) {
        if (a > b) return a;
        else return b;
    }
    static double massimo(double a, double b) {
        if (a > b) return a;
        else return b;
    }

}
    

