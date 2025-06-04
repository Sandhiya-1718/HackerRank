import java.io.*;
import java.util.*;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle()
    {
        return title;
    }
}

class MyBook extends Book{
    @Override
    void setTitle(String s)
    {
        super.title = s;
    }
}
public class AbstractClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book new_novel = new MyBook();
        new_novel.setTitle(scanner.nextLine());
        System.out.print("The title is: "+new_novel.getTitle());
        scanner.close();
    }
}
