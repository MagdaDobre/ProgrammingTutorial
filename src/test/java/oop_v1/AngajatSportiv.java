package oop_v1;

public class AngajatSportiv extends Persoana implements AngajatInterface,SportivInterface{
    private String firma;
    private String pozitie;
    private int salariu;
    private String experienta;
    private String sport;
    private boolean sportEchipa;
    private int experientaProfesionala;
    private boolean performanta;
    private int medalii;

    public AngajatSportiv(String nume, String prenume, int varsta, String sex, String adresa, String firma,
                          String pozitie, int salariu, String experienta, String sport,
                          boolean sportEchipa, int experientaProfesionala, boolean performanta, int medalii) {
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
}
