import java.util.Arrays;
class Hotel{

		 static String name = "7season";
		 static String ownerName = "Rahulla and team";
		 static String address = "Vijay Nagar";
		 static String foodItems[] = {null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addFoodItems(String foodItem){
	System.out.println("inside addFoodItems():");
	boolean isAdded = false;
	if(foodItem != null){
		foodItems[index] = foodItem;
		index++;
		isAdded = true;
	System.out.println("food item added successfully");
	}
	else{
		System.out.println("items can't be null");
	}
	System.out.println("end of food items");
	return isAdded;
}
// fetch data
public static void getFoodItems(){
	for(int index = 0; index < foodItems.length; index++){
		System.out.println(foodItems[index]);
		
	}
}
public static boolean updateFoodItems(String newFoodItem, String oldFoodItem){
		
	boolean isUpdated = false;

	for(int index=0;index<foodItems.length;index++){
		if(foodItems[index] == oldFoodItem){
			foodItems[index] = newFoodItem;
			isUpdated = true;
		}
	}
	System.out.println("after updating the value");
	return isUpdated;
}


public static void deleteFoodItems(String foodItem){
	int newIndex, oldIndex;
	
	for( newIndex=0, oldIndex=0;oldIndex<foodItems.length; oldIndex++){
		if(foodItems[oldIndex] != foodItem){
			foodItems[newIndex++] = foodItems[oldIndex];
			
		}		
	}
	foodItems = Arrays.copyOf(foodItems, newIndex);
	return;	
	}
	
}




/*index = index +1;
index++;*/