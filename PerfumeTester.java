class PerfumeTester{
      public static void main(String per[]){
		  
		  System.out.println("main has started");
		  String ingredients[] = {"benzyl alcohol", "acetone","ethanol"};
		  
		  
	       Perfume perf  = new Perfume(ingredients , "Bella vita" , "150 ml" , 1000 , true);
		   perf.displayInfo();
	  
	  
	     System.out.println("main has ended");
	  }


}