package esameextra;

public class Confronti2 {
    public static void main(String[] args) {

        String s1 = "java";
        String s2 = "java";
        String s3 = new String("java");
        String s4 = "Java";
        String s5 = "ja" + "va";
        String p = "ja";
        String s6 = p + "va";

        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s1.equals(s3)); // true
        System.out.println(s1 == s4); // false
        System.out.println(s1.equals(s4)); // false
        System.out.println(s1.equalsIgnoreCase(s4)); // trueControlla
        System.out.println(s1 == s5); // true Calcola le espressioni costanti
        // in compilazione (constant folding). Unisce 'ja' + 'va' mentre 
        // javac gira e finisce nel Pool. Stesso oggetto di s1.
        System.out.println(s1 == s6); // false
        System.out.println(s1.compareTo(s4)); // numero positivo: j = 106; J = 74
        System.out.println(s1.compareTo("javax")); // numero negativo: quando una 
        // stringa è l'inizio dell'altra, compareTo restituisce la differenza
        // di lunghezza. 4 - 5 = -1;
    }
}

/*
System.out.println(s1.equalsIgnoreCase(s4)); 
IgnoreCase ignora maiuscole e minuscole
*/