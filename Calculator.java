class Calculator{
public static void main(String calculate[]){ 
 int total1 = add(12,22);
 int total11 = add(12,22,32);
System.out.println(total1);
System.out.println(total11);
 int total2 = sub(23,5);
 int total22 = sub(23,5,12);
System.out.println(total2);
System.out.println(total22);
int total3 = prod(1,2);
int total33 = prod(1,2,3);
System.out.println(total3);
System.out.println(total33);
 int total4 = div(10,5);
 int total44 = div(10,5,2);
System.out.println(total4);
System.out.println(total44);
 int total5 = sq(12);
System.out.println(total5);
double total6 = sqrt(12,144);
System.out.println(total6);
double total7 = x(15);
System.out.println(total7);

}
public static int add(int num1, int num2){
int total=num1+num2;
return total;
}
public static int add(int num1, int num2, int num3){
int total=num1+num2+num3;
return total;
}


public static int sub(int num1, int num2){
int total=num1-num2;
return total;
}
public static int sub(int num1, int num2,int num3){
int total=num1-num2-num3;
return total;
}


public static int prod(int num1, int num2){
int total=num1*num2;
return total;
}
public static int prod(int num1, int num2,int num3){
int total=num1*num2*num3;
return total;
}

public static int div(int num1, int num2){
int total=num1/num2;
return total;
}
public static int div(int num1, int num2, int num3){
int total=num1/num2/num3;
return total;
}

public static int sq(int num1){
int total=num1*num1;
return total;
}
public static double sqrt(int num1,int num2){
double total=num2/num1;
return total;
}
public static double x(double num1){
double total=1/num1;
return total;

}
}

