package oop_mostenire;

import org.testng.annotations.Test;

public class MostenireTest {

    @Test
    public void testMethod() {
        Angajat angajat = new Angajat("Popescu", "Andrei", 20, "Masculin",
                "Bucuresti", "Adesso", "Tester", 10000, "2 ani");
        angajat.infoAngajat();

        System.out.println();

        System.out.println(angajat.getVarsta());

        angajat.setVarsta(21);
        System.out.println(angajat.getVarsta());
        angajat.mananca();

        angajat.marire();
        angajat.marire(10);
        angajat.marire("engineer");
        angajat.marire(10,"engineer");

        angajat.ajungeLaTimpLaBirou();
        angajat.munceste();
        angajat.nuAreAbsente();
        angajat.respectaConduita();


        Sportiv sportiv = new Sportiv("Ionescu", "Vlad", 10, "Masculin",
                "Bucuresti","Fotbal",true, 2,
                false,2 );
        sportiv.infoSportiv();
        sportiv.faceAntrenament();
        sportiv.seOdihneste();
        sportiv.joacaInEchipa();

        System.out.println();

        Student student = new Student("Gheorghe", "Maria", 23, "Feminin", "Pitesti",
                "Politehnica", "IT", 2, false, true);
        student.infoStudent();
        student.mergeLaCursuri();
        student.trebuieSaStudieze();
        student.saNuAibaRestanta();
        student.saStieSaCopieze();
    }
}
