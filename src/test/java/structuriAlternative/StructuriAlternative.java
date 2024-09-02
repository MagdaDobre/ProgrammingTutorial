package structuriAlternative;

import org.testng.annotations.Test;

public class StructuriAlternative {

    //in programare exista 2 tipuri de structuri:alternative si repetitive
    //structuri alternative: if ...then...else... / switch ...case

    @Test
    public void metodaTest(){
        //verificaPersoanaMajora(20);
        //verificaPersoanaMajora(12);
        //verificaPersoanaMajora(18);

        //verificNrPar(82);
        //verificNrPar(23);
        //verificNrPar(0);
        //verificNrPar(-2);
        //verificNrPar(-25);

//        verificNrDivizibil(5);
//        verificNrDivizibil(6);

        afisareZileSaptamana(5);

    }

    //facem o metoda care verifica daca o persoana e majora

    public void verificaPersoanaMajora(int varsta){
        if (varsta >=18)
        {
            System.out.println("Persoana cu varsta de " + varsta + " ani, este majora.");
        }
        else {
            System.out.println("Persoana cu varsta de " + varsta + " ani, este minora.");
        }


    }

    //verificam daca un numar este par si pozitiv
    //daca vrem catul unei impartiri => / (div)
    //daca vrem restul unei impartiri => % (mod)
    public void verificNrPar(int nr){
        if (nr > 0)
        {
            if (nr % 2 ==0) {
                System.out.println("Numarul " + nr + " este pozitiv si par.");
            }
            else {
                System.out.println("Numarul " + nr + " este pozitiv si impar.");
            }
        }
        else if (nr <0){
            if (nr % 2 ==0) {
                System.out.println("Numarul " + nr + " este negativ si par.");
            }
            else {
                System.out.println("Numarul " + nr + " este negativ si impar.");
            }
        }
        else {
            System.out.println("Numarul "+ nr + " este egal cu 0.");
        }

    }

    //verificam daca un numar este pozitiv si divizibil cu 5

    public void verificNrDivizibil(int numar){
        if (numar % 5 == 0 && numar > 0){
            System.out.println("Numarul este divizibil si pozitiv.");

        }
        else {
            System.out.println("Numarul nu este divizibil sau pozitiv.");
        }

    }

    //afisam zilele saptamanii

    public void afisareZileSaptamana (int zi){
       switch (zi){
           case 1:
               System.out.println("Astazi este luni.");
               break;
           case 2:
               System.out.println("Astazi este marti.");
               break;
           case 3:
               System.out.println("Astazi este miercuri.");
               break;
           case 4:
                   System.out.println("Astazi este joi.");
                   break;
           case 5:
               System.out.println("Astazi este vineri.");
               break;
           case 6:
               System.out.println("Astazi este sambata.");
               break;
           case 7:
               System.out.println("Astazi este duminica.");
               break;
           default:
               System.out.println("Nu mai exista zile.");


       }
    }

}
