package pl.projects.bartek.exercises.p4;

public class PiesTester {

    public static void main(String[] args) {

        Pies pierwszy = new Pies();
        pierwszy.wielkosc = 40;

        Pies drugi = new Pies();
        drugi.wielkosc = 2;

        Pies trzeci = new Pies();
        trzeci.wielkosc = 8;

        pierwszy.szczekaj(1);
        drugi.szczekaj(1);
        trzeci.szczekaj(1);

        pierwszy.szczekaj(3);




    }
}
