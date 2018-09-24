package pl.projects.bartek.exercises;

import java.util.Scanner;

public class Gracz {


    int liczba;

    public void zgaduj() {



        Scanner scanner = new Scanner(System.in);

        System.out.println("Zgaduj liczbe: ");
        liczba = scanner.nextInt();
        System.out.println(liczba);



    }

}
