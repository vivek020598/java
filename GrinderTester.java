class GrinderTester{
 public static void main(String preethi[]){
	 
	boolean isConnected = Grinder.onOrOff();
	System.out.println("finally is grinder turned on : " + isConnected);
	
	boolean isConnected1 = Grinder.onOrOff();
	System.out.println("finally is grinder turned on : " + isConnected1);
	
 }
}