Explain method without return as the last statement with return type in java

In Java, methods with a return type are defined to return a specific type of value back to the caller when invoked. However, not all methods with a return type necessarily end with a return statement as the last statement in their body. Here’s how methods with return types can work without having the return statement as the last statement:
Method Definition Syntax

java

returnType methodName(parameters) {
    // method body
    // statements
    return value; // return statement
    // more statements
}

Explanation

    returnType: Specifies the type of value that the method will return after it executes.

    methodName: Name of the method which uniquely identifies it within its class.

    parameters: Optional list of parameters that the method can accept. They are enclosed in parentheses ().

    Method Body: The body of the method, enclosed in curly braces {}, contains the code that defines what the method does.

    Return Statement: The return keyword is used to return a value of the specified type from the method to the calling code. This statement can appear at any point within the method body.

Example

Let’s consider an example where we have a method calculateAverage that computes the average of an array of integers and returns it. In this example, the return statement is not the last statement in the method body:

java

public class Example {
    
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            // Handle special case where numbers array is empty
            System.out.println("Empty array, returning default value");
            return 0.0; // Return statement
        }
        
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        double average = sum / numbers.length;
        
        System.out.println("Average calculated: " + average);
        
        return average; // Return statement
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};
        double avg = calculateAverage(nums);
        System.out.println("Average: " + avg);
    }
}

    Method: calculateAverage is a static method that takes an array of integers (int[] numbers) as a parameter.
    Method Body: It first checks if the numbers array is null or empty. If so, it prints a message and returns 0.0.
    Calculating Average: If the array is not empty, it calculates the sum of the numbers in the array, computes the average, and then returns the average.
    Return Statement: There are two return statements in this method. The first one returns 0.0 if the array is empty, and the second one returns the calculated average.


