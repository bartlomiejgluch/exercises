package pl.projects.bartek.exercises.graWStatki;

import java.util.ArrayList;

public class Portal {

    private ArrayList<String> polaPolozenia;


    public void setPolePolozenia(ArrayList<String> ppol) {

        polaPolozenia = ppol;
    }


    public String sprawdz(String ruch) {

        String wynik = "pudlo";


        int indeks = polaPolozenia.indexOf(ruch);


        if (indeks >= 0) {

            polaPolozenia.remove(indeks);

            if (polaPolozenia.isEmpty()) {

                wynik = "zatopiony";
            } else {
                wynik = "trafiony";
            }

        }


        return wynik;
    }


}
