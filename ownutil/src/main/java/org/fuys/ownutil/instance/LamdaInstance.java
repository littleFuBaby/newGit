package org.fuys.ownutil.instance;

interface Lamp {
	void turnOn();
}
interface Sheep extends Lamp {
	void turnOff();
}

public class LamdaInstance {

	public static void main(String[] args) {
		// original method
		lightOn(new Sheep() {
			@Override
			public void turnOn() {
				System.out.println("The sheep light on");
			}
			@Override
			public void turnOff() {
				System.out.println("The sheep light off");
			}
		});
		// lamda method
		lightOn(() -> System.out.println("The lamp light off"));
	}
	public static void lightOn(Lamp lamp){
		lamp.turnOn();
	}
}
