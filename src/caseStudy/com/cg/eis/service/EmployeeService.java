package caseStudy.com.cg.eis.service;

import caseStudy.com.cg.eis.bean.Employee;

import java.util.Map;

public interface EmployeeService {

    public String medicalInsurance(int salary, String designation) throws InvalidInputException;

    public Map<Integer, Employee> deleteEmployee(Map<Integer, Employee> map, int id);

    public Employee createEmployee();
}
