class Car {
    String name;
    int number;
}

public class Class {
    public static void main(String[] args) {

        Car myCar = new Car();

        myCar.name = "Toyota";
        myCar.number = 1201;

        System.out.println(myCar.name);
        System.out.println(myCar.number);
    }
}