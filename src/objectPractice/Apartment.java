package objectPractice;

public class Apartment extends Property {
	private String floor;

	Apartment(String name, String owner, String type, String price, String floor) {

		super(name, owner, type, price, floor);
		this.floor = floor;
	}

	public void greeting() {
		super.greeting();
		System.out.println("間取り：" + this.floor);
	}

}
