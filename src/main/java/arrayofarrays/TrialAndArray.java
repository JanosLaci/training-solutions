package arrayofarrays;

public class TrialAndArray {

    public static void main(String[] args) {

        int[][] haromszor123 = {{1}, {2,3}, {4,5,6,7}};

        int elsoSorHossza = haromszor123[0].length;
        int masodikSorHossza = haromszor123[1].length;
        int harmadikSorHossza = haromszor123[2].length;
        int egeszHossz = haromszor123.length;
        System.out.println(elsoSorHossza + " " + masodikSorHossza + " " + harmadikSorHossza + " " + egeszHossz);



    }
}
