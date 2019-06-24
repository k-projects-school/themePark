package themePark.app;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import themePark.attractions.Attraction;
import themePark.enums.AgeLimit;
import themePark.persons.Person;
import themePark.shops.Shop;
import themePark.utilities.RandomString;
import themePark.utilities.Utility;

public class ThemePark {
	private Attraction[] attractions = new Attraction[0];
	private Shop[] shops = new Shop[0];
	private Person[] customers = new Person[0];
	private String name;

	public final static int OPEN_AT = 9, CLOSED_AT = 22;
	public final static GregorianCalendar OPEN = new GregorianCalendar();
	public final static GregorianCalendar CLOSED = new GregorianCalendar();

	/**
	 * Constructor
	 * 
	 * @param name - The name of the theme park
	 */
	public ThemePark(String name) {
		this.setName(name);
		OPEN.set(Calendar.HOUR_OF_DAY, OPEN_AT);
		CLOSED.set(Calendar.HOUR_OF_DAY, CLOSED_AT);
	}

	/**
	 * @return the attractions
	 */
	public Attraction[] getAttractions() {
		return attractions;
	}

	/**
	 * @param attractions the attractions to set
	 */
	public void setAttractions(Attraction[] attractions) {
		this.attractions = attractions;
	}

	/**
	 * @return the shops
	 */
	public Shop[] getShops() {
		return shops;
	}

	/**
	 * @param shops the shops to set
	 */
	public void setShops(Shop[] shops) {
		this.shops = shops;
	}

	/**
	 * @return the customers
	 */
	public Person[] getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(Person[] customers) {
		this.customers = customers;
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
	 * Add an attraction
	 * 
	 * @param attraction - The attraction to add
	 */
	public void addAttraction(Attraction attraction) {
		this.attractions = Arrays.copyOf(this.attractions, this.attractions.length + 1);
		this.attractions[this.attractions.length - 1] = attraction;
	}

	/**
	 * Add a shop
	 * 
	 * @param shop - The shop to add
	 */
	public void addShop(Shop shop) {
		this.shops = Arrays.copyOf(this.shops, this.shops.length + 1);
		this.shops[this.shops.length - 1] = shop;
	}

	/**
	 * Add multiple attractions
	 * 
	 * @param attractions - The attractions to add
	 */
	public void addAttractions(Attraction... attractions) {
		for (Attraction attraction : attractions) {
			this.addAttraction(attraction);
		}
	}

	/**
	 * Get the total capacity of the theme park
	 * 
	 * @return - The total capacity
	 */
	private int getTotalCapacity() {
		int total = 0;
		for (Attraction attraction : this.attractions) {
			total += attraction.getCapacity();
		}

		return total;
	}

	/**
	 * Print the total capacity of the theme park
	 */
	public void printTotalCapacity() {
		System.out.println("Total attraction capacity for \"" + this.getName() + "\" is: " + this.getTotalCapacity()
				+ " persons.");
	}

	/**
	 * Add multiple shops
	 * 
	 * @param shops - The shops to add
	 */
	public void addShops(Shop... shops) {
		for (Shop shop : shops) {
			this.addShop(shop);
		}
	}

	public void day() {
		GregorianCalendar now = new GregorianCalendar();

		if (now.equals(OPEN) || (now.after(OPEN) && now.before(CLOSED))) {
			for (int i = 0; i < this.getTotalCapacity(); i++) {
				Person person = new Person(RandomString.random(), AgeLimit.values()[new Random().nextInt(4) + 1]);
				this.addCustomer(person);
			}
			
			for (Attraction attraction : this.attractions) {
				for (Person person: this.customers) {
					while (attraction.riders.length < attraction.getCapacity()) {
						if (person.getAge() >= attraction.getLimit().getAge()) {
							attraction.addRider(person);
						}
					}
				}
			}
			
			for (Attraction attraction : this.attractions) {
				attraction.ride();
				Utility.printDivider();
			}
		} else {
			System.out.println("The theme park is currently closed.");
		}
	}

	/**
	 * Add a customer
	 * 
	 * @param customer - The customer to add
	 */
	private void addCustomer(Person customer) {
		this.customers = Arrays.copyOf(this.customers, this.customers.length + 1);
		this.customers[this.customers.length - 1] = customer;
	}
}
