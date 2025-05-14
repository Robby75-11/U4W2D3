import java.util.HashSet;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante parole vuoi inserire?");

        int n = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> paroleDistinte = new HashSet<>();
        HashSet<String> paroleDuplicate = new HashSet<>();

        for (int i=0; i < n; i++) {
            System.out.println("Inserisci parola #" + (i+1) + ": ");

            String p = scanner.nextLine();

            if (!paroleDistinte.add(p)) {
                paroleDuplicate.add(p);

            }
        }

        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + paroleDistinte.size());
        System.out.println("elenco parole distinte: " + paroleDistinte);

    }
}
