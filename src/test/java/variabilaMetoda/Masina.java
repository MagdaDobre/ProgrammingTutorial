package variabilaMetoda;

import org.testng.annotations.Test;

public class Masina {
    public String marca;
    public Boolean areITP;
    public String culoare;
    public int anFabricatie;
    public double pret;


    @Test
    public void metodaTest() {


        prezentareMasina("Megane", true, "gri", 2020, 10.564);
        prezentareMasina("Toyota", false, "alb", 2024, 21.458);
        prezentareMasina("Mazda", true, "orange", 2022, 33.234);

    }

    public void prezentareMasina(String param1, Boolean param2, String param3, int param4, double param5) {
        int nrScaune = 5;

        System.out.println("Marca masinii este " + param1);
        System.out.println("Masina are ITP sau nu? " + param2);
        System.out.println("Culoarea masinii este " + param3);
        System.out.println("Anul fabricatiei este " + param4);
        System.out.println("Pretul masinii este " + param5 + " euro.");
        System.out.println("Numarul scaunelor masinii este " + nrScaune);
        System.out.println();

    }
}
