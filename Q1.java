//What is an array in Java? Why and when do we use arrays?



/*✅ What is an Array in Java?
An array in Java is a container object that holds a fixed number of values of a single data type. Each element in the array is stored in a contiguous memory location, and you can access them using index numbers, starting from 0.

java
Copy
Edit
int[] numbers = {10, 20, 30, 40, 50};
Here, numbers[0] is 10, numbers[1] is 20, and so on.

✅ Why Use Arrays?
We use arrays for the following reasons:

Reason	Explanation
1. Store Multiple Values	Instead of using many variables, we store values in a single array.
2. Indexed Access	You can quickly access or modify elements using an index.
3. Memory Efficient	Arrays use less memory than creating multiple individual variables.
4. Loops Friendly	You can easily traverse and process arrays using loops like for or while.
5. Organized Structure	Helps keep related data together and easier to manage.

✅ When to Use Arrays?
Use arrays when:

You need to store and manage multiple values of the same type.

The number of elements is known and fixed.

You need to apply the same operation on a collection of items.

Example: storing marks of students, list of product prices, etc.

✅ Example
java
Copy
Edit
public class ArrayExample {
    public static void main(String[] args) {
        int[] marks = new int[3];  // declaration and memory allocation
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 95;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i+1) + ": " + marks[i]);
        }
    }
}*/
