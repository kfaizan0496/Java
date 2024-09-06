package inheritance;

public class Vehicle {
    private int maxSpeed;
    String color;

public Vehicle() {
	System.out.println("Vehicle Constructor");
}

public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color=color;}
	
	

public int getSpeed() {
	return maxSpeed;
}


public void setSpeed(int maxSpeed) {
	this.maxSpeed=maxSpeed;}
	


public void print() {
	System.out.println("maxSpeed :"+maxSpeed+"color :"+color);
}


}