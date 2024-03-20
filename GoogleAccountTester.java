class GoogleAccountTester{
public static void main(String data[]){

GoogleAccount googleAccount = new GoogleAccount();
googleAccount.setFirstName("Vivek");
googleAccount.setLastName("M");
googleAccount.setDob("05-02-1998");
googleAccount.setGender("male");
googleAccount.setUserName("vivekm");
googleAccount.setEmail("vivekm@gmail.com");

System.out.println(googleAccount.getFirstName() + " " + googleAccount.getLastName() + " " + googleAccount.getDob() + " " + googleAccount.getGender() + " " + googleAccount.getUserName() + " " + googleAccount.getEmail());
}
}