package tema;

import org.testng.annotations.Test;

import java.lang.module.FindException;

public class Tema2 {
    int index;
    int a;
    int b;
    double c;
    double d;


//    Rezolvam urmatoarele cerinte:
//1. Afisam in consola de 5 ori cuvantul "DA" pe acelasi rand cu un spatiu intre;
//2. Afisam in consola primele 3 numere de la 1 la 3;
//3. Afisam in consola numarul cel mai mare dintre 15 si 20; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//4. Afisam in consola numarul cel mai mic dintre 4.5 si 3.25; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//5. Afisam in consola numerele pare si numerele impare pana la 10 (utilizam "for");
//6. Afisam in consola doar numerele pare pana la 10 (utilizam "for");
//7. Afisam in consola numerele divizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//8. Afisam in consola primele 3 numere dibizibile cu 5; Se vor declara variabile a.i sa nu harcodam valoarea in metoda;
//9. Afisam in consola suma a doua numere 235 si 10; Se vor declara variabile LOCALE;
//10. Afisam in consola suma numerelor pana la 10 (int suma=0); Se vor declara variabile LOCALE;
//11. Afisam in consola produsul numerelor pana la 5; Se vor declara variabile LOCALE;


    @Test
    public void metodaTest() {
        afisareDa(5);
        afisareNr1la3(3);
        afisareNrMaiMare();
        afisareNrMaiMic();
        afisareNrPareImpare(10);
        afisareNrPare(10);
        verificNrDivizibil(23);
        verific3NrDivizibil(100);
        afisareSuma();
        afisareSuma10();
        afisareProdusNr();


    }

    public void afisareDa(int capat) {
        int index = 0;
        while (index < capat) {
            System.out.print(("DA" + " "));
            index++;

        }

    }

    public void afisareNr1la3(int capat) {
        for (int index = 1; index <= capat; index++) {
            System.out.println("Vreau sa afisez numarul " + index);
        }
    }

    public void afisareNrMaiMare() {
        a = 15;
        b = 20;
        if (a > b) {
            System.out.println(a + " este mai mare ca " + b);
        } else {
            System.out.println(b + " este mai mare ca " + a);
        }
    }

    public void afisareNrMaiMic() {
        c = 4.5;
        d = 3.25;
        if (c > d) {
            System.out.println(c + " este mai mic ca " + d);
        } else {
            System.out.println(c + " este mai mare ca " + d);
        }
    }

    public void afisareNrPareImpare(int capat) {
        for (int index = 0; index <= capat; index++) {
            if (index % 2 == 0) {
                System.out.println("Aceste numere sunt pare:" + index);
            } else if (index % 2 !=0) {
                System.out.println("Aceste numere sunt impare:" + index);
            }
        }
    }

    public void afisareNrPare(int capat) {
        for (int index = 0; index <= capat; index++) {
            if (index % 2 == 0) {
                System.out.println("Aceste numere sunt pare: " + index);
            }
        }
    }

    public void verificNrDivizibil(int numar) {
        if (numar % 5 == 0) {
            System.out.println("Numarul este divizibil.");

        } else {
            System.out.println("Numarul nu este divizibil.");
        }

    }

    public void verific3NrDivizibil(int numar) {
        int count = 3;
        for (int index = 1; index <= numar; index++) {
            if (index % 5 == 0) {
                System.out.println(index);
                count++;
            }
            if (count == 6) {
                break;
                // System.out.println("Acestea sunt primele 3 numere divizibile cu 5: " + index);}
            }

        }
    }

    public void afisareSuma() {
        int x = 235;
        int y = 10;
        System.out.println("Suma numerelor date este " + (x + y));

    }


    public void afisareSuma10() {
        int suma = 0;
        for (int number = 1; number <= 10; number++) {

            suma = suma + number;
        }
        System.out.println("Suma finala este : " + suma);
    }


    public void afisareProdusNr() {
        int produs = 1;
        for (int number = 1; number <= 5; number++) {
            produs = produs * number;
        }
        System.out.println("Produsul final este : " + produs);
    }
}









