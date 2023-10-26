package java8;

public class Palindrome {
    public static boolean isCheckPalindrome(int n){

        StringBuilder st = new StringBuilder(Integer.toString(n));
        st.reverse();
        String s =  st.toString();
        int o = Integer.parseInt(s);

        if(o==n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean is = isCheckPalindrome(121);
        System.out.println(is);
    }
}
