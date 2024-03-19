class EverestTester{
      public static void main(String powder[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"Red Chilly","Coriander","Cumin","Fenugreek","Cassia"};
		  
		  
	       Everest everest  = new Everest(ingredients , "everest","100g" , "Powder" , 80 , true);
		   everest.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }
}