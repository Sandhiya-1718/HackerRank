import java.util.Scanner;

public class Loops2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            int sum = 0;
            for(int j = 0; j < n; j++)
            {
                sum = a;
                for(int k = 0; k <= j; k++) 
                {
                    sum += (int)(b * Math.pow(2, k));
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        scan.close();
    }
}
