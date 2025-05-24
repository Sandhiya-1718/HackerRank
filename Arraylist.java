import java.io.*;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) 
        {
            int d = scanner.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < d; j++) 
                a.add(scanner.nextInt());
            list.add(a);
        }

        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) 
        {
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1;

            if (x >= 0 && x < list.size() && y >= 0 && y < list.get(x).size()) 
                System.out.println(list.get(x).get(y));
            else
                System.out.println("ERROR!");
        }
        scanner.close();
    }
}
