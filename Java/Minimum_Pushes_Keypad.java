import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Minimum_Pushes_Keypad {
    public static void main(String[] args) {
        // HashMap<Character,Integer> has = new HashMap<>();
        TreeMap<Character, Integer> has = new TreeMap<>(Comparator.reverseOrder());
        // has.put('a',1);
        // has.put('b',2);
        // has.put('c',3);
        // has.put('d',1);
        // has.put('e',2);
        // has.put('f',3);
        // has.put('g',1);
        // has.put('h',2);
        // has.put('i',3);
        // has.put('j',1);
        // has.put('k',2);
        // has.put('l',3);
        // has.put('t',1);
        // has.put('u',2);
        // has.put('v',3);
        // has.put('m',1);
        // has.put('n',2);
        // has.put('o',3);
        // has.put('p',1);
        // has.put('q',2);
        // has.put('r',3);
        // has.put('s',4);
        // has.put('w',1);
        // has.put('x',2);
        // has.put('y',3);
        // has.put('z',4);
        String word = "aabbccddeeffgghhiiiiii";
        // String word = "alporfmdqsbhncwyu";
        
        
        for (char c : word.toCharArray()) {
            if(!has.containsKey(c)){
                has.put(c,1);
            }else{
                has.put(c,has.get(c)+1);
            } 
        }
        System.out.println("Frequency Map :");
        System.out.println(has);
        int count = 0;
        int cost = 0;
        int flag = 1;
        for (Map.Entry<Character, Integer> entry : has.entrySet()) {
            count +=1;
            if (count % 9 == 0){
                System.out.println("Updated flag");
                flag +=1;
            }
            System.out.println(flag);
            System.out.println(entry.getKey()+" flag: "+entry.getValue());
            cost +=flag*entry.getValue();
            System.out.println("Cost :"+cost);
            // System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println(cost);
    }

}
