package consultation.city;

import java.util.Objects;

public class City implements Comparable<City> {
    // fields of class
    private String name;// название
    private int population;// население
    private String country;// страна
    private double index;// рейтинг

    public City(String name, int population, String country, double index) {
        this.name = name;
        this.population = population;
        this.country = country;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getIndex() {
        return index;
    }

    public void setIndex(double index) {
        this.index = index;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City city)) return false;
        return Objects.equals( name, city.name ) && Objects.equals( country, city.country );
    }

    @Override
    public int hashCode() {
        return Objects.hash( name, country );
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", country='" + country + '\'' +
                ", index=" + index +
                '}';
    }
// Будем сортировать по алфавиту по названию города
    @Override
    public int compareTo(City o) {
        int res = this.name.compareTo( o.name );
        if (res != 0) {
            return res;// если строки не совпали вернули res
        }else {// когда стоки совпали
         res = Integer.compare( population, o.population );// сравниваем по размеру население
         return res;
        }

        //return this.name.compareTo( o.name );// если будет >0 то при сортировке объекты надо поменять местами
    }
}
