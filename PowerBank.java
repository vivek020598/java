class PowerBank{

		private String brandName;
		private String batteryCapacity;
		private int    price;
		private String voltage;
		private String colour;

			public PowerBank(){
				 System.out.println("PowerBank is invoked");
			}
			public void setBrandName(String brandName){
			this.brandName = brandName;
			}
			public String getBrandName(){
			return this.brandName;
			}

			public void setBatteryCapacity(String batteryCapacity){
			this.batteryCapacity = batteryCapacity;
			}
			public String getBatteryCapacity(){
			return this.batteryCapacity;
			}

			public void setPrice(int price){
			this.price = price;
			}
			public int getPrice(){
			return this.price;
			}

			public void setVoltage(String voltage){
			this.voltage = voltage;
			}
			public String getVoltage(){
			return this.voltage;
			}
			public void setColour(String colour){
			this.colour = colour;
			}
			public String getColour(){
			return this.colour;
			}

}