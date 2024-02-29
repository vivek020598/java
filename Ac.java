class Ac{
static boolean isOnOrOff;
		static int maxTemp = 30;
		static int minTemp;
		static int presentTemp;
public static boolean onOrOff(){
System.out.println("inside on or off");
if(isOnOrOff == false){
isOnOrOff = true;
System.out.println("is Ac turned on or not :" + isOnOrOff);
}
else if(isOnOrOff == true){
isOnOrOff = false;
System.out.println("is Ac turned on or not :" + isOnOrOff);
}
return isOnOrOff;
}

public static void increaseTemp(){
	System.out.println("inside increaseTemp()");
	if(isOnOrOff == true){
		if(presentTemp < maxTemp){
			presentTemp = presentTemp + 1;
			System.out.println("the present Temperature is :" +presentTemp);
		}
		else{
			System.out.println("max Temperature reached");
		}
	}
		else{
			System.out.println("on maado AC na");
		}
		System.out.println("end of increaseTemp()");
		return;
	}
	
	public static void decreaseTemp(){
	System.out.println("inside decreaseTemp()");
	if(isOnOrOff == true){
		if(presentTemp < maxTemp){
			presentTemp = presentTemp - 1;
			System.out.println("the present Temperature is :" +presentTemp);
		}
		else{
			System.out.println("max Temperature reached");
		}
	}
		else{
			System.out.println("on maado AC na");
		}
		System.out.println("end of decreaseTemp()");
		return;
	}


}