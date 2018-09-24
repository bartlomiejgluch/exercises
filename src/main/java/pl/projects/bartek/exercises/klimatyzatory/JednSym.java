package pl.projects.bartek.exercises.klimatyzatory;

public class JednSym {
    String typUrz;

    JednSym(String typ) {


        typUrz = typ;
    }



  public   int zuzycieEnergii(){


        if ("Grzejnik".equals(typUrz)){

            return 2;
        } else {

            return 4;
        }



    }


}
