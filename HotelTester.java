class HotelTester{
public static void main(String foodItems[]){
	
	System.out.println("owner name is :" + Hotel.ownerName);
	System.out.println("owner address is :" + Hotel.address);
	
	Hotel.addFoodItems("akki rotti");
	Hotel.addFoodItems("rotti");
	Hotel.addFoodItems("chicken lollypop");
	Hotel.addFoodItems("bellulli kabab");
	Hotel.addFoodItems("chicken biryani");
	Hotel.addFoodItems("thali");
	Hotel.addFoodItems("lemon chicken");
	Hotel.getFoodItems();
}
}