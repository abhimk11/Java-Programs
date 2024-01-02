package caseStudy.com.cg.eis.service;

import caseStudy.com.cg.eis.bean.Employee;

import java.util.Map;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public String medicalInsurance(int salary, String designation) throws InvalidInputException {

        if ((salary > 5000 && salary < 20000) && designation.equals("System Associate")) {
            return "Scheme C";
        } else if ((salary >= 20000 && salary < 40000) && designation.equals("Programmer")) {
            return "Scheme B";
        } else if (salary >= 40000 && designation.equals("Manager")) {
            return "Scheme A";
        } else if (salary < 5000 && designation.equals("Clerk")) {
            return "No Scheme";
        }
        throw new InvalidInputException("Invalid Input");
    }

    @Override
    public Map<Integer, Employee> deleteEmployee(Map<Integer, Employee> map, int id) {
        map.remove(id);
        return map;
    }

    @Override
    public Employee createEmployee() {
        System.out.println("Enter Try.Employee Details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Salary: ");
        int salary = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Designation: ");
        String Designation = sc.nextLine();

        Employee employee = new Employee(id, Name, salary, Designation);
        return employee;
    }


}

