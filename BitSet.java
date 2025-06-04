import java.io.*;
import java.util.*;

public class BitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int bitSetSize = sc.nextInt();
        BitSet b1 = new BitSet(bitSetSize);
        BitSet b2 = new BitSet(bitSetSize);
        BitSet []bitSets = {b1, b2};
        
        int queryCount = sc.nextInt();
        
        for (int i = 0; i < queryCount; i++) {
            String query = sc.next();
            int arg1 = sc.nextInt();
            int arg2 = sc.nextInt();
            switch (query) {
                case "AND" -> bitSets[arg1 - 1].and(bitSets[arg2 - 1]);
                case "OR" -> bitSets[arg1 - 1].or(bitSets[arg2 - 1]);
                case "XOR" -> bitSets[arg1 - 1].xor(bitSets[arg2 - 1]);
                case "FLIP" -> bitSets[arg1 - 1].flip(arg2);
                case "SET" -> bitSets[arg1 - 1].set(arg2);
            }
            System.out.println(bitSets[0].cardinality() + " " + bitSets[1].cardinality());
        }
        
        sc.close();
    }
}
