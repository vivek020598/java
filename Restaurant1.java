class RestaurantArray{
public static void main(String a2b[]){

String restaurantName = "A2B";
String location = "Bhashyam circle";
String ownerName = "Deva";

String dessert[] = {"Jamoon", "Peda", "Halwa", "Rasmalai", "Chclt brownie", "Coconut burfi", "Lava cake"};
int dessertPrice[] = {10,20,30,40,50,60,70};
String starters[] = {"Gobi","Paneer tikka","Mashroom pepper dry","Masala Papad","Soup","Cheese corn balls","Kabab"};
int startersPrice[] = {100,110,120,130,140,150,160};
String mainCourse[] = {"Butter Roti","Butter naan","Butter kulcha","egg rice","chicken biryani","mutton biryani","chicken friedrice"};
int mainCoursePrice[] = {150,200,220,120,340,150,190};

System.out.println("Restaurent name is" + restaurantName);
System.out.println("Restaurent location" + location);
System.out.println("Restaurent owner is" + ownerName);

System.out.println("Desserts are");
for(int index = 0; index < dessert.length; index++){
System.out.println(dessert[index] + "--------->" + dessertPrice[index]);
}
 
System.out.println("starters are");
for(int index = 0; index < starters.length; index++){
System.out.println(starters[index] + "--------->" + startersPrice[index]);
}

System.out.println("Main course are");
for(int index = 0; index < mainCourse.length; index++){
System.out.println(mainCourse[index] + "--------->" + mainCoursePrice[index]);
}

}
}