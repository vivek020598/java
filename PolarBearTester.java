class PolarBearTester{
public static void main(String items[]){
double price = PolarBear.search("brownie fudge");
System.out.println("price of item is :" +price);

double priceWithQuantity = PolarBear.search("brownie fudge",3);
System.out.println("price of item is :" +priceWithQuantity);
}
}