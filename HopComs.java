import java.util.Arrays;
class HopComs{
		 static String ownerName = "Arun";
		 static String address = "Madiwala";
		 static String fruits[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addFruits(String fruit){
	System.out.println("inside addFruits():");
	boolean isAdded = false;
	if(fruit != null){
		fruits[index] = fruit;
		index++;
		isAdded = true;
	System.out.println("fruit added successfully");
	}
	else{
		System.out.println("fruits can't be null");
	}
	System.out.println("end of fruits");
	return isAdded;
}
// fetch data
public static void getFruits(){
	for(int index = 0; index < fruits.length; index++){
		System.out.println(fruits[index]);
		
	}
}

public static boolean updateFruits(String newFruit, String oldFruit){
	  System.out.println("update fruits");
	  boolean isUpdated = false ;
	  
	  for(int index=0 ; index<fruits.length ; index++){
		  
		  if(fruits[index]==oldFruit){
			 fruits[index] = newFruit;
			  isUpdated = true;
		  }
		  
	  }
	  System.out.println("fruits updates successfully");
		  return isUpdated;
      }
      
            public static void deleteFruits(String fruit){
	int newIndex, oldIndex;
	
	for( newIndex=0, oldIndex=0;oldIndex<fruits.length; oldIndex++){
		if(fruits[oldIndex] != fruit){
			fruits[newIndex++] = fruits[oldIndex];
			
		}		
	}
	fruits = Arrays.copyOf(fruits, newIndex);
	return;	
	}

}
