package sandboxCities;

//Megj.: textfile elérési útja

// src/main/resources/sandboxForCities/cities.txt

// textfile részlete:

//New York, NY, 8336697
//Los Angeles, CA, 3857799
//Chicago, IL, 2714856
//Houston, TX, 2160821
//Philadelphia, PA, 1547607
//Phoenix, AZ, 1488750
//San Antonio, TX, 1382951
//San Diego, CA, 1338348
//Dallas, TX, 1241162


class City {

    private String name;
    private String state;
    private int population;

    public City(String name, String state, int population) {
        this.name = name;
        this.state = state;
        this.population = population;
    }

    public String getName() { return name; }
    public String getState() { return state; }
    public int getPopulation() { return population; }
}


