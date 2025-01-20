class Vehicle {
    void Start() {
        System.out.println("This is a Vehicle ");
    }
}
  class Car extends Vehicle {
    void Features () {

        System.out.println("Feature of Car : Got AC , Can Drift ,Better Performance " );

    }
}
  class  Bike extends Car {
    void Ride () {
        System.out.println("This is the bike ");
    }
}


 class Multi_level

 {
    public static void main(String[] args) {

        Bike B = new Bike();
        B.Ride();
        B.Start();

    }
}
