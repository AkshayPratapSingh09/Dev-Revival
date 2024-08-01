/**
 * AgeOfSeniorCitizen
 */
public class AgeOfSeniorCitizen {

    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        int ans = 0;
        for (int i = 0; i < details.length; i++) {
            if (Integer.parseInt(details[i].substring(11, 13))>60){
                ans +=1;
                // System.out.println(details[i]);
                // System.out.println();

            }
        }
        System.out.println(ans);
    }
}