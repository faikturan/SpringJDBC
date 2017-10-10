package com.faikturan.spring;

import java.util.List;

import com.faikturan.spring.Person;

public interface PersonDAO {

	public void insert(Person person);
	public Person getPersonById(int id);
	public List<Person> getAllPersons();
	public void update(Person person);
	public void delete(int id);
	public void deleteAllPersons();
}
