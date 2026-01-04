import java.util.*;

public class AllPermutations {
    public void main(String[] args) {
        String s="ABC";
        ArrayList<String> ans = new ArrayList<>();
        permute(0,s, ans);
        System.out.println(ans);
    }

    public static String swap(String s,int a,int b)
  {
    char ch[] = s.toCharArray();
    char p=ch[a];
    ch[a]=ch[b];
    ch[b]=p;
    //return String.valueOf(ch);
  }
    public static void permute(int index, String s,ArrayList<String> ans)
    {
      // bASE
      if(index==s.length()-1)
      {
       // System.out.println(s);
        ans.add(s);
        return;
      }

      // logic
      for(int i=index;i<s.length();i++)
      {
        // swap
        System.out.println("Index this time :"+i);
        System.out.println("Before swapping :"+s);
        System.out.println("swapping "+s.charAt(i)+" and "+s.charAt(index));
        
        s=swap(s,i,index);
        System.out.println("After swapping :"+s);
        // //recursion
        System.out.println("Entering Nested Permute");
        permute(index+1,s, ans);
        System.out.println("Exited Nested Permute");
        // backtrack
        s=swap(s,i,index);
        System.out.println("After Back swapping :"+s);
      }

    }

}
