package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;
import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		System.out.println("===TEST 1: department findById =====");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n===TEST 2: department findById =====");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 4: seller insert =====");
		Department department = new Department(null, "Fashion");
		departmentDao.insert(department);
		System.out.println("Inserted! New id = " + department.getId());
		
		
	}

}
