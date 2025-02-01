interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }
}

class main{
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.drive();
        
        displayVehicle(myCar);
        Vehicle returnedVehicle = getVehicle();
        returnedVehicle.drive();
    }

    public static void displayVehicle(Vehicle vehicle) {
        vehicle.drive();
    }

    public static Vehicle getVehicle() {
        return new Car();
    }
}
