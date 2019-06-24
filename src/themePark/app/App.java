package themePark.app;

import themePark.attractions.HauntedHouse;
import themePark.attractions.RollerCoaster;
import themePark.attractions.TeaCups;
import themePark.enums.AgeLimit;
import themePark.persons.Person;
import themePark.shops.IceCreamShop;
import themePark.shops.PopcornStand;
import themePark.shops.Saloon;
import themePark.shops.SodaStand;
import themePark.shops.ToyShop;

public class App {

	public static void main(String[] args) {
		// Create the theme park
		ThemePark park = new ThemePark("The Great Theme");

		// Add the attractions to the theme park
		park.addAttractions(new RollerCoaster("Dragon Kahn", 80, AgeLimit.TEEN, "Making 4 loops and one barrelScrew"),
				new RollerCoaster("Wooden Thunder", 60, AgeLimit.KID, "Going so fast the nails fly out"),
				new RollerCoaster("Jolly JungleSling", 50, AgeLimit.KID, "Feeling like a real tarzan"),
				new HauntedHouse("Temple Del Fuego", 100, AgeLimit.KID),
				new TeaCups("Gaston Spin", 35, AgeLimit.TODLER));

		// Print the total capacity
		park.printTotalCapacity();

		// Add the shops to the theme park
		park.addShops(new IceCreamShop("Panache", 300, 500), new IceCreamShop("De Post", 1000, 2000),
				new PopcornStand("De Popper"), new SodaStand("De Drankfontein"), new Saloon("De Ranch", AgeLimit.ADULT),
				new ToyShop("De Playground"));
		
		park.day();
	}
}
