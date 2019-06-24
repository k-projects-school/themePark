package themePark.attractions;

import java.util.Arrays;

import themePark.enums.AgeLimit;
import themePark.interfaces.Rideable;
import themePark.persons.Person;

public abstract class Attraction implements Rideable {
	public String name;
	private int capacity;
	public Person[] riders = new Person[0];
	private AgeLimit limit;

	Attraction(String name, int capacity) {
		this.setName(name);
		this.setCapacity(capacity);
	}

	/**
	 * Set the name
	 * 
	 * @param name - The name of the attraction
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the name
	 * 
	 * @return - The name of the attraction
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Get the riders
	 * 
	 * @return - The riders of the attraction
	 */
	public Person[] getRiders() {
		return this.riders;
	}

	/**
	 * Get the age limit
	 * 
	 * @return - The age limit
	 */
	public AgeLimit getLimit() {
		return this.limit;
	}

	/**
	 * Add a rider
	 * 
	 * @param rider - The rider to add
	 */
	public void addRider(Person rider) {
		this.riders = Arrays.copyOf(this.riders, this.riders.length + 1);
		this.riders[this.riders.length - 1] = rider;
	}
}
