package pl.projects.bartek.exercises.dziedziczenie;

public class Kot extends Kotowate implements ZwierzakDomowy {
    @Override
    public void badzMilutki() {

        System.out.println("Jestem milutki");

    }

    @Override
    public void bawSie() {

        System.out.println("Bawie sie ...");

    }

    @Override
    public void halasuj() {
        super.halasuj();
        System.out.println("Halasuje kot");

    }
}
