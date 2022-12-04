/*NAME:
 * ASSIGNMENT NUMBER:HW2
 * NET ID:
 *         DESCRIPTION
 * The project involves drfining a class named Elements with a constructor 
 * that inputs the elements properties as a real world entity and print 
 * Several entitues values and Propeties
 * 
 */

import java.util.Scanner;

public class Elements {
    private static final String Elements = null;
    static String ElementName;
    static char ElementSymbol;

    // Gives The Constructor instance of the Element Class
    public String Elements(String name, char Symbol, int AtomicNumber, float AtomicWeight) {
        String names;
        char Symbols;
        int AtomicNum;
        Float AtomWeight;
        // Example of an Element Helium that is set to the following properties
        names = ElementName.setText("Helium");
        Symbols = ElementSymbol.setText("he").toString();
        AtomicNum = ElementAtomicNumber.setText("Atomic number" + 2).toString();
        AtomWeight = ElementWeight.setText(1008).toString();
        // Returns the Element prperties
        return Elements;
    }

    public static void main(String[] args) {
        System.out.println("Enter the Elements Name");// Prompts the user to Enter the element Name
        Scanner sc = new Scanner(System.in);
        ElementName = sc.next();// Gets the Element Name like Either Helium,Hydrogen or Lithium
        System.out.println("Enter the Elements Symbol");// Prompts the user to Enter the element Symbol
        String Symbols = sc.next();
        System.out.println("Enter the AtomicNumber");// Prompts the user to Enter the element Atomic Number
        int ElementAtomicNumber = sc.nextInt();
        System.out.println("Enter the AtomicWeight");// Prompts the user to Enter the element Atomic Weight
        float ElementsWeight = sc.nextFloat();
        // Prints the Element poperties
        System.out.println(ElementName + "" + Symbols + "" + ElementAtomicNumber + "" + ElementsWeight);
        // output
        // Helium he 2 2034
    }
}
