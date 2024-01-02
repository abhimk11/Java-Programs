package Try;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Lambafunc {
    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer%2==0){
                    return true;
                }
                return false;
            }

        };

        List<Integer> lt = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(lt.stream().filter(predicate).count());

    }
}
