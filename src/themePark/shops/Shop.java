package themePark.shops;

import themePark.interfaces.Sellable;

public abstract class Shop implements Sellable{
	private String name;

	/**
	 * Set the name
	 * 
	 * @param name - The name of the shop
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the name
	 *  
	 * @return - The name of the shop
	 */
	public String getName() {
		return this.name;
	}
}
