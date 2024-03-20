class PowerBankTester{
public static void main(String Charge[]){

  PowerBank powerBank = new PowerBank();
		powerBank .setBrandName("Mi");
        powerBank .setBatteryCapacity("20000");
		powerBank .setPrice(2141);
		powerBank .setVoltage("12 volts");
		powerBank .setColour("Black");

   System.out.println(powerBank.getBrandName() + " " + powerBank.getBatteryCapacity() + " " + powerBank.getPrice() + " " + powerBank.getVoltage()+ " " + powerBank.getColour());
}
}