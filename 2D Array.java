import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Array2D {
    
    private static int printMaxSum(List<List<Integer>> matrix){
        int ans=Integer.MIN_VALUE;
        int rows = matrix.size();
        int columns = matrix.get(0).size();
        for(int i=0;i<=rows-3;i++)
        {
            for(int j=0;j<=columns-3;j++)
            {
                int sum = matrix.get(i).get(j)+matrix.get(i).get(j+1)+matrix.get(i).get(j+2)+matrix.get(i+1).get(j+1)+matrix.get(i+2).get(j)+matrix.get(i+2).get(j+1)+matrix.get(i+2).get(j+2);
                ans = Math.max(ans,sum);
            }
        }
        return ans;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try
            {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );   
            } 
            catch (IOException ex) 
            {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        int maxHourglassSum = printMaxSum(arr);
        System.out.println(maxHourglassSum);
    }
}
