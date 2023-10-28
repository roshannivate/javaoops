package object;

import java.util.Objects;

class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Car car = (Car) obj;
        return year == car.year && make.equals(car.make) && model.equals(car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year);
    }

    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}

public class Example_3 {

	public static void main(String[] args) {
		
		        Car car1 = new Car("Toyota", "Camry", 2020);
		        Car car2 = new Car("Honda", "Civic", 2022);
		        Car car3 = new Car("Toyota", "Camry", 2020);

		        // Using Object methods
		        System.out.println("car1 equals car2: " + car1.equals(car2));
		        System.out.println("car1 equals car3: " + car1.equals(car3));
		        System.out.println("car1 hashCode: " + car1.hashCode());
		        System.out.println("car2 hashCode: " + car2.hashCode());
		        System.out.println("car3 hashCode: " + car3.hashCode());
		        System.out.println("car1 toString: " + car1.toString());
		    }
		


	}

