class MobileAccessories{
   // public static void main(String acc[])
	static String name = "Phone";
	static String accessories[] = {null,null,null,null,null,null,null,null,null,null};
	static String modelName ="iphone";
	static String modelSeriesName = "13";
	static  int index;
	//method
	public static boolean addAccessories(String accessorie){
		//"Data Cable" !=null
		System.out.println("inside addAccessories():");
		boolean isAdded = false;
		if(accessories !=null){
			///code
			//accories[0] = "Data Cable";
			accessories[index]= accessorie;
			index++;
			isAdded = true;
			System.out.println("Accessories is added sucessfully......");	
		}
		else{
			System.out.println("Accesories can't be null");
		}
		System.out.println("End of addAccessories ()");
		return isAdded;
		
	}
	
       // fetch data
	   public static void getAccessories(){
		   for (int index=0; index<accessories.length; index++){
			   System.out.println(accessories [index]);
		   }
	   }
     public static boolean updateAccessories(String newAccessories, String oldAccessories){
		    boolean isUpdated = false;
			System.out.println("Before updating the MobileAccessories"); 
			 for(int index =0; index<accessories.length; index++){
				 if(accessories[index] == oldAccessories){
					  //accessories[0] = "Memory Card"
					  accessories [index] = newAccessories;
                      isUpdated = true ;
               System.out.println("Mobile Accessories is added sucessfully");
			   
				 }
			 }
			 System.out.println("After updating the MobileAccessories");
			        return isUpdated;
	 }

}


