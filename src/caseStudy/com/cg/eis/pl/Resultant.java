package caseStudy.com.cg.eis.pl;

import caseStudy.com.cg.eis.bean.Employee;
import caseStudy.com.cg.eis.service.EmployeeService;
import caseStudy.com.cg.eis.service.EmployeeServiceImpl;
import caseStudy.com.cg.eis.service.InvalidInputException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Resultant {

    public static void main(String[] args) throws InvalidInputException {

        EmployeeService service = new EmployeeServiceImpl();

        Map<Integer, Employee> map = new HashMap<>();

        System.out.println("HELLO,WELCOME TO EMPLOYEE SYSTEM: ");
        System.out.println("Enter The Employee Details: ");
        System.out.println("Enter Number of Employees to be added: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n <= 0) {
            throw new InvalidInputException("Number of Employees to be added can't be 0 or less");
        }

        for (int i = 0; i < n; i++) {
            Employee employee1 = service.createEmployee();
            String medicalScheme = service.medicalInsurance(employee1.getSalary(), employee1.getDesignation());
            employee1.setInsuranceScheme(medicalScheme);
            map.put(employee1.getId(), employee1);
        }

        System.out.println("The Employee Are: ");

        for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
            System.out.println("The Employee ID: " + entry.getKey() + ", The Employee DATA: " + entry.getValue());
        }

        System.out.println("Do you want to Remove Employees? (Y/N)");
        String s = sc.next();
        if (s.equals("Y")) {
            System.out.println("Enter The Employee ID: ");
            int k = sc.nextInt();
            map = service.deleteEmployee(map, k);
        }

        if (map.isEmpty()) {
            System.out.println("NO EMPLOYEES!!!!");
        } else {
            //remove customer
            for (Map.Entry<Integer, Employee> entry : map.entrySet()) {
                System.out.println("The Employee ID: " + entry.getKey() + ", The Employee DATA: " + entry.getValue());
            }
        }
    }
}
