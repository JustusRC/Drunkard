package drunkard;

public class drunkard {

	public static void main(String[] args) {
	
		
		//Justus Contreras
		//P4.9
		//CS234
		
		
		//variable declaration
		int x = 0, y = 0;
		
		int upper = 3, lower = 0;
		
		int direction ;
		//Initial starting point
		System.out.println("Initial: "+"("+x+","+y+")");		
		
		//For loop for the drink man to keep moving for 100 moves
		for (int i = 1; i < 100; i ++)
		{		//formula for the man to go in random direction	
			direction = (int) (Math.random() * (upper - lower + 1));
           //switch that keeps going for 100 moves
			 switch (direction) {
			 case 0: x = x + 1; //right
			 	break;
			 case 1: x = x - 1; //left
			 	break;
		 		
			 case 2: y = y + 1;//up
			 	break;
		 		
			 case 4: y = y - 1;//down
		 		break;
			 }
		}
		//Ending ending point
		System.out.print("Ending: "+"("+x+","+y+")");		
		
		
		
		
		

	}

}
