package pl.projects.bartek.exercises.dziedziczenie;

public class Pies extends Psowate implements ZwierzakDomowy {
    int wielkosc;


    public Pies(String imie) {

        super(imie);

    }


    public Pies(int wielkoscPsa) {
        super();

        System.out.println(" utworzono obiekt Pies ");

        wielkosc = wielkoscPsa;
        System.out.println("Wielkosc psa " + wielkosc);

    }

    public Pies() {


    }


    @Override
    public void badzMilutki() {

        System.out.println("Jestem milutki");

    }

    @Override
    public void bawSie() {

    }

    public void biegnij(int x) {

        for (int i = 0; i < x; i++) {

            System.out.println("Biegne " + i + " kilometrow");

        }


    }


}
