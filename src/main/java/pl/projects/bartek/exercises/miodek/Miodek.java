package pl.projects.bartek.exercises.miodek;

public class Miodek {

    public static void main(String[] args) {

        Miodek spodeczek = new Miodek();

        Miodek[] miod = {spodeczek, spodeczek, spodeczek, spodeczek};

        Pszczoly p1 = new Pszczoly();

        p1.miodki = miod;

        Mis[] ms = new Mis[5];

        for (int x = 0; x < 5; x++) {


            ms[x] = new Mis();
            ms[x].miodzio = spodeczek;

            System.out.println(ms[x].miodzio);
        }

        Kubelek k = new Kubelek();
        k.md = spodeczek;
        Szop s = new Szop();

        s.md = spodeczek;
        s.k = k;
        k = null;

    }


}
