class Cooker{

		private String brandName;
		private String capacity;
		private int    price;
		private String finishType;
		private String material;

			public Cooker(){
				 System.out.println("cooker is invoked");
			}
			public void setBrandName(String brandName){
			this.brandName = brandName;
			}
			public String getBrandName(){
			return this.brandName;
			}

			public void setCapacity(String capacity){
			this.capacity = capacity;
			}
			public String getCapacity(){
			return this.capacity;
			}

			public void setPrice(int price){
			this.price = price;
			}
			public int getPrice(){
			return this.price;
			}

			public void setFinishType(String finishType){
			this.finishType = finishType;
			}
			public String getFinishType(){
			return this.finishType;
			}
			public void setMaterial(String material){
			this.material = material;
			}
			public String getMaterial(){
			return this.material;
			}

}