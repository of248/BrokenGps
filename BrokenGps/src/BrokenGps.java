//this program is a broken gps that randomly chooses a direction (N,S,E,W) every 5 minutes for 1 hour.
//the program calculates the total distance traveled starting form (0,0) to the final coordinates of the car.
//calculates the distance using a method that utilizes the distance formula. 

import java.util.Random; 

public class BrokenGps {
	
	
public static double distance(double x, double y){ //Finding the distance using the distance formula
		
		
		double distance;
		distance=Math.sqrt(x*x+y*y);
		return distance;
			
	}

	
	
public static void main(String[] args) 
{    
	
	double y = 0;
	double x = 0;

	
	Random rand = new Random();       //picking a random number 12 times for the 60 minutes that the vehicle is driving.
	for (int j = 0; j<12; j++)     {       
		int pick = rand.nextInt(4);       //It picks an integer from 0 to 3
		
		if(pick == 0){
			System.out.println("Moved North");
		}
		else if(pick == 1){
			y= y+5;
			System.out.println("Moved South");
		}
		else if(pick == 2){
			y=y-5;
			System.out.println("Moved East");
		}
		else if(pick == 3){
			x=x+5;
			System.out.println("Moved West");
		}
			x=x-5;

}
	System.out.println("The total distance traveled is " + distance(x, y));
}
}