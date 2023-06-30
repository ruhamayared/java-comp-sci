// HelloWorld.java

// class declaration - every Java program has at least one class - the basic building block
// class indicates that we are defining a class
// public means that this class can be used by other classes
// HelloWorld is the name of the class and has to be capitalized and match the file name
// HelloWorld is known as an identifier - it is the name of a class, method, or variable
public class HelloWorld {
    // main method - every Java program has at least one main method
    // void means that this method does not return any value
    // public means that this method can be called by other classes
    // static means that this method is associated with the class and not with an
    // instance of the class
    // String[] args is an array of Strings that are passed to the main method
    // @return - what the method returns - in this case, nothing
    // @param - what the method takes in - in this case, a String
    public static void main(String[] args) {
        // System.out.println() is a method that prints a line of text to the console
        // So the main method itself doesn't do much, but it calls the println method to
        // print a line of text
        // someone wrote the println method for us and it is stored in a library
        System.out.println("Hello, World!"); // semicolon ends the statement
    }// end of main method
}// end of class HelloWorld

// What is the system.out part?
// System is a class
// out is a static field in the System class
// out is an object of type PrintStream
// println is a method of the PrintStream class
// System.out.println() is a method call
// System.out.println("Hello, World!"); is a method call with an argument
// "Hello, World!" is a String literal

// What is the public static void main(String[] args) part?
// public is an access modifier - it means that the method is visible and can be
// called from other objects of other
// static is a keyword that means that the method is associated with the class
// and not with an instance of the class