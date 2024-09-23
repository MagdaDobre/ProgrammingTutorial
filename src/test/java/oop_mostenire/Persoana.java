package oop_mostenire;

public class Persoana {
    //oop- programare orientata pe obiect
    // 4 principii -  mostenire, abstractizare, incapsulare si polimorfism
    //mostenire= conceptul prin care o clasa copil mosteneste o clasa-parinte
    //in momentul in care copilul mosteneste parintele trebuie sa apeleze constructorul din parinte
    //acest lucru se realizeaza cu super
    //mostenirea se face la nivel de clasa cu cuvantul"extends"
    //in java o clasa poate mosteni doar o singura clasa

    //incapsulare = conceptul prin care excludem anumite proprietati/metode
    //conceptul se poate aplica la orice nivel de clase(parinte sau copil)


    private String nume;
    private String prenume;
    private int varsta;
    private String sex;
    private String adresa;

    public Persoana(String nume, String prenume, int varsta, String sex, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.sex = sex;
        this.adresa = adresa;
    }

    public void infoPersoana(){
        System.out.println("Numele persoanei este: " + nume);
        System.out.println("Prenumele persoanei este: " + prenume);
        System.out.println("Varsta persoanei este: " + varsta);
        System.out.println("Sexul persoanei este: " + sex);
        System.out.println("Adresa persoanei este: " + adresa);
    }


    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getSex() {
        return sex;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


}
