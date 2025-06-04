import java.io.*;
import java.util.*;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            if(x>y ){
                System.out.println(x/y);
            }
        }
        catch(InputMismatchException e){
             System.out.println("java.util.InputMismatchException");
        }
        catch(ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
        catch(Exception e){
            System.out.println(e); 
        scanner.close();
    }
    }
}
