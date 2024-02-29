class AirpodsTester{
 public static void main(String apple[]){
	 
	boolean isConnected = Airpods.onOrOff();
	System.out.println("finally is Airpods connected :" + isConnected);
	Airpods.increaseVolume();
	Airpods.increaseVolume();
	Airpods.increaseVolume();
	
	boolean isConnected1 = Airpods.onOrOff();
	System.out.println("finally is Airpods connected :" + isConnected1);
	
	Airpods.decreaseVolume();
	Airpods.decreaseVolume();

	
 }
}