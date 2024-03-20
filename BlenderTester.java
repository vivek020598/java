class BlenderTester{
public static void main(String grinder[]){

  Blender blender = new Blender();
		blender.setBrandName("Faber");
		blender .setColour("Black");
		blender .setPrice(1999);
		blender .setNumberOfBlades("3Blades");
		blender .setMaterialUsed("Plastic");

   System.out.println(blender .getBrandName() + " " + blender .getColour() + " " + blender .getPrice() + " " + blender.getNumberOfBlades()+ " " + blender.getMaterialUsed());
}
}