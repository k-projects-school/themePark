package themePark.attractions;

import themePark.enums.AgeLimit;

public class HauntedHouse extends Attraction {

	private AgeLimit limit = AgeLimit.KID;

	/**
	 * Constructor
	 * 
	 * @param name     - The name of the attraction
	 * @param capacity - The capacity of the attraction
	 * @param ageLimit - The minimum age of the attraction
	 */
	public HauntedHouse(String name, int capacity, AgeLimit ageLimit) {
		super(name, capacity);
		this.setLimit(ageLimit);
	}

	/**
	 * @return the limit
	 */
	public AgeLimit getLimit() {
		return limit;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(AgeLimit limit) {
		this.limit = limit;
	}

	@Override
	public void ride() {
		System.out.println(this.getRiders().length + " are riding " + this.getName());
		System.out.println("The visitors are running scared");
	}
}
