package comparing;

import java.util.ArrayList;
import java.util.Collections;

public class Emp
        //implements Comparable<Emp>{
{
    int empId;
    String name;
    int phoneNo;

    public Emp(int empId, String name, int phoneNo) {
        this.empId = empId;
        this.name = name;
        this.phoneNo = phoneNo;
    }

    public static void main(String[] args) {
        ArrayList<Emp> emps = new ArrayList<>();
        emps.add(new Emp(102, "Durgesh", 94232));
        emps.add(new Emp(101, "Abhinandan", 9422));
        emps.add(new Emp(103, "Xavier", 94234));
        emps.add(new Emp(104, "AHI", 94234));

        //Using stream API
        //emps.stream().sorted(Comparator.comparing(e->e.name)).forEach(System.out::println);

        //System.out.println(emps);
        Collections.sort(emps, new IdComparator());
        Collections.sort(emps, new NameComparator());
        //comparable
        System.out.println(emps);

    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }

//    @Override
//    public int compareTo(Emp o) {
//        return this.empId-o.empId;
//    }
}
