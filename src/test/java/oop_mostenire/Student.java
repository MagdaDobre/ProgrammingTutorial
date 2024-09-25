package oop_mostenire;

public class Student extends Persoana{
    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa,
                   String facultate, String domeniu, int anStudiu, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
        this.facultate = facultate;
        this.domeniu = domeniu;
        this.anStudiu = anStudiu;
        this.bursa = bursa;
        this.restante = restante;
    }

    public void infoStudent(){
        infoPersoana();
        System.out.println("Facultatea la care studiaza este: " + facultate);
        System.out.println("Domeniul pe care il studiaza este: " + domeniu);
        System.out.println("Anul de studiu este: "+ anStudiu);
        System.out.println("Este bursier? " + bursa);
        System.out.println("Are restante? " + restante);

    }


    public void mananca() {
        System.out.println("Studentul mananca in pauza sau dupa cursuri.");
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public String getDomeniu() {
        return domeniu;
    }

    public void setDomeniu(String domeniu) {
        this.domeniu = domeniu;
    }

    public int getAnStudiu() {
        return anStudiu;
    }

    public void setAnStudiu(int anStudiu) {
        this.anStudiu = anStudiu;
    }

    public boolean isBursa() {
        return bursa;
    }

    public void setBursa(boolean bursa) {
        this.bursa = bursa;
    }

    public boolean isRestante() {
        return restante;
    }

    public void setRestante(boolean restante) {
        this.restante = restante;
    }
}
