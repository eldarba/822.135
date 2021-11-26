package d.objects;

import java.io.Serializable;

public class Cat implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private transient int weight;
	private String Color;

	public Cat() {
	}

	public Cat(int id, String name, int weight, String color) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		Color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + ", name=" + name + ", weight=" + weight + ", Color=" + Color + "]";
	}

}
