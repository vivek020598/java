class Stationary{

		 static String ownerName = "Chandan";
		 static String address = "deepanjali nagar";
		 static String products[] = {null,null,null,null,null,null,null,null,null,null};
		 static int index;
//method	 
public static boolean addProducts(String product){
	System.out.println("inside addProducts():");
	boolean isAdded = false;
	if(product != null){
		products[index] = product;
		index++;
		isAdded = true;
	System.out.println("product added successfully");
	}
	else{
		System.out.println("products can't be null");
	}
	System.out.println("end of products");
	return isAdded;
}
// fetch data
public static void getProducts(){
	for(int index = 0; index < products.length; index++){
		System.out.println(products[index]);
		
	}
}

public static boolean updateProducts(String newProduct, String oldProduct){
	  System.out.println("update product");
	  boolean isUpdated = false ;
	  
	  for(int index=0 ; index<products.length ; index++){
		  
		  if(products[index]==oldProduct){
			  products[index] = newProduct;
			  isUpdated = true;
		  }
		  
	  }
	  System.out.println("products updates successfully");
		  return isUpdated;
      }

}
