package pl.projects.bartek.exercises.hermetyzacja;



public class DobryPiesekTester {

    public static void main(String[] args) {


        DobryPiesek pierwszy = new DobryPiesek();
        pierwszy.setWielkosc(70);

        DobryPiesek drugi = new DobryPiesek();
        drugi.setWielkosc(8);

        System.out.println("Pierwszy piesek " + pierwszy.getWielkosc());

        System.out.println("Drugi piesek " + drugi.getWielkosc());

        pierwszy.szczekaj();
        drugi.szczekaj();


        System.out.println(" ");

        DobryPiesek[] zwierzaki = new DobryPiesek[7];

        zwierzaki[0] = new DobryPiesek();
        zwierzaki[1] = new DobryPiesek();

        zwierzaki[0].setWielkosc(30);
        int x = zwierzaki[0].getWielkosc();
        zwierzaki[1].setWielkosc(8);

        System.out.println(zwierzaki[0].getWielkosc());
        System.out.println(zwierzaki[1].getWielkosc());

    }


}
