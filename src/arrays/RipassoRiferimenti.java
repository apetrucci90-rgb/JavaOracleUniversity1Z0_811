package arrays;
import java.util.Arrays;

public class RipassoRiferimenti {
    public static void main(String[] args) {
        int[] v = {10, 20, 30};
        int[] w = v;
        w[2] = 999;

        System.out.println("v = " + Arrays.toString(v));
        System.out.println("w = " + Arrays.toString(w));
    }
    
}
