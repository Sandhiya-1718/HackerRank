import java.io.*;
import java.util.*;

public class MapDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String,String> number= new HashMap<String,String>();
        for(int i = 0; i < n; i++)
        {
            String name = scanner.nextLine();
            String phone = scanner.nextLine();
            number.put(name,phone);
        }
        while(scanner.hasNextLine())
        {
            String user = scanner.nextLine();
            if(number.containsKey(user))
                System.out.println(user + "=" + number.get(user));
            else
                System.out.println("Not found");
        }
        scanner.close();
    }
}
