class BlinkItTester{
public static void main(String items[]){
double price = BlinkIt.search("juice");
System.out.println("price of item is :" +price);

double priceWithQuantity = BlinkIt.search("juice",3);
System.out.println("price of item is :" +priceWithQuantity);
}
}