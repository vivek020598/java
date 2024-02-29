class TvTester{
 public static void main(String sony[]){
	 
	boolean isTurnedOn = Tv.onOrOff();
	System.out.println("finally is Tv turned on : " + isTurnedOn);
	Tv.decreaseVolume();
	Tv.decreaseVolume();
	
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	Tv.increaseVolume();
	

	boolean isTurnedOn1 = Tv.onOrOff();
	System.out.println("finally is Tv turned on : " + isTurnedOn1);
	
 }
}