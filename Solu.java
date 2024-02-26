class Solu{
public static void main(String ind[]){
printt();
}
public static void printt(){
int arr1[] = {2,13,86,24,33,52,28,52,4,29,26};
for(int i = 0; i < arr1.length ; i++){
	for(int j = i+1; j<arr1.length; j++){
	for(int k = j+1; k<arr1.length; k++){
if (arr1[i] + arr1[j] + arr1[k] == 30){
  System.out.println(i + " , " + j + " , " + k);  
}
	}
	}
}
}
}
