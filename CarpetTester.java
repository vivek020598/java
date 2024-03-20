class CarpetTester{
public static void main(String floor[]){

Carpet carpet = new Carpet();
carpet.setFabric("Polyester");
carpet.setPattern("Traditional");
carpet.setSize(1);
carpet.setType("Light");
carpet.setFeatures("Anti-Skid");

System.out.println(carpet.getFabric() + " " + carpet.getPattern() + " " + carpet.getSize() + " " + carpet.getType()+ " " + carpet.getFeatures());
}
}