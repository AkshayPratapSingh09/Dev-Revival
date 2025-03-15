import java.util.*;
public class Nearest {
    public static void main(String [] args)
    {
        // int []edges={4 ,4, 1, 4, 13, 8, 8, 8, 0, 8, 14, 9, 15, 11, -1, 10, 15, 22, 22, 22, 22, 22, 21};
        int[] edges = NearestMeetingTestCases.test1;
        int c1=0;
        int c2=4;
        List <Integer> st1=bfs(edges,c1);
        System.out.println(st1);
        List <Integer> st2=bfs(edges,c2);
        System.out.println(st2);
        int min=Integer. MAX_VALUE;
        int ans=-1;
        for (Integer node : st1) {
            if (st2.contains(node)) {
                int i=st1.indexOf(node);
                int j=st2.indexOf(node);
                int dis=Math.abs(i-j);
                System.out.println(dis);
                if(dis<min)
                {
                    min=dis;
                    ans=node;
                }
            }
        }
         System.out.println("First common reachable node from " + c1 + " and " + c2 + ": " 
                + ans);
    }
    public static List<Integer> bfs(int[] edges,int start)
    {
        List<Integer> st=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty())
        {
            int i=q.poll();
            if(i!=-1)
            {
            st.add(i);
            int next=edges[i];
            if(next!=-1 && !st.contains(next))
            q.add(next);
            }
        }
        return st;
    }
}