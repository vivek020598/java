class MicrowaveTester{
 public static void main(String lg[]){
	 
	boolean isConnected = Microwave.onOrOff();
	System.out.println("finally is is microwave connected : " + isConnected);
	
	Microwave.increaseTimer();
	Microwave.increaseTimer();
	Microwave.increaseTimer();
	
	Microwave.decreaseTimer();
	Microwave.decreaseTimer();
	
	boolean isConnected1 = Microwave.onOrOff();
	System.out.println("finally is is microwave connected : " + isConnected1);
	
 }
}