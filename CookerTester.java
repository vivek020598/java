class CookerTester{
public static void main(String cook[]){

  Cooker cooker = new Cooker();
		cooker.setBrandName("Pigeon");
        cooker .setCapacity("5 litres");
		cooker .setPrice(999);
		cooker.setFinishType("Metallic");
		cooker.setMaterial("Aluminium");

   System.out.println(cooker.getBrandName() + " " + cooker .getCapacity() + " " + cooker.getPrice() + " " + cooker.getFinishType()+ " " + cooker.getMaterial());
}
}