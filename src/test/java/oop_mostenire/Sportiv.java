package oop_mostenire;

public class Sportiv extends Persoana implements SportivInterface{
    private String sport;
    private boolean sportEchipa;
    private int experientaProfesionala;
    private boolean performanta;
    private int medalii;

    public Sportiv(String nume, String prenume, int varsta, String sex, String adresa, String sport,
                   boolean sportEchipa, int experienta, boolean performanta, int medalii) {
        super(nume, prenume, varsta, sex, adresa);
        this.sport = sport;
        this.sportEchipa = sportEchipa;
        this.experientaProfesionala = experienta;
        this.performanta = performanta;
        this.medalii = medalii;
    }

    public void infoSportiv(){
        infoPersoana();
        System.out.println("Sportul pe care il practica este: " + sport);
        System.out.println("Joaca in echipa? " + sportEchipa);
        System.out.println("Experienta sportivului este de " + experientaProfesionala + " ani.");
        System.out.println("Practica sport de performanta? " + performanta);
        System.out.println("Cate medalii a castigat sportivul? " + medalii);

    }

    public void mananca(){
        System.out.println("Sportivul mananca dupa antrenament.");
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public boolean isSportEchipa() {
        return sportEchipa;
    }

    public void setSportEchipa(boolean sportEchipa) {
        this.sportEchipa = sportEchipa;
    }

    public int getExperienta() {
        return experientaProfesionala;
    }

    public void setExperienta(int experienta) {
        this.experientaProfesionala = experienta;
    }

    public boolean isPerformanta() {
        return performanta;
    }

    public void setPerformanta(boolean performanta) {
        this.performanta = performanta;
    }

    public int getMedalii() {
        return medalii;
    }

    public void setMedalii(int medalii) {
        this.medalii = medalii;
    }

    @Override
    public void faceAntrenament() {
        System.out.println("Sportivul participa la antrenament.");
    }

    @Override
    public void seOdihneste() {
        System.out.println("Sportivul se odihneste suficient.");
    }

    @Override
    public void joacaInEchipa() {
        System.out.println("Sportivul nu joaca in echipa.");
    }
}
