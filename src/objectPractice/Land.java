package objectPractice;

public class Land extends Property {
	private String floor;

	Land(String name, String owner, String type, String price, String floor) {

		super(name, owner, type, price, floor);
		this.floor = floor;
	}

	public void greeting() {
		super.greeting();
		System.out.println("広さ：" + this.floor);
	}
}
