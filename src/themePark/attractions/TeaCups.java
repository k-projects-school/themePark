package themePark.attractions;

import themePark.enums.AgeLimit;

public class TeaCups extends Attraction {

	private AgeLimit limit = AgeLimit.TODLER;

	/**
	 * Constructor
	 * 
	 * @param name     - The name of the tea cups
	 * @param capacity - the capacity of the tea cups
	 * @param ageLimit - The minimum age to ride the tea cups
	 */
	public TeaCups(String name, int capacity, AgeLimit ageLimit) {
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
		System.out.println("The kids are having fun");
	}
}
