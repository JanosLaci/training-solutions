package week15day05;

public class weeklyCase {

    private String country;
    private String weekIdentifier;
    private int cases;
    private int population;

    public weeklyCase(String country, String weekIdentifier, int cases, int population) {
        this.country = country;
        this.weekIdentifier = weekIdentifier;
        this.cases = cases;
        this.population = population;
    }


    public String getCountry() {
        return country;
    }

    public String getWeekIdentifier() {
        return weekIdentifier;
    }

    public int getCases() {
        return cases;
    }

    public int getPopulation() {
        return population;
    }
}
