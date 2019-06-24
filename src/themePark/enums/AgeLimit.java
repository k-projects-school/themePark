package themePark.enums;

public enum AgeLimit {
	BABY(1), TODLER(3), KID(12), TEEN(16), ADULT(18);

	private int age;

	AgeLimit(int age) {
		this.age = age;
	}

	/**
	 * Get the age
	 * 
	 * @return - The age
	 */
	public int getAge() {
		return this.age;
	}

}
