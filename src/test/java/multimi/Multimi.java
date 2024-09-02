package multimi;

import com.beust.jcommander.StringKey;
import org.testng.annotations.Test;

import java.util.*;

public class Multimi {
    //se refera la o colectie de elemente, puse intr-un singur loc, iar in mom in care accesam locul trigaruim anumite elemente
    // se pot trata in dif feluri in functie de limbajul de programare
    //multimi:array, list, set, map

    @Test
    public void metodaTest() {
        //cursantiArray();
        //cursantiList();
        //afisareMasini();
        //mapExemple();
        //tariOrase();
        caietReteta();

    }

    //afisam cursantii de la cursul de automation
    //array paranteze drepte definitorii
    // [3] - index 3
    //functioneaza intr-o situatie in care stii cam cate elemente ai, altfel multa grija
    public void cursantiArray() {
        String[] cursanti = new String[10];
        cursanti[0] = "Rares";
        cursanti[1] = "Cristina";
        cursanti[2] = "Magda";
        cursanti[3] = "Razvan";
        cursanti[4] = "Radu";
        cursanti[5] = "Andrei";

        for (int index = 0; index < cursanti.length; index++) {
            System.out.println("Numele cursantului este " + cursanti[index]);

        }
    }

    //v2 - list
    //nu ii trebuie dimensiune fata de array, are deja
    // <> - definitorii
    public void cursantiList() {
        List<String> cursanti = new ArrayList<>();
        cursanti.add("Rares");
        cursanti.add("Cristina");
        cursanti.add("Magda");
        cursanti.add("Razvan");
        cursanti.add("Radu");
        cursanti.add("Andrei");

        for (int index = 0; index < cursanti.size(); index++) {
            System.out.println("Numele cursantului este " + cursanti.get(index));

        }

    }

    //definim o multime de masini din care afisam doar masinile de pe pozitii impare - de tinut cont de cum vede userul
    public void afisareMasini() {
        List<String> masini = new ArrayList<>();
        masini.add("Dacia");
        masini.add("Opel");
        masini.add("Renault");
        masini.add("VW");
        masini.add("Tatra");
        for (int index = 0; index < masini.size(); index++) {
            if (index % 2 != 1) {
                System.out.println("Numele masinii este " + masini.get(index));
            }
        }
    }

    //set - colectie in mom in care vrei sa parcurgi un map....
    //map: key = value
    //parcurgerea se face pe baza key-lor(folosind un set)
    //scoatem valoarea cu get
    //key este unica

    public void mapExemple() {
        Map<String, String> elemente = new HashMap<>();
        elemente.put("masina", "Peugeout");
        elemente.put("cursant", "Rares");
        elemente.put("telefon", "Samsung");
        for (String Key : elemente.keySet()) {
            System.out.println("Cheia este " + Key);
            System.out.println("Valoarea este " + elemente.get(Key));
        }
    }


    //afisam tara cu anumite orase
    public void tariOrase() {
        Map<String, List<String>> obiecte = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Pitesti", "Oradea", "Timisoara");
        List<String> oraseItalia = Arrays.asList("Milano", "Roma", "Turin");
        List<String> oraseSpania = Arrays.asList("Barcelona", "Madrid", "Valencia");

        obiecte.put("Romania", oraseRomania);
        obiecte.put("Italia", oraseItalia);
        obiecte.put("Spania", oraseSpania);

        for (String Key : obiecte.keySet()) {
            System.out.println("Tara este " + Key);
            System.out.println("Orasele sunt: " + obiecte.get(Key));

        }
    }

    //exemplu complet de tari orase capitale - tema
    //map in map ?


    //afisare ingrediente conform retetei

    public void caietReteta() {
        Map<String, List<String>> ingrediente = new HashMap<>();

        List<String> ingredienteSupaPui = Arrays.asList("Carne Pui", "Apa", "Taitei", "Legume");
        List<String> ingredienteSarmale = Arrays.asList("Varza", "Carne", "Orez");
        List<String> ingredienteDesert = Arrays.asList("Faina", "Apa", "Zahar", "Dulceata");

        ingrediente.put("Supa Pui", ingredienteSupaPui);
        ingrediente.put("Sarmale", ingredienteSarmale);
        ingrediente.put("Desert", ingredienteDesert);

        for (String Key : ingrediente.keySet()) {
            System.out.println("Reteta este " + Key);
            System.out.println("Ingredientele sunt: " + ingrediente.get(Key));
        }
    }
}
