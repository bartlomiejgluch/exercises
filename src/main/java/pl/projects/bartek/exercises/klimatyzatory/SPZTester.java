package pl.projects.bartek.exercises.klimatyzatory;

import java.util.ArrayList;

public class SPZTester {

    public static void main(String[] args){


        ArrayList lista = new ArrayList();
        KlimatyzatorV2 v2 = new KlimatyzatorV2(lista);

        KlimatyzatorV3 v3 = new KlimatyzatorV3(lista);

        for(int z=0; z<20; z++){
            Grzejnik grz = new Grzejnik(lista);


        }

        JednSym jednSym = new JednSym("Grzejnik");

        System.out.println(jednSym.zuzycieEnergii());


    }


}
