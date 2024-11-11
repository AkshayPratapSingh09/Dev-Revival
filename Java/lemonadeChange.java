/**
 * lemonadeChange
 */
public class lemonadeChange {

    public static void main(String[] args) {
        // int[]  bills = {5,5,5,10,20};
        int[]  bills = {5,5,10,10,20};
        int change = 0;
        for(int i=0; i<bills.length; i++){
        // //     if (bills[i] == 5){
        // //         System.out.println("This one is 5");
        // //         System.out.println("change is "+change);
        // //         change +=5;
        // //     }else{
        //         System.out.println("This one is not 5 "+bills[i]);
        // //         System.out.println("change is "+change);
                
        //         int changeToReturn = bills[i]-5;x
        //         System.out.println("return to pay is "+changeToReturn);
        //         if (change < changeToReturn){
        //             System.out.println(false);
        //         }else{
        //             change -= changeToReturn;
                    change += bills[i];
        //         }
                 
        // //     }
        // // }
        System.out.println(true);
    }
}