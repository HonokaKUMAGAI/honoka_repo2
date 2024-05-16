package com.example.demo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GangsRepository extends JpaRepository<Person3, Integer> {
	List<Person3> findAll();
	List<Person3> findByAgeLessThan(int age);
	List<Person3> findByAgeGreaterThan(int age);
	List<Person3> findByAge(int age);
	List<Person3> findByAgeBetween(int age1, int age2);
	
	List<Person3> findByNameContaining(String name);
	
//	List<Person3> getPersonsUnderAge(int age);
//	List<Person3> getPersonsOverAge(int age);
	

}
