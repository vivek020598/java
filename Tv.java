class Tv{
static boolean isTurnedOn;
		static int maxVolume = 100;
		static int minVolume;
		static int presentVolume;
public static boolean onOrOff(){
System.out.println("inside turned on or off");
if(isTurnedOn == false){
isTurnedOn = true;
System.out.println("is TV turned on :" + isTurnedOn);
}
else if(isTurnedOn == true){
isTurnedOn = false;
System.out.println("is Tv turned on :" + isTurnedOn);
}
return isTurnedOn;
}
public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
	if(isTurnedOn == true){
		if(presentVolume < maxVolume){
			presentVolume = presentVolume + 1;
			System.out.println("the present volume is :" +presentVolume);
		}
		else{
			System.out.println("max volume reached");
		}
	}
		else{
			System.out.println("on maado speaker na");
		}
		System.out.println("end of increaseVolume()");
		return;
	}
	
	public static void decreaseVolume(){
	System.out.println("inside decreaseVolume()");
	if(isTurnedOn == true){
		if(presentVolume > minVolume){
			presentVolume = presentVolume - 1;
			System.out.println("the present volume is :" +presentVolume);
		}
		else{
			System.out.println("min volume reached");
		}
	}
		else{
			System.out.println("on maado speaker na");
		}
		System.out.println("end of decreaseVolume()");
		return;
	}

}