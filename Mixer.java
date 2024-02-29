class Mixer{
static boolean isConnected;
		static int maxSpeed = 4;
		static int minSpeed;
		static int presentSpeed;
public static boolean onOrOff(){
System.out.println("inside on or off");
if(isConnected == false){
isConnected = true;
System.out.println("is mixer connected :" + isConnected);
}
else if(isConnected == true){
isConnected = false;
System.out.println("is mixer connected :" + isConnected);
}
return isConnected;
}

public static void increaseSpeed(){
	System.out.println("inside increaseSpeed()");
	if(isConnected == true){
		if(presentSpeed < maxSpeed){
			presentSpeed = presentSpeed + 1;
			System.out.println("the present Speed is :" +presentSpeed);
		}
		else{
			System.out.println("max Speed reached");
		}
	}
		else{
			System.out.println("on maado mixer na");
		}
		System.out.println("end of increaseSpeed()");
		return;
	}
	public static void decreaseSpeed(){
	System.out.println("inside decreaseSpeed()");
	if(isConnected == true){
		if(presentSpeed > minSpeed){
			presentSpeed = presentSpeed - 1;
			System.out.println("the present Speed is :" +presentSpeed);
		}
		else{
			System.out.println("min Speed reached");
		}
	}
		else{
			System.out.println("on maado mixer na");
		}
		System.out.println("end of decreaseSpeed()");
		return;
	}

}