package week15d02;

import java.lang.Math;
import java.util.Random;

public class VeletlenszamGeneratorKerdesekhez {


    int getRandomIntForQuestions() {

        int veletlenszam = 0;
        int veletlenszam2 = 0;
        //57 kérdés van
        int max = 57;
        int min = 1;
        int range = max - min + 1;

        veletlenszam = (int) (Math.random() * range) + min;
        Random rnd = new Random();
        veletlenszam2 = rnd.nextInt(57) + 1;

        return veletlenszam;

    }



}
