class Microwave{
static boolean isConnected;
		static int maxTimer =60;
		static int minTimer;
		static int presentTimer;
public static boolean onOrOff(){
System.out.println("inside on or off");
if(isConnected == false){
isConnected = true;
System.out.println("is microwave connected :" + isConnected);
}
else if(isConnected == true){
isConnected = false;
System.out.println("is microwave connected :" + isConnected);
}
return isConnected;
}
public static void increaseTimer(){
	System.out.println("inside increaseTimer()");
	if(isConnected == true){
		if(presentTimer < maxTimer){
			presentTimer = presentTimer + 1;
			System.out.println("the present Timer is :" +presentTimer);
		}
		else{
			System.out.println("max Timer reached");
		}
	}
		else{
			System.out.println("on maado microwave oven  na");
		}
		System.out.println("end of increaseTimer()");
		return;
	}
	
	public static void decreaseTimer(){
	System.out.println("inside decreaseTimer()");
	if(isConnected == true){
		if(presentTimer > minTimer){
			presentTimer = presentTimer - 1;
			System.out.println("the present Timer is :" +presentTimer);
		}
		else{
			System.out.println("min Timer reached");
		}
	}
		else{
			System.out.println("on maado microwave oven na");
		}
		System.out.println("end of decreaseTimer()");
		return;
	}

}