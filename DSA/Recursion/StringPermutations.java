import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringPermutations {
   static List<String> permutations = new ArrayList<>();
    public  static void permute(char [] inp, int idx) {
       if(idx == inp.length) {
        String res = Arrays.toString(inp);
        permutations.add(res);
        return;
       }
       for(int i=idx;i<3;i++)   
       {
         char temp=inp[i];
          inp[i]=inp[idx];
          inp[idx]=temp; // swap to create a new permutation
         permute(inp, idx+1);
         char tep=inp[i];
          inp[i]=inp[idx];
          inp[idx]=tep;
   
       }

       }

    public static void main(String[] args) {
        String str = "abc";
        char inp[]=str.toCharArray();
        permute(inp,0);
        System.out.println(permutations);
      
    }
}