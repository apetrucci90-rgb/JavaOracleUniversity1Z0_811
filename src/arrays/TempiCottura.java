package arrays;

public class TempiCottura {
    public static void main(String[] args) {
        int[] tempi = {8, 22, 25, 45, 68, 90};

        int tempoTot = 0;
        int lunghe = 0;

        for (int tempo : tempi) {
            System.out.println(tempo);
            tempoTot =  tempoTot + tempo;
            if (tempo > 30) {
                lunghe++;
            }
        }
        System.out.println("tempo totale = " + tempoTot);
        System.out.println("pietanze oltre 30 min = " + lunghe);

        double media = (double) tempoTot / tempi.length;
        System.out.println("media = " + media);

    }   
}
    
