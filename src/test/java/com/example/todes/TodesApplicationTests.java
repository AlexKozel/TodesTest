package com.example.todes;

import com.example.todes.dao.EmployeeDao;
import com.example.todes.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TodesApplicationTests {

	@Autowired
	EmployeeDao dao;

	@Test
	void contextLoads() {
	}

	@Test
	public void DAOTest(){
		Employee employee = dao.findById("1");
		System.out.println(employee);
		System.out.println(dao.findAnother());
	}

	@Test
	public void anotherTest(){
		Employee e = dao.findAnother();
		System.out.println(e);
	}

}
