import java.util.HashMap;

public class KeyboardDistance {
    public static void main(String[] args) {
        // Define the keyboard (with uppercase characters)
        char[][] keyboard = {
            {'Q','W','E','R','T','Y','U','I','O','P'},
            {'A','S','D','F','G','H','J','K','L',' '},
            {' ','Z','X','C','V','B','N','M',' ',' '}
        };
        
        // Test string (convert to uppercase)
        String word = "qa".toUpperCase(); // convert to uppercase to match the keyboard array
        
        System.out.println(totalDistance(keyboard, word));
    }
    
    public static int totalDistance(char[][] keyboard, String word) {
        // Step 1: Create a map to store the position of each character
        HashMap<Character, int[]> charPositionMap = new HashMap<>();
        
        for (int i = 0; i < keyboard.length; i++) {
            for (int j = 0; j < keyboard[i].length; j++) {
                charPositionMap.put(keyboard[i][j], new int[]{i, j});
            }
        }
        
        // Step 2: Initialize total distance and starting position at 'Q'
        int totalDistance = 0;
        int[] currentPos = charPositionMap.get('Q'); // Start from 'Q'
        
        // Step 3: Calculate the distance for each consecutive character in the word
        for (int i = 0; i < word.length(); i++) {
            int[] nextPos = charPositionMap.get(word.charAt(i));
            
            // Calculate Manhattan distance
            totalDistance += Math.abs(currentPos[0] - nextPos[0]) + Math.abs(currentPos[1] - nextPos[1]);
            
            // Move to the next position
            currentPos = nextPos;
        }
        
        return totalDistance;
    }
}
