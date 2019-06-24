package themePark.shops;

import themePark.enums.AgeLimit;

public class Saloon extends DrinkStand {

	private AgeLimit limit = AgeLimit.ADULT;

	/**
	 * Constructor
	 * 
	 * @param name     - The name of the saloon
	 * @param ageLimit - The minimum age to enter the saloon
	 */
	public Saloon(String name, AgeLimit ageLimit) {
		this.setName(name);
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
	public void sell() {
		// TODO Auto-generated method stub
		
	}
}
