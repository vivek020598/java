class ClothTester{
public static void main(String clothCollection[]){
System.out.println("main started");
/*Cloth cloth = new Cloth();
cloth.design();
cloth.brandName = "UCB";
cloth.material = "cotton";
cloth.price = 100.00;
cloth.size = "M";
cloth.color = "Black";
cloth.type = "Festive wear";
cloth.design();

Cloth cloth1 = new Cloth();
cloth1.design();
cloth1.brandName = "RCB";
cloth1.material = "Nylon";
cloth1.price = 200.00;
cloth1.size = "L";
cloth1.color = "White";
cloth1.type = "Casual wear";
cloth1.design();

Cloth cloth2 = new Cloth();
cloth2.design();
cloth2.brandName = "MCB";
cloth2.material = "Polyster";
cloth2.price = 300.00;
cloth2.size = "XL";
cloth2.color = "Blue";
cloth2.type = "Summer wear";
cloth2.design();*/

/*Cloth cloth3 = new Cloth();
cloth3.design();
cloth3.brandName = "MCB";
cloth3.material = "Polyster";
cloth3.price = 300.00;
cloth3.size = "XL";
cloth3.color = "Blue";
cloth3.type = "Summer wear";
cloth3.design();*/

Cloth cloth  = new Cloth("UCB","cotton", 100.00,"M","Black","Festive wear");
cloth.design();
	   

Cloth cloth1  = new Cloth("RCB" ,"Nylon",200.00,"L" ,"White","Casual wear");
cloth1.design();
	   
	   
Cloth cloth2  = new Cloth("MCB" ,"Polyster",300.00,"XL","Blue" ,"Summer wear");
cloth2.design();

}
}