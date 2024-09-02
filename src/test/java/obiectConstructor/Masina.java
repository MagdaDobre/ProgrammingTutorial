package obiectConstructor;

import java.util.List;

public class Masina {
    //constructor = are ca rol sa initializeze variabilele unei clase
    //recunoastem un constructor intr-o clasa dupa numele acestuia
    //de cele mai multe ori constructorul este public
    //intr-o clasa putem avea mai multi constructori care se diferentiaza prin numarul/tipul de parametrii
    //o clasa contine intotdeauna un constructor DEFAULT (nu are parametri)
    //pot fi de 2 tipuri: cu parametrii si fara parametri

    //obiect = instanta unei clase
    //dintr-o clasa putem sa definim mai multe obiecte care sa aibe valori diferite pentru proprietati
    //in mom cand avem un obiect de tipul unei clase putem accesa variabile/metode din clasa respectiva
    //obiectele se diferentiaza prin numele acestora
    //recunoastem un obiect dupa cuvantul cheie "new"
    //structura: tipObiect numeOBiect = new tipObiect (); (Masina Dacia = new Masina(); )
    //se zice : facem un obiect de tipul x (x = numele clasei);

    public String marca;
    public String model;
    public int an;
    public String culoare;
    public List<String> dotariInterioare;
    public String motorizare;
    public int pret;
    public int pretFinal;

    //constructor cu 6 parametrii
    public Masina(String marca, String model, int an, String culoare,
                  List<String> dotariInterioare, String motorizare) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
    }

    //constructor cu 7 parametrii
    public Masina(String marca, String model, int an, String culoare, List<String> dotariInterioare, String motorizare, int pret) {
        this.marca = marca;
        this.model = model;
        this.an = an;
        this.culoare = culoare;
        this.dotariInterioare = dotariInterioare;
        this.motorizare = motorizare;
        this.pret = pret;
    }

    public void prezentareMasina() {
        System.out.println("Marca masinii este " + marca);
        System.out.println("Modelul masinii este " + model);
        System.out.println("Anul de fabricatie este " + an);
        System.out.println("Culoarea masinii este " + culoare);
        System.out.println("Dotarile interioare sunt urmatoarele: ");
        for (int index = 0; index < dotariInterioare.size(); index++) {
            System.out.println(dotariInterioare.get(index));
            System.out.println("Motorizarea masinii : " + motorizare);
            calculPret();

        }
    }

    //determinam impozitul in functie de anul de fabricatie
    //<2000 == 500 RON
    //2005<2015 = 300 RON
    //>2020 = 100 RON

    public void calculImpozit() {
        if (an <= 2000) {
            System.out.println("Impozitul pe masina este 500 RON");
        } else if (an >= 2005 && an <= 2015) {
            System.out.println("Impozitul pe masina este 300 RON");
        } else if (an >= 2000) {
            System.out.println("Impozitul pe masina este 100 RON");
        }

    }
    //determinam pretul standard si pretul final in functie de dotarile masinii

    public void calculPret() {
        if (pret != 0) {
            System.out.println("Pretul de pornire: " + pret);
        }
        if (dotariInterioare.isEmpty()) {
            System.out.println("Pretul final este " + pret);
        }
        else {
            int dotari = 0;
            for (int index = 0; index < dotariInterioare.size(); index++) {
                switch (dotariInterioare.get(index)) {
                    case "Radio":
                        dotari = dotari + 1000;
                        break;
                    case "Airbag":
                        dotari = dotari + 800;
                        break;
                    case "Aer conditionat":
                        dotari = dotari + 1500;
                        break;
                    case "Scaune incalzite":
                        dotari = dotari + 3000;
                        break;
                    case "Navigatie":
                        dotari = dotari + 400;
                        break;
                }
            }
            System.out.println("Pretul dotarilor este :" + dotari);
            pretFinal = pret + dotari;
            System.out.println("Pretul final este " + pretFinal);
        }
    }

    //tema - definire sportivi - nume, prenume, varsta, echipa -  constructor, si fara proprietatea echipa, capitan t/f,
    //pozitie, bonus, - fotbal, handbal, baschet, inot
    //cantina - meniul zilei

    public void calculReducere(int procentReducere){
        pretFinal = ((100-procentReducere)*pretFinal)/100;
        System.out.println("S-a aplicat o reducere de " + procentReducere + " % din pretul final.");
        System.out.println("Pretul final cu reducere este: " + pret);
    }


}

