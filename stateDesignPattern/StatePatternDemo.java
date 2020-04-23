package stateDesignPattern;

import java.util.Scanner;

public class StatePatternDemo {
	public static Context context = new Context();

	public static void main(String[] args) {		
		Scanner userInput = new Scanner(System.in);

        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Welcome to Lunar Rover State Simulator.");
            System.out.println("List of acronyms for each action: \n RP - Right pedal press \n RP5 - Right pedal press 5 for seconds \n RPT - Right pedal press twice");
            System.out.print(" LP - Left pedal press \n LP5 - Left pedal press 5 for seconds \n LPT - Left pedal press twice \n NP - No Press \n");

    		Idle idle = new Idle();
    		idle.doAction(context);
    		System.out.println(context.getState().toString());
            
            System.out.print("Where to move? $ ");
            String newInput = userInput.nextLine();
            
            if (newInput.equalsIgnoreCase("LP5")){
            	BackwardAcceleration backwardAcceleration = new BackwardAcceleration();
            	backwardAcceleration.doAction(context);
            	System.out.println(context.getState().toString());
            	backwardsAcceleration();
            } else if (newInput.equalsIgnoreCase("RP")) {
            	ForwardAcceleration forwardAcceleration = new ForwardAcceleration();
            	forwardAcceleration.doAction(context);
            	System.out.println(context.getState().toString());
                forwardAcceleration();
            } else if (newInput.equalsIgnoreCase("Terminate")){
                System.exit(0);
            }
            
            System.out.println();
        }
	}
	
	public static boolean backwardsAcceleration(){
        // isValid will maintain the same state in case of incorrect input
        boolean isValid = false;
        Scanner userInput = new Scanner(System.in);
        while(!isValid){
            System.out.print("Where to move? $ ");
            String newInput = userInput.nextLine(); 
            if(newInput.equalsIgnoreCase("RPT")){
                Deaccelerate deaccelerate = new Deaccelerate();
                deaccelerate.doAction(context);;
                System.out.println(context.getState().toString());
                //isValid set to true. Loop will terminate
                isValid = true;
            }else{
                //isValid set to false. Loop will continue
                System.out.println("Please input a correct instruction");
                return isValid;
            }
        }
        return isValid;
	}
	
	public static boolean forwardAcceleration(){
        // isValid will maintain the same state in case of incorrect input
        boolean isValid = false;
        Scanner userInput = new Scanner(System.in);
        while(!isValid){
        	System.out.print("Where to move? $ ");
            String newInput = userInput.nextLine();
            if (newInput.equalsIgnoreCase("RP5")) {
                //Constant Forward Acceleration State
            	ForwardSpeed forwardSpeed = new ForwardSpeed();
            	forwardSpeed.doAction(context);;
                System.out.println(context.getState().toString());
                forwardSpeed();
                //isValid set to true. Loop will terminate
                isValid = true;
            } else if(newInput.equalsIgnoreCase("LP")) {
            	Idle idle = new Idle();
            	idle.doAction(context);;
                System.out.println(context.getState().toString());
                //isValid set to true. Loop will terminate
                isValid = true;
            } else if(newInput.equalsIgnoreCase("RPT")) {
            	Deaccelerate deaccelerate = new Deaccelerate();
            	deaccelerate.doAction(context);;
                System.out.println(context.getState().toString());
                deaccelerate();
                //isValid set to true. Loop will terminate
                isValid = true;
            } else {
                System.out.println("Please input a correct instruction.");
                //isValid set to false. Loop will continue
                return isValid;
            }
		}
        return isValid;
	}
	
	public static boolean forwardSpeed(){
        // isValid will maintain the same state in case of incorrect input
        boolean isValid = false;
        Scanner userInput = new Scanner(System.in);
        while(!isValid){
            System.out.print("Where to move? $ ");
            String newInput = userInput.nextLine();
            if(newInput.equalsIgnoreCase("RPT")){
            	Deaccelerate deaccelerate = new Deaccelerate();
            	deaccelerate.doAction(context);;
                System.out.println(context.getState().toString());
                deaccelerate();
                //isValid set to true. Loop will terminate
                isValid = true;
            }else{
                System.out.println("Please input a correct instruction.");
                //isValid set to false. Loop will continue
                return isValid;
            }
        }
        return isValid;
    }
	
	public static boolean deaccelerate(){
        //isValid will maintain the same state in case of incorrect input
        boolean isValid = false;
        Scanner userInput = new Scanner(System.in);
        System.out.println("You are in deaccelerating");
        while(!isValid){
            System.out.print("Where to move? $ ");
            String newInput = userInput.nextLine();
            if (newInput.equalsIgnoreCase("RP")) {
            	ForwardAcceleration forwardAcceleration = new ForwardAcceleration();
            	forwardAcceleration.doAction(context);
            	System.out.println(context.getState().toString());
                forwardAcceleration();
                //isValid set to true. Loop will terminate
                isValid = true;
            } else if(newInput.equalsIgnoreCase("NP")) {
            	Idle idle = new Idle();
        		idle.doAction(context);
        		System.out.println(context.getState().toString());
                //isValid set to true. Loop will terminate
                isValid = true;
            } else {
                System.out.println("Please input a correct instruction.");
                //isValid set to false. Loop will continue
                return isValid;
            }
        }
        return isValid;
    }
}
