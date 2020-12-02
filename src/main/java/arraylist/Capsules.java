package arraylist;

//A Capsules osztály egy ArrayList típusú attribútumban tárolja a betett kapszulákat, méghozzá a színüket String-ként.
//A Capsules osztálynak legyen egy addLast(String), addFirst(String), removeFirst(), removeLast() metódusa
//Legyen egy List<String> getColors() metódusa, mely visszaadja a kapszulákat tartalmazó listát, hogy ki lehessen írni.
//Írj egy main() metódust, mely teszteli a metódusok működését.

import java.util.ArrayList;
import java.util.List;

public class Capsules {

    //List<String> artifactColors = new ArrayList<>(); is működik

    List<String> artifactColors = new ArrayList<String>();



    public void addLast(String colorToAddLast){
        artifactColors.add(colorToAddLast);
    }


    public void addFirst(String colorToAddFirst){
        artifactColors.add(0,colorToAddFirst);
    }

    public void removeFirst(){
        artifactColors.remove(0);
    }


    public void removeLast(){
        artifactColors.remove(artifactColors.size()-1);
    }

    public List getColors(){
        return artifactColors;

    }


    public static void main(String[] args) {

        Capsules colorPipe = new Capsules();
        colorPipe.addFirst("piros");
        colorPipe.addFirst("fehér");
        colorPipe.addFirst("zöld");
        System.out.println(colorPipe.artifactColors);

        colorPipe.removeLast();
        colorPipe.addFirst("fehér");
        colorPipe.addFirst("zöld");
        colorPipe.addLast("zöld");
        colorPipe.addLast("fehér");

        List colorList= colorPipe.getColors();
        System.out.println(colorList);

        //Bónusz feladat 1.
        //A Capsules osztály getColors() metódusával kérjük le a kapszulák színeit,
        // majd az eredményt tároljuk le egy változóba. A letárolt változón hívjuk meg a clear() metódust.
        // Majd ismét kérjük le a kapszulák színeit a getColors() metódussal ,
        // és nézzük meg, hogy az előző clear() hívásnak volt-e hatása erre?

        colorList.clear();
        System.out.println(colorList);
        List colorListAfter = colorPipe.getColors();
        System.out.println(colorListAfter);

        //Volt hatása, az attribútum lista törlődik



    }



}
