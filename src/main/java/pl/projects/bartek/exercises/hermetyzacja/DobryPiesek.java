package pl.projects.bartek.exercises.hermetyzacja;

public class DobryPiesek {

    private int wielkosc;

    public int getWielkosc(){

        return wielkosc;
    }

    public void setWielkosc(int w){

        wielkosc = w;
    }


    void szczekaj(){

        if (wielkosc>23) {


            System.out.println("Houuu houuu");
        } else if (wielkosc>6) {

            System.out.println("Chau Chau");

        } else {
            System.out.println("Hial Hial");
        }




    }


}
