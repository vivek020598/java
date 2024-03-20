class PersonTester{
	public static void main(String personData[]){
		
		Person person = new Person();
		person.setPersonName("pushpa");
		person.setAge(50);
		person.setGender("male");
		person.setAddress("bangalore");
		System.out.println(person.getPersonName() + " " + person.getAge() + " " + person.getGender() + " " +person.getAddress());
		
		
	}
}