import java.util.Arrays;
class PetShop{

		 static String ownerName = "manju";
		 static String address = "8th mile";
		 static String items[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addItems(String item){
	System.out.println("inside addItems():");
	boolean isAdded = false;
	if(item != null){
		items[index] = item;
		index++;
		isAdded = true;
	System.out.println("item added successfully");
	}
	else{
		System.out.println("items can't be null");
	}
	System.out.println("end of items");
	return isAdded;
}
// fetch data
public static void getItems(){
	for(int index = 0; index < items.length; index++){
		System.out.println(items[index]);
		
	}
}

      public static boolean updateItems(String newItem, String oldItem){
	  System.out.println("update accessory");
	  boolean isUpdated = false ;
	  
	  for(int index=0 ; index<items.length ; index++){
		  
		  if(items[index]==oldItem){
			  items[index] = newItem;
			  isUpdated = true;
		  }
		  
	  }
	  System.out.println("items updates successfully");
		  return isUpdated;
      }
      
            public static void deleteItems(String item){
	int newIndex, oldIndex;
	
	for( newIndex=0, oldIndex=0;oldIndex<items.length; oldIndex++){
		if(items[oldIndex] != item){
			items[newIndex++] = items[oldIndex];
			
		}		
	}
	items = Arrays.copyOf(items, newIndex);
	return;	
	}

}