package attributes.person;

public class PersonMain {
    public static void main(String[] args) {

        Address myAdress =
                new Address("آپ کسی ہے", "Pußtaborzaßtó", "Fő út 10", "1051" );
        Address myToAdress =
                new Address("Mainland", "Mainz", "Main út 10", "1052");
        Person myPerson = new Person("Pistike", "123", myAdress);

        System.out.println("Költözés előtt:");

        System.out.println(myPerson.getName() + " címe: " + myPerson.getPersonAddress().addressToString());

        myPerson.moveTo(myToAdress);

        System.out.println("költözés után:");

        System.out.println(myPerson.getName() + " címe: " + myPerson.getPersonAddress().addressToString());


    }

}
