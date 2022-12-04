
//Name:
//Assignment Number:HW1
//NET ID:
/*
The assignment involves creating a class Named Person that returns the 
Person properties and attributes like their Name age and Phone Number
The project file involves using  A CONSTRUCTOR Person
 * 
 */
import java.util.Scanner;//Importing the Scanner from the Java util libraries

public class Person {

    public static void main(String[] args) {
        String names;
        int age;
        int PhoneNumber;

    }

    public void Person(String names, int age, int PhoneNumber) {// Contructor
        System.out.println("Enter your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Enter your Age");
        int ages = sc.nextInt();
        System.out.println("Enter your PhoneNumber");
        int phonenum = sc.nextInt();
        System.out.println(name.toString()+""+ages+"years old"+""+phonenum);
        //Sample Report
        // VINCENT 21 years old 77843729
    }

}return Person;