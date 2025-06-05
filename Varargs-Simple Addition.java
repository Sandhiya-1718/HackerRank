import java.io.*;
import java.util.*;

class Add{
    public void add(int... numbers)
    {
        int sum = 0;
        StringBuilder expression = new StringBuilder();
        
        for(int i = 0; i < numbers.length; i++)
        {
            sum += numbers[i];
            expression.append(numbers[i]);
            if(i != numbers.length - 1)
                expression.append("+");
        }
        expression.append("=").append(sum);
        System.out.println(expression);
    }
}

public class Varargs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] inputs = new int[6];
        
        for(int i = 0; i < 6; i++)
            inputs[i] = scanner.nextInt();
            
        Add a = new Add();
        a.add(inputs[0], inputs[1]);
        a.add(inputs[0], inputs[1], inputs[2]);
        a.add(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4]);
        a.add(inputs[0], inputs[1], inputs[2], inputs[3], inputs[4], inputs[5]);
        scanner.close();
    }
}
