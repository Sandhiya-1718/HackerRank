import java.io.*;
import java.util.*;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String regex = "[ !,?._'@]+";
        String []split = s.trim().split(regex);
        if(s.trim().isEmpty())
            System.out.println(0);
        else
        {
            System.out.println(split.length);
            for(String a:split)
                System.out.println(a);
        }
       scanner.close();
    }
}
