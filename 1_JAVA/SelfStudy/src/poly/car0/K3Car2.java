package poly.car0;

public class K3Car2 implements Car {

	@Override
	public void startEngine() {
		System.out.println("K3Car.startEngine");
		
	}

	@Override
	public void offEngine() {	System.out.println("K3Car.offEngine");
		
	}

	@Override
	public void pressAccelerator() {
		System.out.println("K3Car.pressAccelerator");
	}
	

}
