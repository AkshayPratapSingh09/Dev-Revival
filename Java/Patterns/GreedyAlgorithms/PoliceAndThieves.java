import java.util.*;

public class PoliceAndThieves {
    public static void main(String[] args) {
       char arr[] = {'P', 'T', 'T', 'P', 'T'};
       int k = 1;

       ArrayList<Integer> police = new ArrayList<>();
       ArrayList<Integer> thieves = new ArrayList<>();

       for (int i=0; i< arr.length; i++){
        if(arr[i] == 'P') police.add(i);
        if(arr[i] == 'T') thieves.add(i);
       }
       int ans = 0;
       int  i = 0;
       int  j = 0;

       while (i<police.size() && j<thieves.size()){;
        if(Math.abs(police.get(i)-thieves.get(j)) <=k){
            ans++;
            i++;
            j++;
        }
        else if(police.get(i)<thieves.get(j)){
            i++;
        }
        else{
            j++;
        }
       }

       System.out.println(ans);
    }
}
