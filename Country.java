class Country{
public static void main(String india[]){
String states[] = {"Karnataka", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jharkhand", "Andhra Pradesh", "Kerala", "Madhya Pradesh", "Maharashtra", "Manipur"};
String cities[] = {"Mumbai", "Delhi", "Bangalore", "Hyderabad", "Chennai", "Kolkata", "Ahmedabad", "Pune", "Jaipur", "Lucknow", "Kanpur", "Nagpur", "Patna", "Indore", "Thane", "Bhopal", "Visakhapatnam", "Agra", "Coimbatore", "Vadodara"};

	//increment
	System.out.println("States are");
	for(int index = 0; index < states.length; index++){
	System.out.println(states[index]);
	}
	
	
	//decrement
	System.out.println("States are");
	for(int index = states.length-1 ; index >= 0; index--){
	System.out.println(states[index]);
	}
	
	
	//increment
	System.out.println("Cities  are");
	for(int index = cities.length-1 ; index >= 0; index--){
	System.out.println(cities[index]);
	}
	
	//decrement
	System.out.println("cities are");
	for(int index = cities.length-1; index >= 0; index--){
	System.out.println(cities[index]);
	}
	
}
}




