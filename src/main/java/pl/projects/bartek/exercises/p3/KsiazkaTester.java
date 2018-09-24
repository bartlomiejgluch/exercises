package pl.projects.bartek.exercises.p3;

public class KsiazkaTester {


    public static void main(String[] args) {

        Ksiazka[] mojeKsiazki = new Ksiazka[3];
        int x = 0;

        mojeKsiazki[0] = new Ksiazka();
        mojeKsiazki[1] = new Ksiazka();
        mojeKsiazki[2] = new Ksiazka();

        mojeKsiazki[0].tytul = "Czterej";
        mojeKsiazki[1].tytul = "Java letniej";
        mojeKsiazki[2].tytul = " Java d";

        mojeKsiazki[0].autor = "janek";
        mojeKsiazki[1].autor = "zygi";
        mojeKsiazki[2].autor = "lola";

        while (x < 3){

            System.out.println(mojeKsiazki[x].tytul + ", autor " + mojeKsiazki[x].autor);
            x=x+1;


        }

    }
}