package practice.hw;

import java.util.Comparator;
import java.util.LinkedList;


// Создайте класс Country со следующими полями:
//название;
//население(в млн.);
//континент. Создайте связный список, содержащий 11 стран из разных континентов. Получите списки этих стран, отсортированные по:
//алфавиту;
//по размеру населения в стандартном и обратном порядках;
//принадлежности континенту и размеру населения в порядке от большего к меньшему.
public class Country {
    //Fields
    private String name;
    private double population;
    private String continent;

    // Constructor
    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    // Getter и Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    // toString
    @Override
    public String toString() {
        return "Country | " + "Name :" + name + " | population : " + population + " | continent : " + continent + " || ";
    }

    public static void main(String[] args) {

        // Создание списка стран
        LinkedList<Country> countries = new LinkedList<>();

        // Добавление стран в список
        countries.add( new Country( "China", 1439.3, "Asia" ) );
        countries.add( new Country( "USA", 328.2, "North America" ) );
        countries.add( new Country( "Brazil", 213.9, "South America" ) );
        countries.add( new Country( "India", 1380.0, "Asia" ) );
        countries.add( new Country( "Nigeria", 206.1, "Africa" ) );
        countries.add( new Country( "Indonesia", 270.6, "Asia" ) );
        countries.add( new Country( "Pakistan", 225.2, "Asia" ) );
        countries.add( new Country( "Bangladesh", 166.3, "Asia" ) );
        countries.add( new Country( "Russia", 146.8, "Europe" ) );
        countries.add( new Country( "Mexico", 1439.3, "North America" ) );
        countries.add( new Country( "Japan", 125.4, "Asia" ) );

        // Вывод списка стран
        System.out.println( "List of countries: " + countries );
        System.out.println( "======================================================================" );

        // Сортировка стран по алфавиту
        countries.sort( new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.getName().compareTo( o2.getName() );
            }
        } );
        System.out.println( "List of countries after sorting alphabetically: " + countries );
        System.out.println( "======================================================================" );

        // Сортировка стран по населению
        countries.sort( new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare( o1.getPopulation(), o2.getPopulation() );
            }
        } );
        System.out.println( "List of countries after sorting by population: " + countries );
        System.out.println( "======================================================================" );

        // Обратная сортировка стран по населению
        countries.sort( new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return Double.compare( o2.getPopulation(), o1.getPopulation() );
            }
        } );
        System.out.println( "List of countries after sorting by population in reverse order: " + countries );
        System.out.println( "======================================================================" );


        // Сортировка по континентам от большего к меньшему
        countries.sort( new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o2.getContinent().compareTo( o1.getContinent() );
            }
        } );
        System.out.println( "List of countries by continent from largest to smallest: " + countries );
        System.out.println( "======================================================================" );

        // Сортировка стран по континентам от большего к меньшему и по населению
        countries.sort( new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                int compareContinents = o2.getContinent().compareTo( o1.getContinent() );
                if (compareContinents != 0) {
                    return compareContinents;
                }
                return Double.compare( o2.getPopulation(), o1.getPopulation() );
            }
        } );
        System.out.println( "List of countries by continent and population from largest to smallest: " + countries );
        System.out.println( "======================================================================" );


    }

}
