import java.io.*;
import java.util.*;

public class HashSet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        for (int i = 0; i < t; i++) 
        {
            pair_left[i] = scanner.next();
            pair_right[i] = scanner.next();
        }
        scanner.close();
        HashSet<String> hashset = new HashSet<>();
        for(int i = 0; i < t; i++)
        {
            String str = pair_left[i] +" " + pair_right[i];
            String str2 = pair_right[i] + " " + pair_left[i];
            if(!hashset.contains(str) && !hashset.contains(str2))
                hashset.add(str);
            System.out.println(hashset.size());
        }
    }
}
