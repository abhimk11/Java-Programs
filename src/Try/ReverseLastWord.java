package Try;

public class ReverseLastWord {
    public static String reverseLastWord(String s){
        int spaceIndex = -1;
        for (int i = s.length()-1;i>=0;i--){
            if (s.charAt(i)==' '){
                spaceIndex = i;
                break;
            }
        }

        if (spaceIndex==-1){
            return s;
        }
        String lastWord = s.substring(spaceIndex+1);
        String reversedWord = "";
        for (int i=lastWord.length()-1;i>=0;i--){
            reversedWord += lastWord.charAt(i);
        }
        return s.substring(0,spaceIndex+1) + reversedWord;
    }

    public static void main(String[] args) {
        String s = "Hello World Everyone";
        String reversedLastWord = reverseLastWord(s);
        System.out.println(reversedLastWord);
    }
}

