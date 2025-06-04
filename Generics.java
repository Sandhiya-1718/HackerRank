import java.io.*;
import java.util.*;

public class Generics {

    public static <T>void printArray(T element)
    {
        System.out.println(element);
    }
    public static void main(String[] args) {
        printArray(1);
        printArray(2);
        printArray(3);
        printArray("Hello");
        printArray("World");
    }
}
