class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
    }
}

// Lengkapi class Car yang mewarisi Vehicle
class Car extends Vehicle { // (1)
    private String model;

    public Car(String brand, String model) {
        super(brand); // (2) memanggil konstruktor superclass
        this.model = model;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // (3) panggil method dari superclass
        System.out.println("Model: " + model);
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "posce"); // (4) buat objek dari class Car isi nilainya
        car.displayInfo();
    }
}
