package com.faikturan.spring;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.faikturan.spring.PersonDAO;
import com.faikturan.spring.Person;

public class SpringJDBCTest {

	public static void main(String[] args) throws SQLException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("24.spring.jdbc.xml");

		PersonDAO pService = ctx.getBean(PersonDAO.class);

		// create person object
		Person person1 = new Person(1, "Lvnt", "Erguder", 1989);

		// insert
		pService.insert(person1);

		// find
		pService.getPersonById(1);

		// update
		person1.setName("Levent");
		pService.update(person1);

		// delete
		pService.delete(1);

		Person person2 = new Person(2, "James", "Gosling", 1955);
		Person person3 = new Person(3, "Joshua", "Bloch", 1961);

		pService.insert(person2);
		pService.insert(person3);

		// getAllPersons
		pService.getAllPersons();

		// deleteAllPersons
		pService.deleteAllPersons();

		((ClassPathXmlApplicationContext) ctx).close();

	}
}
