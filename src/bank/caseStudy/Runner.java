package bank.caseStudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        Random random = new Random();
        Account smith = new CurrentAcc();
        Person person1 = new Person();
        person1.setName("Smith");
        person1.setAge(30);
        smith.setAccNum(random.nextLong(1000,2000));
        smith.setBalance(2000);
        smith.setAccHolder(person1);

        Account kathy = new SavingsAcc();
        Person person2 = new Person();
        person2.setName("Kathy");
        person2.setAge(25);
        kathy.setAccNum(random.nextLong(1000,2000));
        kathy.setBalance(3000);
        kathy.setAccHolder(person2);

        System.out.println("Initial Balance:");
        System.out.println(smith);
        System.out.println(kathy);

        System.out.println("\n Updated Balance:");
        System.out.println("Operations on Smith Account:");
        //deposit 2000 to Smith account
        smith.deposit(2000);
        smith.withdraw(2500);
        System.out.println(smith);

        //withdraw 2000 from Kathy account
        System.out.println("Operations on Kathy Account:");
        kathy.withdraw(2000);
        //kathy.withdraw(3000);
        System.out.println(kathy);



    }
}
