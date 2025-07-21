//What is the default value of an integer array in Java when it's created but not initialized?
/*In Java, when you create an integer array but do not initialize its elements, the default value of each element is 0.

✅ Example:
java
Copy
Edit
int[] arr = new int[5];
This creates an array of size 5. Since you haven't assigned values to the elements, Java automatically sets them to 0.

So arr will contain:

java
Copy
Edit
[0, 0, 0, 0, 0]
🔍 Why?
Java assigns default values to arrays of primitive types:

Data Type	Default Value
int	0
double	0.0
char	'\u0000'
boolean	false
Object (like String)	null */
