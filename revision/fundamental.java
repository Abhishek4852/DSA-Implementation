
import java.util.*;

public class fundamental {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // swap(in.nextInt(),in.nextInt());
        // variable();
        // c_area(in.nextDouble());
        int [] arr = {5,1,3,8,0,5,3,6,4,7}; // 1 d 
        int [][] arr2 = {
            {5,36,7,33,7,44}, {77,3,2,5,7,95,33455},{9,3,4,6,9,5,3,6,7,5}    
        };
        max(arr,arr2);
    }
// Write a program to swap two numbers using a temporary variable.
    static void swap(int a, int b){
        int c = a;
        a=b;
        b=c;
        System.out.println("a ="+a+" ,b ="+b);
    }
// Declare three variables: int, float, and String. Initialize them and print their values.

static void variable(){
    int a =5;
    float b = 56.87f;
    String str = "Abhishek";
    System.out.println(a+" "+b+" "+str);
}


// Write a program to calculate the area of a circle using a final variable for the value of π (pi).
static void c_area(double radius){
    System.out.println(Math.PI*radius*radius);
}

// Declare a static variable in a class and demonstrate how it is shared among all objects of the class.
// Scoping
// Write a program to demonstrate the scope of a variable declared inside a method.
// Write a program to use a variable in multiple blocks (if, for, etc.) and observe its scope.
// Create a program where a variable declared in one method is not accessible in another method.
// Write a program to show the scope of a variable declared in a loop.
// Shadowing
// Write a program to demonstrate shadowing of a class-level variable by a local variable.
// Write a program where a method parameter shadows a class-level variable.
// Create a program to illustrate shadowing between parent and child classes.
// Write a program to show how to access the shadowed variable using this or super keywords.
// Ternary Operator
// Write a program to find the maximum of two numbers using a ternary operator.
// Write a program to determine if a given year is a leap year using a ternary operator.
// Use a ternary operator to assign "Pass" or "Fail" based on a student's marks.
// Write a program to find the smallest of three numbers using nested ternary operators.
// For Loop
// Write a program to calculate the factorial of a number using a for loop.
// Write a program to print the Fibonacci series up to n terms using a for loop.
// Create a program to check if a number is prime using a for loop.
// Write a program to print the following pattern using nested for loops:
// yaml
// Copy code
// 1
// 22
// 333
// 4444
// 55555
// 1D Arrays
// Write a program to find the largest and smallest numbers in a 1D array.
private static void max(int []arr , int [][] arr2){
    int max = arr[0];
    int min = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if(max<arr[i])
        max = arr[i];
        if(min > arr[i])
        min = arr[i];
    }
    System.out.println("max element of 1-D is "+max+" and min element is "+min);
    int max1=arr2[0][0];
    
    int min1=arr2[0][0];

    for( int i = 0; i<arr2.length;i++){
        for(int j= 0; j<arr2[i].length;j++){
            if(max1<arr2[i][j])
            max1=arr2[i][j];

            if(min1> arr2[i][j]){
                min1= arr2[i][j];
            }
        }
    }
    System.out.println(" max element of arr2 is "+max1+" and min ="+min1);
}

// Write a program to sort a 1D array in ascending order using the Bubble Sort algorithm.
// Write a program to count the frequency of each element in a 1D array.
// Write a program to merge two 1D arrays into a single array.
// 2D Arrays
// Write a program to calculate the sum of each row and column in a 2D array.
// Write a program to find the maximum element in a 2D array.
// Write a program to multiply two matrices.
// Write a program to check if a given 2D array is symmetric (i.e., it is equal to its transpose).
// ArrayList (1D)
// Write a program to add elements to an ArrayList and print them.
// Write a program to remove duplicate elements from an ArrayList.
// Write a program to sort an ArrayList of integers in descending order.
// Write a program to find the second largest element in an ArrayList.
// ArrayList (2D)
// Write a program to create a 2D ArrayList and add elements to it dynamically.
// Write a program to find the sum of all elements in a 2D ArrayList.
// Write a program to find the row with the maximum sum in a 2D ArrayList.
// Write a program to transpose a 2D ArrayList (swap rows and columns).
}
