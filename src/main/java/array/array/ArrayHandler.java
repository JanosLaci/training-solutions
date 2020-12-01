package array.array;

//Hozz létre egy array.ArrayHandler osztályt, és implementálj benne egy boolean contains(int[] source, int itemToFind) metódust,
// mely visszaadja, hogy a paraméterként megadott érték benne van-e a szintén paraméterként átadott tömbben!
//A fenti array.ArrayHandler osztályba implementálj egy újabb int find(int[] source, int itemToFind) metódust,
// mely visszaadja a paraméterként megadott érték indexét, ha benne van a tömbben, és -1-et, ha nincs benne!

public class ArrayHandler {

    public boolean contains(int[] source, int itemToFind){
        for (int i=0; i < source.length; i++) {
            if (source[i] == itemToFind) {return true;}
            else if (i == source.length-1 ) {return false;}


        }
        return false;
    }

    public int find(int[] source, int itemToFind){
        for (int i=0; i < source.length; i++) {
            if (source[i] == itemToFind) {
                return i;
            }
            else if (i == source.length - 1) {
                return -1;
            }
        }
        return -2;
    }

}
