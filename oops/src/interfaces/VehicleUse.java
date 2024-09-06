package interfaces;

public class VehicleUse {
public static void main(String[] args) {
	Vehicle v;
	v=new Car();
	v=new Bicycle();
	System.out.println(v.isMotorized());
}
}
