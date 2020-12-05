package attributes.person;

//Person és Address osztály
//Hozz létre egy attributes.person.Person osztályt, String name, String identificationCard attribútumokkal!
// Az osztályban hozz létre egy String personToString() metódust, mely szövegként adja vissza a Person adatait!
//Hozz létre egy Address osztályt, String country, String city, String streetAndNumber, String zipCode attribútumokkal!
// Az osztályban hozz létre egy String addressToString() metódust, mely szövegként adja vissza az Address adatait!
//Az attribútumok konstruktorban is megadhatóak legyenek, és legyenek getter metódusok.
// Legyen egy correctData() metódus mindkét osztályban, mellyel át lehet írni az összes paraméter értékét!
//A Person osztály tartalmazzon egy hivatkozást az Address osztályra!
// (Azaz legyen a Person osztálynak egy Address típusú attribútuma! Legyen egy moveTo(Address) metódus,
// mely beállítja a címet, és egy getAddress(), mellyel lekérdezhetővé válik!
//Teszteld az osztályokat a PersonMain main() metódusában!

public class Person {

    private String name, identificationCard;
    private Address personAddress;

    public Person(String name, String identificationCard, Address personAddress) {
        this.name = name;
        this.identificationCard = identificationCard;
        this.personAddress = personAddress;
    }

    public void moveTo(Address toAddress){
        personAddress = toAddress;

    }

    public Address getPersonAddress() {
        return personAddress;
    }

    public String personToString() {
        String personData;
        personData = name + " " + identificationCard;
        return personData;

    }

    public void correctData(String name, String identificationCard) {
        this.name = name;
        this.identificationCard = identificationCard;
    }

    public void correctDatav2(String nameCorrected, String identificationCardCorrected){
        name = nameCorrected;
        identificationCard = identificationCardCorrected;
    }


    public String getName() {
        return name;
    }

    public String getIdentificationCard() {
        return identificationCard;
    }


}
