class Swiggy{
public static double search(String food){

if(food == "gobi"){
return 50.00;
}

if(food == "vada pav"){
return 60.00;
}

if(food == "masal puri"){
return 70.00;
}

if(food == "pani puri"){
return 80.00;
}

if(food == "mango juice"){
return 90.00;
}

if(food == "apple juice"){
return 30.00;
}

if(food == "grape juice"){
return 55.00;
}

if(food == "butter milk"){
return 66.00;
}

if(food == "samosa"){
return 75.00;
}

if(food == "kachori"){
return 88.00;
}

if(food == "aloo bun"){
return 91.00;
}

if(food == "egg masala"){
return 35.00;
}

if(food == "aloo puff"){
return 68.00;
}

if(food == "egg gobi"){
return 21.00;
}

if(food == "maggi"){
return 45.00;
}
if(food == "noodels"){
return 95.00;
}

if(food == "fried rice"){
return 39.00;
}

if(food == "paneer friedrice"){
return 68.00;
}

if(food == "corn chat"){
return 27.00;
}

if(food == "steamed corn"){
return 46.00;
}
if(food == "onion samosa"){
return 95.00;
}

if(food == "onion pakoda"){
return 34.00;
}

if(food == "oreo"){
return 63.00;
}

if(food == "egg chilly"){
return 22.00;
}

if(food == "dosa"){
return 41.00;
}
return 0.0;
}
public static double search(String food, int quantity){

if(food == "gobi"){
return 50.00 *quantity;
}

if(food == "vada pav"){
return 60.00*quantity;
}

if(food == "masal puri"){
return 70.00*quantity;
}

if(food == "pani puri"){
return 80.00*quantity;
}

if(food == "mango juice"){
return 90.00*quantity;
}

if(food == "apple juice"){
return 30.00*quantity;
}

if(food == "grape juice"){
return 55.00*quantity;
}

if(food == "butter milk"){
return 66.00*quantity;
}

if(food == "samosa"){
return 75.00*quantity;
}

if(food == "kachori"){
return 88.00*quantity;
}

if(food == "aloo bun"){
return 91.00*quantity;
}

if(food == "egg masala"){
return 35.00*quantity;
}

if(food == "aloo puff"){
return 68.00*quantity;
}

if(food == "egg gobi"){
return 21.00*quantity;
}

if(food == "maggi"){
return 45.00*quantity;
}
if(food == "noodels"){
return 95.00*quantity;
}

if(food == "fried rice"){
return 39.00*quantity;
}

if(food == "paneer friedrice"){
return 68.00*quantity;
}

if(food == "corn chat"){
return 27.00*quantity;
}

if(food == "steamed corn"){
return 46.00*quantity;
}
if(food == "onion samosa"){
return 95.00*quantity;
}

if(food == "onion pakoda"){
return 34.00*quantity;
}

if(food == "oreo"){
return 63.00*quantity;
}

if(food == "egg chilly"){
return 22.00*quantity;
}

if(food == "dosa"){
return 41.00*quantity;
}

else{
System.out.println("item not found");
}
return 0.0;
}

}