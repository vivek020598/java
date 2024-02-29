class AcTester{
 public static void main(String voltas[]){
	 
	boolean isOnOrOff = Ac.onOrOff();
	System.out.println("finally is Ac turned on or not : " + isOnOrOff);
	Ac.decreaseTemp();
	Ac.increaseTemp();
	Ac.increaseTemp();
	Ac.increaseTemp();
	Ac.increaseTemp();
	Ac.decreaseTemp();
	
	
	boolean isOnOrOff1 = Ac.onOrOff();
	System.out.println("finally is Ac turned on or not : " + isOnOrOff1);
	
 }
}