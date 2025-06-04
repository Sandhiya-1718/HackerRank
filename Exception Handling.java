import java.io.*;
import java.util.*;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n == 0 && p == 0)
            throw new Exception("java.lang.Exception: n and p should not be zero.");
        if (n < 0 || p < 0)
            throw new Exception("java.lang.Exception: n or p should not be negative.");
        return (long)Math.pow(n, p);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            try {
                int n = scanner.nextInt();
                int p = scanner.nextInt();
                MyCalculator c = new MyCalculator();
                long pow = c.power(n, p);
                System.out.println(pow);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        scanner.close();
    }
}
