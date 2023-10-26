package nextCollections;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {
    public static Map<Character, Integer> countChars(char[] arr) {

        Map<Character, Integer> characterCount = new HashMap<>();
        for (char c : arr) {
            if (characterCount.containsKey(c)) {
                characterCount.put(c, characterCount.get(c) + 1);
            } else {
                characterCount.put(c, 1);
            }
        }
        return characterCount;
    }

    public static void main(String[] args) {

        char[] arr = {'a', 'b', 'c', 'd', 'a', 'c', 'a', 'b', 'b', 'b'};
        Map<Character, Integer> characterCount = countChars(arr);

        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            System.out.println("Character: " + entry.getKey() + ", Count " + entry.getValue());
        }
    }
}
