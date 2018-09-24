package pl.projects.bartek.exercises.collections;

import java.util.ArrayList;

public class ArrayListExample {


    public static void main(String[] args) {


        ArrayList<String> mojaTbl = new ArrayList<String>();

        String j = new String();

        mojaTbl.add(j);


        String k = new String();

    mojaTbl.add(k);

    int ilosc = mojaTbl.size();

    boolean czyJest = mojaTbl.contains(j);

    int indeks = mojaTbl.indexOf(k);


    boolean czyPusta = mojaTbl.isEmpty();

    mojaTbl.remove(j);


        System.out.println(ilosc);
        System.out.println(czyJest);
        System.out.println(indeks);
        System.out.println(czyPusta );


    }


}
