package com.example.demo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


//@Accessors(chain = true)
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "person_gangs")
public class Person3 {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private int age;
	
	@Column(name = "address")
	private String address;

	@Column(name = "fastname")
	private String fastname;

	@Column(name = "lastname")
	private String lastname;
	
	public Person3 (String _name, int _age, String _address) {
		this.name = _name;
		this.age = _age;
		this.address = _address;
	}
	
	public Person3 (String _fastname,String _lastname, int _age, String _address) {
		this.fastname = _fastname;
		this.lastname = _lastname;
		this.age = _age;
		this.address = _address;
	}
	
	/*
	 * コンストラクタもはしょれる
	 */
//	public Person2(String name, int age, String address) {
//		super();
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}
	
	
	
	/*
	 * ゲッターやセッターは、「ボイラープレートコード」（あんまり書きたくない無駄なコード）らしいよ
	 */

//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	
}
