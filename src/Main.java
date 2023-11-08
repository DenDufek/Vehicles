enum Vehicles {
    CAR(20000, "Червоний"),
    MOTORCYCLE(8000, "Синій"),
    TRUCK(50000, "Зелений"),
    BUS(25000, "Жовтий");

    private int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return name() + ", колір: " + color + ", вартість: " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicles myCar = Vehicles.CAR;
        Vehicles myMotorcycle = Vehicles.MOTORCYCLE;

        System.out.println("Мій автомобіль: " + myCar);
        System.out.println("Мотоцикл: " + myMotorcycle);
    }
}
