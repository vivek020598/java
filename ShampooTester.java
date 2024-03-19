class ShampooTester{
      public static void main(String headAndShoulder[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Water","Sodium chloride","Sodium benzoate","Dimethicone","Cocamidopropyl betaine"};
		  
		  
	       Shampoo shampoo  = new Shampoo(ingredients , "Head & shoulder" , "1000 ml" , 450 , true);
		   shampoo.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}