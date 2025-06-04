import java.io.*;
import java.util.*;

class Details{
    private int id;
    private String name;
    private double cgpa;
    
    Details(int id, String name, double cgpa)
    {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    
    public int getId(){ return id;}
    
    public String getName(){ return name; }
    
    public double getCgpa(){ return cgpa; }
}
public class Sort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List <Details> student = new ArrayList<>();
        while(n > 0)
        {
            int id = scanner.nextInt();
            String name = scanner.next();
            double cgpa = scanner.nextDouble();
            Details d = new Details(id, name, cgpa);
            student.add(d);
            n--;
        }
        Collections.sort(student, new Comparator<Details>() {
            @Override
            public int compare(Details s1, Details s2) {
                if (Double.compare(s2.getCgpa(), s1.getCgpa()) != 0) {
                    return Double.compare(s2.getCgpa(), s1.getCgpa()); 
                } else if (!s1.getName().equals(s2.getName())) {
                    return s1.getName().compareTo(s2.getName()); 
                } else {
                    return Integer.compare(s1.getId(), s2.getId()); 
                }
            }
        });
        
        for (Details s : student) {
            System.out.println(s.getName());
        }
    }
}
