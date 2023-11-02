public class Circus {
    public static void main(String[] args) {
     LightOn();
     entertainer();
     LightOff();
    }
  public static void LightOn(){
      System.out.println("Lights On");
}

public static void entertainer(){
        jogger();
        singer();
        clown();
}

    public static void LightOff(){
        System.out.println("Lights Off!");
    }

    public static void jogger() {
        System.out.println("My name is John");
        System.out.println("I´m jogging!");
    }

    public static void singer() {
      System.out.println("My name is Phillip");
      System.out.println("I´m singing!");
    }

    public static void clown() {
        System.out.println("My name is Oleg Popov");
        System.out.println("I´m joking!");
    }
    
}

    
    
