import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lineCount = 1;
        while(scan.hasNextLine())
        {
            String s = scan.nextLine();
            System.out.println(lineCount + " " + s);
            lineCount++;
        }
        scan.close();
    }
}
