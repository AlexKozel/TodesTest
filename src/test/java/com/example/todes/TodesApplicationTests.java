package com.example.todes;

import com.example.todes.dao.EmployeeDao;
import com.example.todes.dao.QueryBuilder;
import com.example.todes.entity.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
class TodesApplicationTests {

	@Autowired
	EmployeeDao dao;

	@Autowired
	QueryBuilder.Builder builder;

	@Test
	void contextLoads() {
	}

	@Test
	public void DAOTest(){
		List list = dao.findById("1");
		System.out.println(list);
		System.out.println(dao.findAnother());
	}

	@Test
	public void anotherTest(){
		List list = dao.findAnother();
		System.out.println(list);
	}

	@Test
	public void ParamNameTest(){
		List list=  builder
				.with("first_name", "Марина")
				.with("last_name", "Морская")
				.with("patronymic","Васильевна")
				.find();
		Employee employee = (Employee) list.get(0);
		assertEquals(employee.getFirstName(), "Марина");
		assertEquals(employee.getLastName(), "Морская");
		assertEquals(employee.getPatronymic(), "Васильевна");
	}

	@Test
	public void ParamNameWithGenderTest() {
		List list=  builder
				.with("last_name", "%ов")
				.with("gender","male")
				.find();

	}
}
