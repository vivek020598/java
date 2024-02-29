class Airpods{
static boolean isConnected;
		static int maxVolume = 25;
		static int minVolume;
		static int presentVolume;
public static boolean onOrOff(){
System.out.println("inside on or off");
if(isConnected == false){
isConnected = true;
System.out.println("is Airpods connected :" + isConnected);
}
else if(isConnected == true){
isConnected = false;
System.out.println("is Airpods connected :" + isConnected);
}
return isConnected;
}
public static void increaseVolume(){
	System.out.println("inside increaseVolume()");
	if(isConnected == true){
		if(presentVolume < maxVolume){
			presentVolume = presentVolume + 1;
			System.out.println("the present volume is :" +presentVolume);
		}
		else{
			System.out.println("max volume reached");
		}
	}
		else{
			System.out.println("on maado airpods na");
		}
		System.out.println("end of increaseVolume()");
		return;
	}
	public static void decreaseVolume(){
	System.out.println("inside decreaseVolume()");
	if(isConnected == true){
		if(presentVolume > minVolume){
			presentVolume = presentVolume - 1;
			System.out.println("the present volume is :" +presentVolume);
		}
		else{
			System.out.println("min volume reached");
		}
	}
		else{
			System.out.println("on maado airpods na");
		}
		System.out.println("end of decreaseVolume()");
		return;
	}
}