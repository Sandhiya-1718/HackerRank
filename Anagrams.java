import java.io.*;
import java.util.*;

public class Anagrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []a = scanner.nextLine().toLowerCase().chars().sorted().toArray();
        int []b = scanner.nextLine().toLowerCase().chars().sorted().toArray();
        System.out.print(Arrays.equals(a,b)?"Anagrams":"Not Anagrams");
        scanner.close();
    }
}
