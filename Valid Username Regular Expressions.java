import java.io.*;
import java.util.*;

public class CheckUsername {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String regex = "[a-zA-Z][a-zA-Z0-9_]{7,29}";
        for(int i = 0; i < n; i++)
        {
            String s = scanner.nextLine();
            System.out.println(s.matches(regex)?"Valid":"Invalid");
        }
        scanner.close();
    }
}
