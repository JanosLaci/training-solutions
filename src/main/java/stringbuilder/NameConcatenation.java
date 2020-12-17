package stringbuilder;

//Készítsünk olyan osztályt, amely egy név részelemeinek megadásával magyar vagy nyugati stílusú név összefűzést csinál,
// kezelve az opcionális elemek hiányát is.
// A névelemek a következők: családi név, köztes név, keresztnév (givenName) és titulus (Mr, Ms, Dr, Prof).
// A neveket tovább lehet módosítani, lehet beszúrni például titulust, törölni belőle részeket.
//Hibakezelés
//A családi név és az adott (kereszt) név kötelező paraméterek.
// Hiányuk esetén (null vagy üres String) dobjon IllegalArgumentException-t.
//Megvalósítás
//A titulus legyen enum.
//publikus metódusok:
//public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title)
//public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title)
//public String insertTitle(String name, Title title, String where)
//public String deleteNamePart(String name, String delete)
//Tippek
//Vezessünk be egy isEmpty(String) metódust,
// amelynek visszatérési értéke true ha a paraméter String null vagy üres String!


public class NameConcatenation {

    String familyName,  middleName,  givenName;
    Title title;


    public boolean isEmpty(String inputString){
        return  (inputString == null || inputString.isBlank() );

    }

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.add(familyName)

    }


}
