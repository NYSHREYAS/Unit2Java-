// created a new class which contains String , int , double
class Sample {


    public void print(String a ) {
        System.out.println("String value is :  " + a );
    }

    public void print(int a ) {
        System.out.println("Integer value is :  " + a );

    }
    public void print (double a) {
        System.out.println("Double value is :  - " + a );

    }


}



// Created a object and in that we assigned the new value i.e Shreyas , 10 ,20.2
public class Overloading {
    public static void main(String[] args) {
        System.out.println("Overloading data : ");
        Sample S = new Sample ();

        S.print("Shreyas ");
        S.print(10);
        S.print(20.2);
    }

}
