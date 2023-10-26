package caseStudy.com.cg.eis.service;

import caseStudy.com.cg.eis.bean.Employee;

import java.util.Map;

public interface EmployeeService {

    public String medicalInsurance(int salary, String designation) throws InvalidInputException;

    public Map<Integer, Object> deleteEmployee(Map<Integer, Object> map, int id);

    public Employee createEmployee();
}
