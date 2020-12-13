package introjunit;

public class Gentleman {

    //Hozz létre egy introjunit.Gentleman osztályt,
    // melyben van egy public String sayHello(String name) metódus,
    // mely visszaad egy String-et, mely egy üdvözlő szöveg (Hello),
    // hozzáfűzve a paraméterként átadott név!
    //Létrehoztunk egy introjunit.GentlemanTest osztályt a teszt ágon, mely azt ellenőrzi,
    // hogy John Doe nevet átadva a visszaadott szöveg valóban Hello John Doe.

    public String sayHello(String name){
        if (name.isEmpty()) return "Hello Anonymous";
        else return ("Hello " + name);
    }


}
