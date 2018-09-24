package pl.projects.bartek.exercises.p5;

public class ZegarTester {

    public static void main(String[] args) {

        Zegar z = new Zegar();

        z.setCzas("12:45");

        String dta = z.getCzas();
        System.out.println("Czas: " + dta);

    }
}
