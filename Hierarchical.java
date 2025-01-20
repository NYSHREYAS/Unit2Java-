class Vehicl
{
    void Vehicle()
    {
        System.out.println("It is Vehicle Which as Features");
    }
}
class Car1 extends Vehicl
{
    void Ride()
    {
        System.out.println("It  is Car");
    }
}
class Bike1 extends Vehicl
{
    void GoCrazy()
    {
        System.out.println("It  is Bike");
    }
}
class Bus extends Vehicl
{
    void pass()
    {
        System.out.println("It is Bus");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Car1 c=new Car1();
        c.Vehicle();
        c.Ride();

        Bike1 b=new Bike1();
        b.Vehicle();
        b.GoCrazy();

        Bus bu=new Bus();
        bu.Vehicle();
        bu.pass();
    }
}
