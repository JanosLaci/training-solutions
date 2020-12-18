package week08d05;

//Kristóf Bárczay  9:25 AM
//Mai Junior/Mid-level feladat:
//A week08d05 csomagban készíts egy osztályt MathAlgorithms néven.
// Legyen benne egy metódus, greatestCommonDivisor() ,
// ami paraméterül vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.


public class MathAlgorithms {

    public int greatestCommonDivisor(int firstInputInt, int secondInputInt){
        int foundMaxDivisor = 1;
        for (int possibleDivisor = 2; possibleDivisor <= Math.min(firstInputInt, secondInputInt); possibleDivisor++){

            if (firstInputInt % possibleDivisor == 0 && secondInputInt % possibleDivisor == 0){
                foundMaxDivisor = possibleDivisor;
            }


        }
        return foundMaxDivisor;

    }



}
