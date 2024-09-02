package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String rasa;
    public Boolean esteMamifer;
    public String culoare;
    public int varsta;
    public double greutate;


    @Test
    public void metodaTest (){


        //prezentareAnimal("caine", true, "maro", 2, 20.1);
        //prezentareAnimal("pisica", true, "alb", 3, 4.5);
        prezentareAnimal("tigru", true, "orange",4, 23.4);

    }

    public void prezentareAnimal(String param1, Boolean param2, String param3, int param4, double param5){
        int pret = 50;
        System.out.println("Pretul animalului este " + pret +" lei.");
        System.out.println("Rasa animalului este " + param1);
        System.out.println("Animalul este mamifer sau nu? " + param2);
        System.out.println("Culoarea animalului este " + param3);
        System.out.println("Varsta animalului este " + param4 + " ani");
        System.out.println("Greutatea animalului este " + param5 + " kg");
        System.out.println();

    }
}
