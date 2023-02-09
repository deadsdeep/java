package javaproject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class missing {

	public static void main(String[] args) throws IOException{
		// TODO This program is used to identify the missing no. in a given sequence
		
        System.out.println("Enter the length of the array :");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println("Enter the numbers within the range");
        
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int num = missingNumber(arr, n);
        System.out.println("The missing number in the sequential range given is " + num);
    }

    public static int missingNumber(int arr[], int n) {
        int total = 0;
        total = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++) {
            total = total - arr[i];
        }

        return total;
    }

}