package pl.projects.bartek.exercises.p2;

public class ProgramPies {


    public static void main(String[] args) {

        Pies pies1 = new Pies();
        pies1.szczekaj();
        pies1.imie = "Azorek";


        Pies[] mojePsy = new Pies[3];

        mojePsy[0] = new Pies();
        mojePsy[1] = new Pies();
        mojePsy[2] = pies1;

        mojePsy[0].imie = "Szarik";
        mojePsy[1].imie = "Cywil";


        System.out.println("Ostatni pies ma na imie ");
        System.out.println(mojePsy[2].imie);

        int x = 0;
        while (x < mojePsy.length) {

            mojePsy[x].szczekaj();
            x = x+1;
        }



    }


}
