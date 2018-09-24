package pl.projects.bartek.exercises.graWStatki;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PomocnikGry {


    public String pobierzDaneWejsciowe(String komunikat) {

        String wierszWej = null;

        System.out.print(komunikat + " ");


        try {

            BufferedReader sw = new BufferedReader(new InputStreamReader(System.in));

            wierszWej = sw.readLine();


        } catch (IOException e) {
            System.out.println("IOException: " + e);

        }


        return wierszWej;

    }


}
