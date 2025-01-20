// this keyword holds the reference to the current object

class Example  {   // Created a class name as Example which contais the int vlaue
    int value ;
    public void setValue(int value) {
        this.value = value; // this.value will hold the reference of the current object (int value )

    }
    public int getValue() {
        return value ;
    }
}
public class ThisKeyword { // created one more class to execute the new object and their values present in it.
    public static void main(String[] args) {
        Example  s1 = new Example  (); // Created a object name as s1 which will hold the values of the current object

        s1.setValue(10); // We have set the value of s1 as 10
        System.out.println(s1.getValue()); // And printed that value

        Example s2 = new Example(); // One more Object we have created name s2
        s2.setValue(20); // Set the value of s2 as 20
        System.out.println(s2.getValue()); // Printed that value

    }



}
