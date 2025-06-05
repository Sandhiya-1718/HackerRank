import java.io.*;
import java.util.*;
import java.lang.reflect.*;

class Student{
    private String name;
    private String id;
    private String email;
    
    public String getName(){ return name; }
    public void setId(String id){ this.id = id; }
    public void setEmail(String email){ this.email = email; }
}

public class Reflection {

    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        Method[] methods = studentClass.getDeclaredMethods();
        List<String> methodNames = new ArrayList<>();
        for (Method method : methods)
            methodNames.add(method.getName());
        Collections.sort(methodNames);
        for (String name : methodNames)
            System.out.println(name);
    }
}
