Use return with void type in java

In Java, a method with a return type of void explicitly indicates that the method does not return any value. However, the return statement can still be used within a void method to immediately terminate the method and return control to the caller. Here’s an example to illustrate this:



public class Example {

    public static void main(String[] args) {
        printMessage("Hello, World!");
    }

    public static void printMessage(String message) {
        if (message == null) {
            System.out.println("Message is null.");
            return; // This terminates the method if message is null
        }

        System.out.println(message);
    }
}

In the printMessage method:

 >   If the message parameter is null, the method prints "Message is null."
	and then uses return; to exit the method immediately.
 >  If message is not null, it prints the message passed to it.

In this example, printMessage is a void method, meaning it doesn't return any value (void). The return; statement is used to exit the method prematurely based on a condition (if message is null). 