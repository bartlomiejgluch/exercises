package pl.projects.bartek.exercises.graWStatki;

import java.util.ArrayList;

public class PortalGra {

    public static void main(String[] args) {

        int iloscRuchow = 0;
        PomocnikGry pomocnik1 = new PomocnikGry();

        Portal portal = new Portal();
        int liczbaLosowa = (int) (Math.random() * 5);

        ArrayList<String>  polozenie = new ArrayList<String>();


        String liczbSTr = Integer.toString(liczbaLosowa);



        polozenie.add(0,Integer.toString(liczbaLosowa));
        polozenie.add(1,(Integer.toString(liczbaLosowa+1)));
        polozenie.add(2,(Integer.toString(liczbaLosowa+2)));


        portal.setPolePolozenia(polozenie);

        boolean czyIstnieje = true;

        while (czyIstnieje == true) {
            String pole1 = pomocnik1.pobierzDaneWejsciowe("Podaj liczbę");
            String wynik = portal.sprawdz(pole1);
            iloscRuchow++;
            System.out.println("Twój wynik " + wynik);
            if (wynik.equals("zatopiony")) {
                czyIstnieje = false;
                System.out.println(iloscRuchow + " ruchów");
            } // koniec if
        } // koniec while
    } // koniec main
}