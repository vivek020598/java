
class ZomatoTester{
     public static void main(String menu[]){
	 
	 double price = Zomato.search("Veg  Comb");
	 System.out.println("The Price of Veg  Combois :" + price);
	 double priceWithQuanity = Zomato.search("Veg  Comb", 3);
	 System.out.println("The Price of Veg  Comb is:" + priceWithQuanity);
	 
	 
	 
	 
	 }

}