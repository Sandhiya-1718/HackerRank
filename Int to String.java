import java.util.Scanner;

public class IntToString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = Integer.toString(n);
        if(s!=null && s.equals(String.valueOf(n)))
            System.out.print("Good job");
        else
            System.out.print("Wrong answer");
        scan.close();
    }
}
