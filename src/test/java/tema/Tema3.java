package tema;

import org.testng.annotations.Test;

import java.util.*;

public class Tema3 {

    // exemplu complet de tari orase capitale
    //map in map ?

    @Test
    public void metodaTest() {
        tariOraseCapitale();


    }

    public void tariOraseCapitale() {
        Map<String, List<String>> tari = new HashMap<>();

        List<String> oraseRomania = Arrays.asList("Cluj", "Pitesti", "Oradea", "Timisoara");
        List<String> oraseItalia = Arrays.asList("Milano", "Roma", "Turin");
        List<String> oraseSpania = Arrays.asList("Barcelona", "Madrid", "Valencia");

        tari.put("Romania", oraseRomania);
        tari.put("Italia", oraseItalia);
        tari.put("Spania", oraseSpania);


        Map<String, String> capitale = new HashMap<>();
        capitale.put("Romania","Bucuresti");
        capitale.put("Italia", "Roma");
        capitale.put("Spania", "Madrid");



        for (String Key : tari.keySet()) {
            System.out.println("Tara este " + Key);
            System.out.println("Orasele sunt: " + tari.get(Key));
            System.out.println("Capitala este: " + capitale.get(Key));

        }
    }
}
