class Cloth{
String brandName;
String material;
double price;
String size;
String color;
String type;

/*public Cloth(){
	System.out.println("cloths are used for fashion desiging");
}*/

public Cloth(String brandName ,String material,double price, String size,String color,String type){
	System.out.println("cloths are used for fashion desiging");
           this.brandName = brandName;
           this.material = material;
           this.price = price;
            this.size = size;
           this.color = color;
            this.type = type;		   
	             
	   }

public void design(){
	System.out.println("brand name is" +brandName);
	System.out.println("material is" +material);
	System.out.println("price is" +price);
	System.out.println("size is" +size);
	System.out.println("color is" +color);
	System.out.println("type is" +type);
}
}