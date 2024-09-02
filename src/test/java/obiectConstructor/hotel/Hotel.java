package obiectConstructor.hotel;

import org.openqa.selenium.json.JsonOutput;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hotel {
    public String nume;
    public String adresa;
    public String tara;
    public String oras;
    public String stele;
    public int numarCamere;
    public boolean micDejun;
    public int numarEtaje;
    public List<String> facilitati;
    public int pretPornire;


    public Hotel() {
        nume = "Imperial House";
        adresa = "Str. Mamaia";
        tara = "Romania";
        oras = "Constanta";
        stele = "***";
        numarCamere = 60;
        micDejun = true;
        numarEtaje = 6;
        facilitati = Arrays.asList("Wi-fi", "Hartie igienica", "TV", "Frigider", "Loc parcare");
        pretPornire = 1000;
    }

    public void prezentareHotel(){
        System.out.println("Numele hotelului este: " + nume);
        System.out.println("Adresa hotelului este: " + adresa);
        System.out.println("Tara hotelului este: " + tara);
        System.out.println("Orasul hotelului este: " + oras);
        System.out.println("Numar stele: " + stele);
        System.out.println("Numar camere: " + numarCamere);
        System.out.println("Mic dejun inclus: " + micDejun);
    }

    public void pretOferta(Map<String,String> oferta) {
        System.out.println("Pretul initial este " + pretPornire);
        for (String optiune : oferta.keySet()) {
            if (optiune.equals("Durata oferta")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 5) {
                    pretPornire = pretPornire + 200;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 800;
                } else {
                    pretPornire = pretPornire + 850;
                }
            }

            if (optiune.equals("Perioada sedere")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 5) {
                    pretPornire = pretPornire + 100;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 2000;
                } else {
                    pretPornire = pretPornire + 1750;
                }
            }

            if (optiune.equals("Numar persoane")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (number < 3) {
                    pretPornire = pretPornire + 100;
                }
                if (number > 5 && number < 10) {
                    pretPornire = pretPornire + 2000;
                } else {
                    pretPornire = pretPornire + 1750;
                }
            }

            if (optiune.equals("Offseason")) {
                //clientul are dorinta de a avea oferta valabilitate mai mare
                //se calculeaza pretul pe baza mai multor intervale
                String[] parts = oferta.get(optiune).split(" ");
                int number = Integer.parseInt(parts[0]);
                if (oferta.get(optiune).equals("Da")){
                    pretPornire = pretPornire - 1000;
                }
                else {
                    pretPornire = pretPornire + 500;
                }
            }
            System.out.println("Pretul final este " + pretPornire);
        }


    }


}
