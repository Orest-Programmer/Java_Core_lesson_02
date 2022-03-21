package ua.lviv.lgs.task2;

public class Car {
	
	int engineHorsePower;
	int productionYear;
	Wheel wheel;
	Engine engine;
	public Car(int engineHorsePower, int productionYear, Wheel wheel, Engine engine) {
		super();
		this.engineHorsePower = engineHorsePower;
		this.productionYear = productionYear;
		this.wheel = wheel;
		this.engine = engine;
	}
	public int getEngineHorsePower() {
		return engineHorsePower;
	}
	public int getProductionYear() {
		return productionYear;
	}
	public Wheel getWheel() {
		return wheel;
	}
	public Engine getEngine() {
		return engine;
	}
	@Override
	public String toString() {
		return "Car [engineHorsePower=" + engineHorsePower + ", productionYear=" + productionYear + ", wheel=" + wheel
				+ ", engine=" + engine + "]";
	}

	
	
	
}
