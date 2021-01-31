package exam02.cv;

//Egy önéletrajzot reprezentáló osztályt kell létrehozni, melyben van egy név,
// valamint skillek (hogy mihez ért az illető).
// A skill egy névvel és egy számmal (szint) rendelkezik, utóbbi 1 - 5 között.
//Az önéletrajz a Cv osztály pár metódussal, a skill a Skill osztály.
//A skillek megadása a nevével, valamint a szintjével történik, pl. programming (5).
//A findSkillLevelByName() a skill neve alapján visszaadja annak szintjét.


import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;

    //nem kapja meg konstruktorban, példányosítani kell
    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }


    public void addSkills(String... inputSkillAndLevelInParenthesesVarArgs) {
        for (String varArgsItem:
                inputSkillAndLevelInParenthesesVarArgs) {
            String skillSubstring = varArgsItem.substring(0,varArgsItem.length()-4);
            String levelSubstring = varArgsItem.substring(varArgsItem.length()-2,varArgsItem.length()-1);

            skills.add(new Skill(skillSubstring,Integer.parseInt(levelSubstring)));
        }


    }

    public int findSkillLevelByName(String inputSkillNameString) {

        for (Skill skillItem: skills) {if (skillItem.getName().equals(inputSkillNameString)) return skillItem.getLevel();}

       throw new SkillNotFoundException("Skill not found with name: " + inputSkillNameString);
    }


    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}

