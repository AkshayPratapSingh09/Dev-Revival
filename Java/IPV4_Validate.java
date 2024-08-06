import java.util.Arrays;

public class IPV4_Validate {
    public static void main(String[] args) {
        String str = "222..111.111.111";
        String t = "";
        int test = Integer.parseInt(t);
        System.out.println(test>0);

         // Custom input string
         String str = "geekss@for@geekss";
         String[] arrOfStr = str.split("\\.");
         int len = arrOfStr.length;
         if (len!=4) System.out.println(false);

         for (String a : arrOfStr){
            if (a==""){
                System.out.println(false);
            }
             int curr = Integer.parseInt(a);
             System.out.println(a);
             if(curr > 255 || curr <0){
                System.out.println(false);
             }
         }
         System.out.println(true);
     }
        // int n = 4;
        // int i=0;
        // while (i<n){
        //     if( (curr <= 255)  &&  (curr >=0)){

        //     }
        // }
    }

