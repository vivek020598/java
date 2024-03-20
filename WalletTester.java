class WalletTester{
public static void main(String nike[]){

Wallet wallet = new Wallet();
wallet.setMaterial("Leather");
wallet.setNumberOfCardHolders(3);
wallet.setFeatures("SD Card Holder");
wallet.setLength("Long");
wallet.setMultipackSet("Single");

System.out.println(wallet.getMaterial() + " " + wallet.getNumberOfCardHolders() + " " + wallet.getFeatures() + " " + wallet.getLength()+ " " + wallet.getMultipackSet());
}
}