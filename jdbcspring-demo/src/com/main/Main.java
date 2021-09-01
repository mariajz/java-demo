package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.EmployeeDAO;
import com.to.Employee;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ap = new ClassPathXmlApplicationContext("com/to/beans.xml");
		EmployeeDAO dao = (EmployeeDAO) ap.getBean("edao");

		Employee e1 = new Employee();
		e1.setEid(106);
		e1.setEname("maria");
		e1.setAge(50);
		e1.setPassword("dfs");

		int count = dao.addEmployee(e1);
		System.out.println(count + "records added");

		/*
		 * List<Employee> list = dao.getAllEmployees(); for (Employee employee : list) {
		 * System.out.println(employee); }
		 */

		/*
		 * List<Employee> list = dao.getAllEmployeesOnAge(50); for (Employee employee :
		 * list) { System.out.println(employee); }
		 */
		/*
		 * Employee e1 = new Employee(); e1.setEid(104); e1.setEname("maria");
		 * e1.setAge(40); e1.setPassword("dfs"); dao.PerformMultiActions(e1);
		 */
	}

}
