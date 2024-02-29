class SpeakerTester{
 public static void main(String jbl[]){
		

	boolean isConnected = Speaker.onOrOff();
	System.out.println("finally is speaker connected :" + isConnected);
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	Speaker.increaseVolume();
	
	Speaker.decreaseVolume();
	Speaker.decreaseVolume();
	
	boolean isConnected1 = Speaker.onOrOff();
	System.out.println("finally is speaker connected :" + isConnected1);
	
	
	
 }
}