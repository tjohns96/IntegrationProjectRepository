package integration_Project;

/* My name is Trevor Johnson
This is my Integration Project for COP2006
Java has 8 built in data types:
Char: A data type holding a single 16 bit Unicode character
Byte: A data type holding integers from -128 to 127, or 2^8 values
Short: A data type holding 2^16 possible integer values
Int: A data type holding 2^32 possible integer values
Long: A data type that holds 2^64 possible integer values
Float: A data type that holds decimal numbers, but this one is bad.
Double: A data type that holds decimal numbers, and this one is good.
Boolean: Holds either a value of True or False 
Variable is like a box that holds a value assigned to it of a certain type
Scope is which methods have access to which variables
The final keyword means a variable's value cannot be changed anywhere in
the program
Casting is converting one data type into another data type */
public class Integration_Project {
  final double pi = 3.14;
  public static void main(String[] args) {
    System.out.println("\tHello user, and welcome to my integration project.");    
    boolean theTruth = true;
    String thread = "I don't like snakes";
    int myAge = 17;
    double myAgeButWithAZero = (double) myAge;
    System.out.println("The truth is " + theTruth);
    System.out.println(thread);
    System.out.println(myAge + " but now it has a zero " + myAgeButWithAZero);
  }
}
