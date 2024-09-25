package oop_mostenire;

public class SportivStudent  extends Persoana implements SportivInterface,StudentInterface {
    private String sport;
    private boolean sportEchipa;
    private int experienta;
    private boolean performanta;
    private int medalii;
    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean bursa;
    private boolean restante;

    public SportivStudent(String nume, String prenume, int varsta, String sex, String adresa, String sport,
                          boolean sportEchipa, int experienta, boolean performanta, int medalii,
                          String facultate, String domeniu, int anStudiu, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experienta = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.bursa = bursa;
        this.restante = restante;
    }

    @Override
    public void faceAntrenament() {

    }

    @Override
    public void seOdihneste() {

    }

    @Override
    public void joacaInEchipa() {

    }

    @Override
    public void mergeLaCursuri() {

    }

    @Override
    public void trebuieSaStudieze() {

    }

    @Override
    public void saNuAibaRestanta() {

    }

    @Override
    public void saStieSaCopieze() {

    }
}
