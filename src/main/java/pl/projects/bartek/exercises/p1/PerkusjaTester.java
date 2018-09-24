package pl.projects.bartek.exercises.p1;

public class PerkusjaTester {


    public static void main(String[] args) {

        Perkusja perkusja = new Perkusja();

        perkusja.zagrajNaBebnie();

        perkusja.beben = false;

        if (perkusja.beben == true) {

            perkusja.zagrajNaBebnie();

        }
        perkusja.zagrajNaTlerzach();


    }
}
