package service;

import java.io.IOException;

import bean.Employee;

public interface EmployeeService {
	public void addEmployee();
	public void updateEmployee() throws NumberFormatException,IOException;
	public void deleteEmployee()  throws NumberFormatException,IOException;
	public void findAllEmployee();

}
