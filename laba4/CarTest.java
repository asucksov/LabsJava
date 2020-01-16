package car;

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "Q5", "GT", 50000000, 2017);
        Car c2 = new Car("Nissan", "Xtrail", "Luxe", 16000000, 2019);
        Car c3 = new Car("Mersedes", "SOSKA", "Standart", 21000000, 3010);
        c1.println();
        c2.println();
        c3.println();
    }
}
