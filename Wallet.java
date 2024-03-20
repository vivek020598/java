class Wallet{

private String material;
private int numberOfCardHolders;
private String features;
private String length;
private String multipackSet;

public Wallet(){
	
}
public void setMaterial(String material){
this.material = material;
}
public String getMaterial(){
return this.material;
}

public void setNumberOfCardHolders(int numberOfCardHolders){
this.numberOfCardHolders = numberOfCardHolders;
}
public int getNumberOfCardHolders(){
return this.numberOfCardHolders;
}

public void setFeatures(String features){
this.features = features;
}
public String getFeatures(){
return this.features;
}

public void setLength(String length){
this.length = length;
}
public String getLength(){
return this.length;
}
public void setMultipackSet(String multipackSet){
this.multipackSet = multipackSet;
}
public String getMultipackSet(){
return this.multipackSet;
}

}