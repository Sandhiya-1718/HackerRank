import java.io.*;
import java.util.*;

public class Subarray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) 
        {
            int sum = 0;
            for (int j = i; j < n; j++) 
            {
                sum += ar[j];

                if(sum < 0)
                    count++;
            }
        }
        System.out.println(count);    
        scanner.close();
    }
}
