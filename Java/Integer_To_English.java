import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Integer_To_English {
    public static void main(String[] args) {

        int num = 1234567;
        String ans = "";
        StringBuilder sc = new StringBuilder();

        // Output: "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

        LinkedHashMap<Integer,String> has = new LinkedHashMap<>();
        
        has.put(1000000000,"Billion");
        has.put(1000000,"Million");
        has.put(1000,"Thousand");
        has.put(100,"Hundred");
        has.put(90,"Ninety");
        has.put(80,"Eighty");
        has.put(70,"Seventy");
        has.put(60,"Sixty");
        has.put(50,"Fifty");
        has.put(40,"Fourty");
        has.put(30,"Thirty");
        has.put(20,"Twenty");
        has.put(19,"Nineteen");
        has.put(18,"Eighteen");
        has.put(17,"Seventeen");
        has.put(16,"Sixteen");
        has.put(15,"Fifteen");
        has.put(14,"Fourteen");
        has.put(13,"Thirteen");
        has.put(12,"Twelve");
        has.put(11,"Eleven");
        has.put(10,"Ten");
        has.put(1,"One");
        has.put(2,"Two");
        has.put(3,"Three");
        has.put(4,"Four");
        has.put(5,"Five");
        has.put(6,"Six");
        has.put(7,"Seven");
        has.put(8,"Eight");
        has.put(9,"Nine");


        String NumsToStr = String.valueOf(num);
        if (NumsToStr.length()==1){
            if (NumsToStr=="0")System.out.println("Zero");
            else{System.out.println(has.get(Integer.parseInt(NumsToStr)));}; 
        }

    //  Converting Normal Numbers into International System
    
        String NumsToStrFinal = "";
        int count = 1;
        for (int i = NumsToStr.length()-1; i >=0 ; i--) {
            // NumsToStrFinal += NumsToStr.substring(i, i+1);
            sc.append(NumsToStr.substring(i, i+1));
            if (count ==3){
                sc.append(",");
                count=0;
            }
            count +=1;
        }
    
        sc.reverse();
        count = 1;
        for (int i = sc.length()-1; i >= 0; i--) {
            if (count%3 == 1){
                if (has.containsKey(NumsToStr.substring(i-1,i))){
                    ans = has.get(NumsToStr.substring(i-1,i)) + ans;
                    count +=1;
                    i--;
                }
                else{
                    ans =  has.containsKey(NumsToStr.substring(i-1,i)) + ans;
                }
                count++;

            }  
           System.out.println(ans);
        }































    // int curr = 0;
    // System.out.println(has);
    // for(Map.Entry<Integer,String> entry : has.entrySet()){
        
    //     if(num<1000) break;
    //         curr = num/entry.getKey();
    //     System.out.println("By "+entry.getValue()+" got "+curr);
    //     num = num % entry.getKey();
    //     System.out.println("Remaning : "+num);
    //     if (curr != 0){
    //         if (curr>99){
    //             int count = 0; 
    //             String here = String.valueOf(curr);
    //             for (char a:here.toCharArray()){
    //                 String s = Character.toString(a);
    //                 if (s != "0"){
    //                     if (count == 0){
    //                         ans += has.get(Integer.parseInt(s)) + has.get(100);
    //                     }
    //                     if (count == 1){
    //                         ans += has.get(Integer.parseInt(s)*10);
                            
    //                     }
    //                     if (count == 2){
    //                         ans += has.get(Integer.parseInt(s));

    //                     }
    //                     count++;
    //                 }
    //             }
    //             ans +=  entry.getValue();
    //         }
    //         if (curr>9 && curr<100){
    //             int count = 0; 
    //             String here = String.valueOf(curr);
    //             for (char a:here.toCharArray()){
    //                 String s = Character.toString(a);
    //                 if (s != "0"){
    //                     if (count ==0){
    //                         ans += has.get(Integer.parseInt(s)*10) ;
    //                     }
    //                     if (count ==1){
    //                         ans += has.get(Integer.parseInt(s));
                            
    //                     }
    //                     count++;f
    //                 }
    //             }
    //             ans +=  entry.getValue();


    //         }
    //         else{
    //         ans = ans + has.get(curr) + entry.getValue();
    //         }
    //         if (num<1000) break;
    //     }
    // }
    // System.out.println(ans);


    // String first = "Hundred";
    // String second = "Hundred";
    // String thousane = "Hundred";
    // String s = String.valueOf(num);
    // int count = 0;
    // int curr = 0;
    // // System.out.println(s);
    // String[] numbers = {"Thousand","Million","Billion"};
    // String ans = "";

    // for (int i=s.length()-1;i>=0;i--){
    //     if (count ==0){
    //         ans = ans + has.get(s.substring(i, i+1));
    //     }
    //     if (count == 1){
    //         ans = ans + has.get(10+Integer.parseInt(s.substring(i, i+1)));
    //     }
    //     if (count == 0){
    //         ans = ans + has.get(s.substring(i, i+1));
    //     }
    //     System.out.println(s.substring(i, i+1));
    // }
    }
    
}

