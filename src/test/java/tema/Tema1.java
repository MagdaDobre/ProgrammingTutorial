package tema;

import org.testng.annotations.Test;

public class Tema1 {
    public String mesaj;
    public int varsta;
    public String nume;
    public String prenume;
    public String msj;
    public String m;
    public String salut;
    public String text;
    public int salariu;
    public int id;
    public String departament;
    public int nrDepartament;
    public double ecuatie;


    //Afiseaza pe ecran urmatoarele:
    //PENTRU FIECARE LINIE SE DECLARA VARIABILE NOI
    //
    //1. Hello World
    //2. Varsta ta (numar)
    //3. Numele si prenumele pe 2 randuri
    //4. Adauga la "Salut" caracterul "M" la final
    //5. Adauga la "Hello" caracterul "H" la inceput
    //6. Adauga la "Ana are mere,pere,prune" dupa fiecare vocala de la finalul cuvantului caracterul "Z"
    //7. Adauga la toate rezultatele obtinute " Poti pleca acasa dupa ce iti verific munca!"
    //8. Afisam in consola salariul unui angajat daca acesta are prenumele Andrei;
    //9. Afisam in consola ID de angajat si Departamentul din care face parte un angajat daca numele acestuia este "Popescu"
    //10. Utilizand o metoda cu parametrii afisati numarul unui departament daca acesta este mai mare de 287;
    //
    //
    //! BONUS !
    //Afisati in consola rezultatul ecuatiei:[2+(3*4)-3]/3 ?
    //  Rezultatul corect este: {rezultatul}


    @Test
    public void metodaTest() {
//        afisareHelloWorld();
//        adaugareText();
//        afisareVarsta();
//        adaugareText();
//        afisareNumePrenumeSeparat();
//        adaugareText();
//        afisareSalutM();
//        adaugareText();
//        afisareHHello();
//        adaugareText();
        adaugareZ();
//        //adaugareText();
//        afisareSalariu();
//        adaugareText();
//        afisareIdDepartament();
//        adaugareText();
//        afisareNrDepartament(265);
//        adaugareText();
        //afisareRezultat();

    }

    public void afisareHelloWorld() {
        mesaj = "Hello World";

        System.out.println(mesaj);
    }

    public void afisareVarsta() {
        varsta = 35;

        System.out.println("Varsta mea este " + varsta + " ani");
    }

    public void afisareNumePrenumeSeparat() {
        nume = "Dobre";
        prenume = "Magda";

        //System.out.println("Numele meu este " + nume);
        //System.out.println("Prenumele meu este " + prenume);
        System.out.print(nume + "\n" + prenume);
    }

    public void afisareSalutM() {
        msj = "Salut";
        m = "M";
        System.out.println(msj + m);

    }

    public void afisareHHello() {
        salut = "Hello";
        System.out.println("H" + salut);
    }

    public void adaugareText() {
        text = " Poti pleca acasa dupa ce iti verific munca!";

        System.out.println(text);

    }

    public void afisareSalariu() {
        salariu = 2000;
        prenume = "Andrei";
        if (prenume == "Andrei")
            System.out.println("Salariul este in valoare de " + salariu);
        else {
            System.out.println("Prenumele angajatului nu este Andrei.");
        }
    }

    public void afisareIdDepartament() {
        id = 6789;
        departament = "IT";
        nume = "Popescu";

        if (nume == "Popescu")
            System.out.println("ID-ul angajatului este " + id + ", iar departamentul din care face parte este " + departament);
        else {
            System.out.println("Numele angajatului " + nume + " este diferit de Popescu.");
        }


    }

    public void afisareNrDepartament(int nrDepartament) {
        if (nrDepartament > 287)
            System.out.println("Numarul departamentului este mai mare.");
        else {
            System.out.println("Numarului " + nrDepartament + " este mai mic.");
        }

    }

    public void adaugareZ() {

        StringBuilder rezultat = new StringBuilder();
        String text = "Ana are mere, pere, prune";
        String[] cuvinte = text.split(" ");
        for (String cuvant:cuvinte){
            if (cuvant.matches(".*[aeiou]")){
                rezultat.append(cuvant).append("z");
                System.out.println(rezultat);
            }
        }

        //public void afisareRezultat(double[]list){

        //System.out.println( ("[2+(3*4)-3]/3"));

    }
}


