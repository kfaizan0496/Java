package inheritance;

public class Car extends Vehicle {
int numDoor;

  
public Car() {
	System.out.println("Cars Constructor");
}

public void setNumdoors(int numDoor) {
	this.numDoor=numDoor;}
	


public int getNumDoors() {
	return numDoor;
}


public void print() {
	System.out.println("maxSpeed:"+" "+getSpeed()+" "+"color:"+" "+color+" numDoor:"+" "+numDoor);
}

	

}
