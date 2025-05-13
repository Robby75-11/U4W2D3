import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Collections;

public class Esercizio2 {

    public static List<Integer> generaLista(int n) {
        Random rand = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n ; i++) {
            lista.add(rand.nextInt(101));
        }

        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> ripetiLista(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            nuovaLista.add(lista.get(i));
            nuovaLista.add(lista.get(i));
        }
        return nuovaLista;
    }

    public static void stampaPariDispari(List<Integer> lista, boolean pari) {
        System.out.println("Valori in posizioni " + (pari ? "pari" : "dispari") + ":");
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0 || !pari && i % 2 != 0) {
                System.out.print(lista.get(i) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione della lista: ");
        int n = scanner.nextInt();

        List<Integer> lista = generaLista(n);
        System.out.println("Lista generata: " + lista);

        List<Integer> listaDuplicata = ripetiLista(lista);
        System.out.println("Lista con elementi duplicati: " + listaDuplicata);

        stampaPariDispari(listaDuplicata, true);  // posizioni pari
        stampaPariDispari(listaDuplicata, false); // posizioni dispari
    }

}

