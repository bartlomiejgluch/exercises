package pl.projects.bartek.exercises.klimatyzatory;

import java.util.ArrayList;

public class KlimatyzatorV3 extends KlimatyzatorV2 {

    KlimatyzatorV3(ArrayList lgLista){


        super(lgLista);
        for (int g=0 ; g<10 ; g++){

            lgLista.add(new JednSym("KlimatyzatorV3"));
        }
    }


}
