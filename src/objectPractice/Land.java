package objectPractice;

public class Land extends Property {
	private String size;

	Land(String name, String owner, String type, String price, String size) {

		super(name, owner, type, price, size);
		this.size = size;
	}

	public void information() {
		super.information();
		System.out.println("広さ：" + this.size);
	}
}
