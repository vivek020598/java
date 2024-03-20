public class Person{

private String personName;
private int age;
private String gender;
private String address;

public Person(){
	System.out.println("person constructor is invoked");
}
//setter and getter (methods)
public void setPersonName(String personName){
	this.personName = personName;
}
public String getPersonName(){
	return this.personName;
}
public void setAge(int age){
	this.age = age;
}
public int getAge(){
	return this.age;
}
public void setGender(String gender){
	this.gender = gender;
}
public String getGender(){
	return this.gender;
}
public void setAddress(String address){
	this.address = address;
}
public String getAddress(){
	return this.address;
}
}