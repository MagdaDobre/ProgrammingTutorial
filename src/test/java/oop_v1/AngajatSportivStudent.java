package oop_v1;

public class AngajatSportivStudent extends Persoana implements AngajatInterface,SportivInterface,StudentInterface {
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;
    private String sport;
    private boolean sportEchipa;
    private int experientaProfesionala;
    private boolean performanta;
    private int medalii;
    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean bursa;
    private boolean restante;

    public AngajatSportivStudent(String nume, String prenume, int varsta, String sex, String adresa,
                                 String firma, String pozitie, int salariu, String experienta,
                                 String sport, boolean sportEchipa, int experientaProfesionala,
                                 boolean performanta, int medalii, String facultate, String domeniu,
                                 int anStudiu, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.firma = firma;
        this.pozitie = pozitie;
        this.salariu = salariu;
        this.experienta = experienta;
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experientaProfesionala = experientaProfesionala;
        this.performanta = performanta;
        this.medalii = medalii;
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.bursa = bursa;
        this.restante = restante;
    }

    @Override
    public void ajungeLaTimpLaBirou() {

    }

    @Override
    public void munceste() {

    }

    @Override
    public void nuAreAbsente() {

    }

    @Override
    public void respectaConduita() {

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
