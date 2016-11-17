import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class weightofperson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		
		double userweight;
		String userPlanet = ""; 
	    
		
		do{
			
			System.out.print("\nWhat is your weight? ");
	    	userweight = userInput.nextDouble();
	    			
	    	 
	    	if(userweight < 1){
	    		System.out.print("Please enter real weight! ");
	    	}	  
		    
	    	
		} while(userweight < 1);
	    	  
	    System.out.print("what planet?");
	    userPlanet = userInput.next();
	    	  
	    if(userPlanet.equalsIgnoreCase("mercury")){
	    	System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.38);
	    	
	    	
	    }	
	    if(userPlanet.equalsIgnoreCase("venus")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.91);
		    
	    }    
		if(userPlanet.equalsIgnoreCase("earth")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 1);
		    
		}   
		if(userPlanet.equalsIgnoreCase("moon")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.165);
		    
		}   
		if(userPlanet.equalsIgnoreCase("mars")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.38);
		}  
		if(userPlanet.equalsIgnoreCase("jupiter")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 2.34);
		    
		}  
		if(userPlanet.equalsIgnoreCase("saturn")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 1.06);
		   
		} 
		if(userPlanet.equalsIgnoreCase("uranus")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.92);
		    
		}
		if(userPlanet.equalsIgnoreCase("neptune")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 1.19);
		    
		} 
		if(userPlanet.equalsIgnoreCase("pluto")){
		    System.out.print("Your weight on " + userPlanet + " is: " + userweight * 0.06);
		    
		}
	    
		userInput.close();

	}

}
