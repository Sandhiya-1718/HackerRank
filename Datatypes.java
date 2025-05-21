import java.util.Scanner;

public class Datatypes {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < t; i++)
        {
            String n = scan.nextLine();
            try
            {
                long num = Long.parseLong(n);
                System.out.println(n + " can be fitted in: ");
                if(num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(num >= Short.MIN_VALUE && num <= Short.MAX_VALUE)
                    System.out.println("* short");
                if(num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE)
                    System.out.println("* int");
                System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(n +" can't be fitted anywhere.");
            }
        }
        scan.close();
    }
}
