package objectPractice;

public class Property {
	private String name;
	private String owner;
	private String type;
	private String price;

	Property(String name, String owner, String type, String price, String floor) {
		this.name = name;
		this.owner = owner;
		this.type = type;
		this.price = price;
	}

	public String name() {
		return this.name;
	}

	public String owner() {
		return this.owner;
	}

	public String type() {
		return this.type;
	}

	public String price() {
		return this.price;
	}

	public void name(String name) {
		this.name = name;
	}

	public void owner(String owner) {
		this.owner = owner;
	}

	public void type(String type) {
		this.type = type;
	}

	public void price(String price) {
		this.price = price;
	}

	public void information() {
		System.out.println("物件名：" + this.name);
		System.out.println("物件所有者名：" + this.owner);
		System.out.println("物件種別：" + this.type);
		System.out.println("物件価格：" + this.price);
	}
}
