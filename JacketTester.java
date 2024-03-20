class JacketTester{
public static void main(String mens[]){

Jacket jacket = new Jacket();
jacket.setSleeveLength("Long Sleeves");
jacket.setCollar("Mock Collar");
jacket.setLength("Regular");
jacket.setLiningFabric("Polyester");
jacket.setClosure("Zip");

System.out.println(jacket.getSleeveLength() + " " + jacket.getCollar() + " " + jacket.getLength() + " " + jacket.getLiningFabric()+ " " + jacket.getClosure());
}
}