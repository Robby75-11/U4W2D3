import java.util.HashMap;
import java.util.Map;

public class RubricaTelefonica {

    private HashMap<String, String> RubricaTelefonica;

    public  RubricaTelefonica() {

        RubricaTelefonica = new HashMap<>();
    }

    // 1. Inserimento di una coppia <Nome, Telefono>
    public  void aggiungiContatto(String nome, String telefono) {
    RubricaTelefonica.put(nome, telefono);
        System.out.println("Contatto aggiunto: " + nome + " -> " + telefono);

    }
    // 2. Cancellazione di una coppia <Nome, Telefono> a partire dal nome

    public  void RimuoviContatto(String nome) {
        if (RubricaTelefonica.containsKey(nome)) {
          RubricaTelefonica.remove(nome);
            System.out.println("Contatto rimosso: " + nome);

        }

    }

    // 3. Ricerca della persona conoscendo il numero di telefono
    public String cercaNomeDaNumero(String telefono) {
        for (Map.Entry<String, String> entry : RubricaTelefonica.entrySet()) {
            if (entry.getValue().equals(telefono)) {
                return entry.getKey();
            }
        }
        return null;
    }

    // 4. Ricerca del numero conoscendo il nome
    public String cercaNumeroDaNome(String nome) {
        return RubricaTelefonica.getOrDefault(nome, null);
    }

    // 5. Stampa di tutti i contatti
    public void stampaRubrica() {
        System.out.println("Rubrica telefonica:");
        for (Map.Entry<String, String> entry : RubricaTelefonica.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public static void main (String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();

        rubrica.aggiungiContatto("Mario", "3331234567");
        rubrica.aggiungiContatto("Luca", "3207654321");
        rubrica.aggiungiContatto("Anna", "3401122334");

        rubrica.stampaRubrica();

        System.out.println("\nNumero di Luca: " + rubrica.cercaNumeroDaNome("Luca"));
        System.out.println("Nome associato a 3401122334: " + rubrica.cercaNomeDaNumero("3401122334"));

        rubrica.RimuoviContatto("Luca");

        rubrica.stampaRubrica();
    }
}




