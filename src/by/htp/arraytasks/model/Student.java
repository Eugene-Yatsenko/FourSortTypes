package by.htp.arraytasks.model;

public class Student {
	
	String name;
	String surname;
	int age;
	int year;
	
	public Student() {
		
	}
	
	public Student(String name, String surname, int age, int year) {
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.year = year;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public int getYear () {
		return this.year;
	}
	
	public void setYear (int year) {
		this.year = year;
	}
}
