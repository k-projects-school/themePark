package themePark.attractions;

import themePark.enums.AgeLimit;

public class RollerCoaster extends Attraction {

	private AgeLimit limit = AgeLimit.TEEN;
	private String rideTxt;

	/**
	 * Constructor
	 * 
	 * @param name     - The name of the attraction
	 * @param capacity - The capacity of the attraction
	 * @param ageLimit - The minimum age to ride the attraction
	 */
	public RollerCoaster(String name, int capacity, AgeLimit ageLimit, String rideTxt) {
		super(name, capacity);
		this.setLimit(ageLimit);
		this.rideTxt = rideTxt;
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
		System.out.println(this.rideTxt);
	}
}
