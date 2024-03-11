class SwiggyTester{
public static void main(String items[]){
double price = Swiggy.search("grape juice");
System.out.println("price of grape juice is :" +price);

double priceWithQuantity = Swiggy.search("grape juice",5);
System.out.println("price of 5 grape juice is :" +priceWithQuantity);
}
}