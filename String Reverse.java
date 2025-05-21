import java.io.*;
import java.util.*;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        StringBuilder s = new StringBuilder(a);
        if(a.compareTo(s.reverse().toString())==0)
            System.out.print("Yes");
        else
            System.out.print("No");
        scanner.close();
    }
}
