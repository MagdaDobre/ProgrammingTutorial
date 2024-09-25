package oop_v1;

public interface AngajatInterface {
    //abstractizare = conceptul prin care putem defini comportamentul unei clase
    //se poate afce prin 2 feluri - interfete si clase abstracte
    //interfata contine doar metode abstracte (metode care nu au body)
    //toate aceste metode abstracte sunt publice
    //putem defini metode cu void sau return
    //intr-o interfata nu putem avea un constructor => nu putem face un obiect
    //interfata se implementeaza
    //clasa care implementeaza interfata trebuie sa implementeze toate metodele din ea
    //o clasa poate implementa mai multe interfete
    //o interfata poate mosteni o alta interfata

    void ajungeLaTimpLaBirou();
    void munceste();
    void nuAreAbsente();
    void respectaConduita();

    //exercitiu lant restaurante - sablon, nume, adresa, tel, email
        //                          - vegan - meniu + mancare
        //                          - non-vegan - meniu + mancare
        //                          - mixt - integreaza amandoua interfetele


    // fotbalist - posturi - comportamente diferite

}
