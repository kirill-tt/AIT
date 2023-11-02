package practice.json_wrapper;
// имя возраст это данные в одной программе
// {name:, age:}-это и есть Json который передают другой программе и она может его прочитать (parsing)
public class JsonWrapper1 {

    // поле класса
    private  Object value;

    // конструктор


    public JsonWrapper1(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{value: "+ value + "}";
    }
}
