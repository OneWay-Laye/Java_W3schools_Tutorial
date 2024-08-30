/*
This Is the Test file that I am using following the W3school tutorial
 */

//Each file should have a class that matches the name of the file.
// Java is case sensitive and each class starts with a capitalized letter.
public class Test { //Curly braces shows the block of code for that class/method
    // inside of the class there must be a main method.
    public static void main(String[] args) {
        //System is apart of the Java Library
        //out is apart of the System class
        // println() is a method from out that allows you to print to console or file.
        // println() method prints and automatically creates a new line after.

        System.out.println();
        //Strings MUST be wrapped in double quotes ""
        System.out.println("Hello World");
        System.out.println();

        //To have two lines of code print on the same line
        // Use the method from out print()
        // Be sure to add the space either after the first statement or before the second
        System.out.print("Hello world ");
        System.out.print("Its going to be a great day!");

        // you can also print numbers or equations
        System.out.println(7);
        System.out.println(5 * 6);

        // In Java you have different variable types
        // String - Word, phrase, sentence
        // int - whole number
        // float - Number with a decimal
        // char - a Single character
        // boolean - True or False

        // To declare a variable you but declare they of var it is aswell
        // You must follow this declaration pattern
        // TYPE varName = varValue
        String name = "John";
        int age = 28;
        System.out.println(name);
        System.out.println(age);

    }
}