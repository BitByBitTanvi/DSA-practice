import java.util.*;

public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input array size:");
        int size = sc.nextInt();
        
        int arr[] = new int[size]; 
        
        System.out.println("Input array elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Input number to match:");
        int x = sc.nextInt();

        System.out.println("Output:");

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == x) {
                System.out.println("Number found at index " + i);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number not found in the array.");
        }

        // count tracks how many times the number is found.
        // If count == 0, that means it wasn't found at all.
    }
}






