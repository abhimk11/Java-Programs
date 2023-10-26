package nextException;

import java.util.Optional;

public class TrailExp {
    Integer AgeInt(Optional<Integer> a){
        try {
            if (a.isPresent()) {
                System.out.println("s1");
                //return 1;
            }
            if (a.isEmpty()){
                System.out.println("s2");
                //return 2;
            }
    }
    catch (Exception e){
        System.out.println("Hello");
       e.printStackTrace();
    }
     return 1000;
    }


    public static void main(String[] args) {

        TrailExp age1 = new TrailExp();
        //if we use optional.of(null) we will get null pointer exception.
        //To take input as null we need to use .of nullable instead of.
        Optional<Integer> ak = Optional.ofNullable(null);
        System.out.println(age1.AgeInt(ak));
    }
}
