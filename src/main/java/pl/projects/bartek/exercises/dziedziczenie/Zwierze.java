package pl.projects.bartek.exercises.dziedziczenie;

abstract public class Zwierze {


    private String imie;


    public Zwierze(String imieZwk){

        imie = imieZwk;

    }

    public Zwierze() {

    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void halasuj() {

        System.out.println("Hałasuję, bardzo");

    }

    public  void jedz(){

        System.out.println("Jem, amciu amciu :)");
    }


}
