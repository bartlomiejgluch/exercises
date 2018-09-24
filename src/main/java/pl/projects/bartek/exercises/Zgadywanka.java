package pl.projects.bartek.exercises;

public class Zgadywanka {

    Gracz p1;
    Gracz p2;
    Gracz p3;


    public void rozpocznijGre() {

        p1 = new Gracz();
        p2 = new Gracz();
        p3 = new Gracz();

        int typp1 = 0;
        int typp2 = 0;
        int typp3 = 0;

        boolean p1odgadl = false;
        boolean p1odgad2 = false;
        boolean p1odgad3 = false;

        int liczbaOdgadywana = (int) (Math.random() * 10);

        System.out.println("Mysle o liczbie z zakresu od 0 do 9... ");

        while (true) {

            System.out.println("Nalezy wytypowac liczbe: " + liczbaOdgadywana);

            p1.zgaduj();
            p2.zgaduj();
            p3.zgaduj();

            typp1 = p1.liczba;
            System.out.println(" Gracz pierwszy wytypowal liczbe: " + typp1);


            typp2 = p2.liczba;
            System.out.println(" Gracz drugi wytypowal liczbe: " + typp2);

            typp3 = p3.liczba;
            System.out.println(" Gracz trzeci wytypowal liczbe: " + typp3);


            if (typp1 == liczbaOdgadywana) {

                p1odgadl = true;
            }

            if (typp2 == liczbaOdgadywana) {

                p1odgad2 = true;

            }

            if (typp3 == liczbaOdgadywana) {

                p1odgad3 =true;

            }


            if (p1odgadl || p1odgad2 || p1odgad3) {

                System.out.println("Mamy zwyciezce!");

                System.out.println("Czy gracz pierwszy wytypowal poprawnie? " + p1odgadl);
                System.out.println("Czy gracz drugi wytypowal poprawnie? " + p1odgad2);
                System.out.println("Czy gracz trzeci wytypowal poprawnie? " + p1odgad3);
                System.out.println("Koniec gry");
                break;

            } else {

                System.out.println("Sprobuj jeszcze raz");

            }

        }


    }
}
