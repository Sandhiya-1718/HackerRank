import java.io.*;
import java.util.*;
import java.util.regex.*;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++)
        {
            try
            {
                Pattern.compile(scanner.nextLine());
            }
            catch(Exception e)
            {
                System.out.println("Invalid");
                continue;
            }
            System.out.println("Valid");
        }
        scanner.close();
    }
}
