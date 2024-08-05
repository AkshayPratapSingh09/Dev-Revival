public class PrintNth_To1 {
 public static void main(String[] args) {
    reveseNum(10);
 }  
 
 static void reveseNum(int k){
    if (k==0) return;
    System.out.println(k);
    reveseNum(k-1);
 }
}
