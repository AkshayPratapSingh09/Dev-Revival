import java.util.*;

public class TrialObjectSorting {
    // William 23.51
    // Jade 23.83
    // Peter 30.33
    // Anna 53.50
    public static void main(String[] args) {
        
        HashMap<String, Double> voyageDetails = new HashMap<>();

        voyageDetails.putIfAbsent("William", 23.51);
        voyageDetails.putIfAbsent("Jade", 23.83);
        voyageDetails.putIfAbsent("Peter", 30.33);
        voyageDetails.putIfAbsent("Anna", 53.50);

        // voyageDetails.forEach((key,value) ->
        //     System.out.println(key+" : "+value));
    
        List<Map.Entry<String,Double>> list = new ArrayList<>(voyageDetails.entrySet());

        System.out.println(list);
        System.out.println("After Sorting");
        list.sort(Map.Entry.comparingByValue());
        
        System.out.println(list);
        
    }
    


}