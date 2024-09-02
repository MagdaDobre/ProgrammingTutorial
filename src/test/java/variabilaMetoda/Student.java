package variabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //acesta este un comentariu

    //clasa = sablon care defineste comportamentul unei entitati din viata reala
    //intr-un fisier Java recunoastem o clasa dupa cuvantul cheie 'class'
    //este obligatoriu ca o clasa sa aiba un nume
    //intr-un fisier Java putem avea mai multe clase diferentiate prin numele acestora (nu se face asa ceva niciodata)
    //o clasa contine variabile si metode

    //variabila = proprietatea unei clase
    //variabila este de 2 feluri : globala si locala
    //variabila globala = acea variabila pe care o definesti la inceputul clasei si are vizibilitate asupra intregului fisier
    //variabila locala = variabila pe care o definesti intr-o metoda si are vizibilitate doar in metoda respectiva
    //variabila globala trebuie sa contina un access control (public), tip de data si un nume
    //o variabila nu trebuie sa contina tot timpul o valoare

    public String nume;
    public String prenume;
    public int varsta;
    public double inaltime;
    public float greutate;
    public String adresa;
    public char sex;
    public boolean areRestante;

    //metoda = actiunea unei clase
    //o clasa poate avea mai multe metode care se diferentiaza prin numele lor
    //metodele pot fi de 2 feluri: void si return
    //o metoda cu void are ca rol sa execute actiunea si sa o afiseze
    //o metoda cu void trebuie sa contina: access control(public) void numeMetoda () {}

    @Test
    public void prezentareStudent() {
        nume = "Dobre";
        prenume = "Magda";
        varsta = 28;
        inaltime = 1.78;
        greutate = 60.2f;
        adresa = "Bucuresti, nr.14";
        sex = 'f';
        areRestante = true;

        //concatenare = lipirea a unul sau mai multe stringuri, se face cu +
        //print = afiseaza valoarea si ramane pe randul curent
        //println = afiseaza valoarea si sare la randul urmator

        //System.out.print(nume + " ");
        //System.out.print(prenume);
       // System.out.print(" " +varsta + " " + "ani");

        //System.out.print(nume + " " + prenume + " " + adresa);

        System.out.println("Numele studentului este " + nume);
        System.out.println("Prenumele studentului este " + prenume);
        System.out.println("Varsta studentului este " + varsta);
        System.out.println("Inaltimea studentului este " + inaltime);
        System.out.println("Greutate studentului este " + greutate);
        System.out.println("Adresa studentului este " + adresa);
        System.out.println("Sexul studentului este " + sex);
        System.out.println("Are restante studentul:" + areRestante);

    }

    }

