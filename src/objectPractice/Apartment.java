package objectPractice;

public class Apartment extends Property {
	private String floor;

	Apartment(String name, String owner, String type, String price, String floor) {

		super(name, owner, type, price, floor);
		this.floor = floor;
	}

	public String floor() {
		return this.floor;
	}

	public void floor(String floor) {
		this.floor = floor;
	}

	public void information() {
		super.information();
		System.out.println("間取り：" + this.floor);
	}

}
