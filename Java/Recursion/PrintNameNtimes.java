
public class PrintNameNtimes {
public static void main(String[] args) {
    // String s ="Hey!";
    // printNTimes(s, 0);
}

static void printNTimes(String Name, int count){
    if (count==5) return;

    System.out.println(Name);
    printNTimes(Name, count+1);

}
    
}