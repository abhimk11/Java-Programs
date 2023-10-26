package java8;

public class removeSpaces {

    static String removeWhiteSpaces(String input){
        StringBuilder output = new StringBuilder();

        char[] charArray = input.toCharArray();
        for(char c:charArray){
            if (!Character.isWhitespace(c))
            {
                output.append(c);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        String ak ="Hello World     Aplha Omega";
        System.out.println(removeWhiteSpaces(ak));
    }
}
