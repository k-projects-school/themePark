package themePark.persons;

import themePark.enums.AgeLimit;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, AgeLimit ageLimit) {
		this.setName(name);
		this.setAge(ageLimit.getAge());
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}
