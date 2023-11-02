package practice.city.model;

public class City implements Comparable<City>{
    private String name;
    private Integer population;

    public City(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;

        if (!name.equals( city.name )) return false;
        return population.equals( city.population );
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + population.hashCode();
        return result;
    }

    @Override
    public int compareTo(City o) {
        return Integer.compare( population, o.population );
    }

}
