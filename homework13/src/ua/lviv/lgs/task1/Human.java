package ua.lviv.lgs.task1;

public class Human {
	protected int weight;
	protected int height;
	
	@Override
	public String toString() {
		return "Human [weight=" + weight + ", height=" + height + "]";
	}
	public Human() {
		
	}
	public Human(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
}
