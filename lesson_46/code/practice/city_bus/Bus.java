package practice.city_bus;

import java.util.Objects;

public class Bus implements Comparable<Bus>{
    // fields
    public  String model;
    private String regNumber; // подобие ID
    private String route;// маршрут
    private int busCapacity;


    // constructor


    public Bus(String model, String regNumber, String route, int busCapacity) {
        this.model = model;
        this.regNumber = regNumber;
        this.route = route;
        this.busCapacity = busCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public int getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(int busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", route='" + route + '\'' +
                ", busCapacity=" + busCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus bus)) return false;
        return Objects.equals( regNumber, bus.regNumber );
    }

    @Override
    public int hashCode() {
        return Objects.hash( regNumber );
    }

    @Override
    public int compareTo(Bus o) { // нам надо отсортировать по маршруту и по вместимости
        int res = this.route.compareTo( o.route );

        return res != 0 ? res : -Integer.compare(this.busCapacity, o.busCapacity);// обратная последовательность большие автобусы выше в списке
    }
}
