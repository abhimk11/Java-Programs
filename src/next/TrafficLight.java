package next;

import java.util.Scanner;

public class TrafficLight {

    public static void main(String[] args) {

        System.out.println("Enter The Correct Order!!!");
        boolean done = false;

        while (!done) {

            Scanner myObj = new Scanner(System.in);
            String trafficLight = myObj.nextLine();

            switch (trafficLight) {
                case "RED":
                    System.out.println("STOP!!!");
                    done = true;
                    break;

                case "YELLOW":
                    System.out.println("READY!!!");
                    done = true;
                    break;

                case "GREEN":
                    System.out.println("GO!!!");
                    done = true;
                    break;

                default:
                    System.out.println("Wrong Input try Again!!!");
            }
        }

    }
}
