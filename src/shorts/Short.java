import shorts.Bike;
import shorts.Car;
import shorts.Vehicle;

void main() {

    Vehicle vehicle = new Random().nextInt(2) % 2 == 0 ? new Car() : new Bike();

    fuel(vehicle);
}

void fuel(Vehicle vehicle) {
    if (vehicle instanceof Car car) {
//        Car car = (Car) vehicle;
        car.diesel();
    } else if (vehicle instanceof Bike bike) {
//        Bike bike = (Bike) vehicle;
        bike.petrol();
    }
}