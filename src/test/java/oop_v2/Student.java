package oop_v2;

public class Student extends Persoana {
    private String facultate;
    private String domeniu;
    private int anStudiu;
    private boolean bursa;
    private boolean restante;

    public Student(String nume, String prenume, int varsta, String sex, String adresa, String facultate,
                   String domeniu, int anStudiu, boolean bursa, boolean restante) {
        super(nume, prenume, varsta, sex, adresa);
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
