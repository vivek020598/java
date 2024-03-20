class Blender{

		private String brandName;
		private String colour;
		private int    price;
		private String numberOfBlades;
		private String materialUsed;

			public Blender(){
				 System.out.println("Blender is invoked");
			}
			public void setBrandName(String brandName){
			this.brandName = brandName;
			}
			public String getBrandName(){
			return this.brandName;
			}

			public void setColour(String colour){
			this.colour = colour;
			}
			public String getColour(){
			return this.colour;
			}

			public void setPrice(int price){
			this.price = price;
			}
			public int getPrice(){
			return this.price;
			}

			public void setNumberOfBlades(String numberOfBlades){
			this.numberOfBlades = numberOfBlades;
			}
			public String getNumberOfBlades(){
			return this.numberOfBlades;
			}
			public void setMaterialUsed(String materialUsed){
			this.materialUsed = materialUsed;
			}
			public String getMaterialUsed(){
			return this.materialUsed;
			}

}