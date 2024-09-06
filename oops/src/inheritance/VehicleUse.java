package inheritance;

public class VehicleUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vehicle v;
		v=new Car();
		Car c=new Car();
		c.setColor("red");
		c.setSpeed(100);
		c.setNumdoors(5);
		v.print();
		c.print();  
	 
	
	}

}
