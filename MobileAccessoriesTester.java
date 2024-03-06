class MobileAccessoriesTester{
   public static void main (String accessories []){
	   System.out.println("name is :" + MobileAccessories.name);
	System.out.println("model Name is :" + MobileAccessories.modelName);
	System.out.println("model Series Name is :" + MobileAccessories.modelSeriesName);
	
   MobileAccessories.addAccessories("Data-Cable");
   MobileAccessories.addAccessories("Tempered Glass");
   MobileAccessories.addAccessories("Connector");
   MobileAccessories.addAccessories("Battery");
   MobileAccessories.addAccessories("Lens Attachements");
   MobileAccessories.addAccessories("Back Case");
   MobileAccessories.addAccessories("Display");
   MobileAccessories.addAccessories("Arm Band");
   MobileAccessories.addAccessories("Griper/Holder");
   MobileAccessories.addAccessories("Charging Stand");
   
   MobileAccessories.getAccessories();
  boolean isAccessoriesAdded = MobileAccessories.updateAccessories("Memory Card","Arm Band");
  MobileAccessories.getAccessories();
}
}