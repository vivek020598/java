class SweaterTester{
public static void main(String mens[]){

Sweater sweater = new Sweater();
sweater.setFabric("Acrylic");
sweater.setSleeveLength("Long Sleeves");
sweater.setOccasion("Casual");
sweater.setPattern("Self Design");
sweater.setNeck("Round Neck");

System.out.println(sweater.getFabric() + " " + sweater.getSleeveLength() + " " + sweater.getOccasion() + " " + sweater.getPattern()+ " " + sweater.getNeck());
}
}