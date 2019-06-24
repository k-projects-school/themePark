package themePark.shops;

public class IceCreamShop extends FoodStand {
	private int cones = 0, scoops = 0;

	/**
	 * Constructor
	 * 
	 * @param name   - The name of the ice cream shop
	 * @param cones  - The amount of cones available in the ice cream shop
	 * @param scoops - The amount of scoops available in the ice cream shop
	 */
	public IceCreamShop(String name, int cones, int scoops) {
		this.setName(name);
		this.setCones(cones);
		this.setScoops(scoops);
	}

	/**
	 * @return the cones
	 */
	public int getCones() {
		return cones;
	}

	/**
	 * @param cones the cones to set
	 */
	public void setCones(int cones) {
		this.cones = cones;
	}

	/**
	 * @return the scoops
	 */
	public int getIceCreamBalls() {
		return scoops;
	}

	/**
	 * @param scoops the scoops to set
	 */
	public void setScoops(int scoops) {
		this.scoops = scoops;
	}

	public void makeIceCream(int balls) {

	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}
}
