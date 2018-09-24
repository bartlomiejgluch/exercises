package pl.projects.bartek.exercises.p3;

public class TestTablic {

    public static void main(String[] args) {

        int[] indeksy = new int[4];

        indeksy[0] = 1;
        indeksy[1] = 3;
        indeksy[2] = 0;
        indeksy[3] = 2;

        String[] wyspy = new String[4];

        wyspy[0] = "Bermudy";
        wyspy[1] = "Figi";
        wyspy[2] = "Azory";
        wyspy[3] = "Kozumel";

        int y = 0;
        int ref;

        while (y < 4) {
            ref = indeksy[y];
            System.out.println("Wyspa = " + wyspy[ref]);

            y = y+1;

        }

    }
}