import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
    public int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n)
    {
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            if(n%i==0)
                sum+=i;
        }
        return sum;
    }
}
public class Interface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        AdvancedArithmetic a = new MyCalculator();
        System.out.println("I implemented: AdvancedArithmetic");
        System.out.println(a.divisor_sum(n));
        scanner.close();
    }
}
