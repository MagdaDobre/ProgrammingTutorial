package oop_v2;

public class Sportiv extends Persoana{
    private String sport;
    private boolean sportEchipa;
    private int experientaProfesionala;
    private boolean performanta;
    private int medalii;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, String sport,
                   boolean sportEchipa, int experientaProfesionala, boolean performanta, int medalii) {
        super(nume, prenume, varsta, sex, adresa);
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
