package nextArray;

import java.util.Arrays;

public class IntSortReverse {

    static int[] getSorted(int[] ar) {

        Arrays.sort(ar);
        for (int i = 0; i < ar.length; i++) {
            String a = Integer.toString(ar[i]);
            StringBuilder stringBuilder = new StringBuilder(a);
            stringBuilder.reverse();
            //String b = stringBuilder.toString();
            //System.out.println(b);
            ar[i] = Integer.parseInt(stringBuilder.toString());
        }
        return ar;
    }

    public static void main(String[] args) {

        int[] ar = {12, 132, 1234, 54, 94, 677, 34};
        int[] ag = getSorted(ar);
        for (int i = 0; i < ag.length; i++) {
            System.out.println(ag[i]);
        }
    }
}
