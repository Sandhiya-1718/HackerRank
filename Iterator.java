import java.io.*;
import java.util.*;

public class Iterator {
     static void func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        
        while(it.hasNext()) {
            if(it.next().equals("###")) break; 
        }

        while(it.hasNext()) {
            System.out.println((String) it.next());
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int m = sc.nextInt();  
        ArrayList mylist = new ArrayList();

        for(int i = 0; i < n; i++) {
            mylist.add(sc.nextInt());
        }

        mylist.add("###");  
        for(int i = 0; i < m; i++) {
            mylist.add(sc.next());
        }

        func(mylist);
    }
}
