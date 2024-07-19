//
class Coffee{
public static int addNumbers(int a,int b){
return a+b;
}
public static int multiplyNumbers(int a,int b){
return a*b;
}
public static void main(String[]args){
int num1=5;
int num2=3;
int sum=addNumbers(num1,num2);
System.out.println("sum:"+ sum);
int product=multiplyNumbers(num1,num2);
System.out.println("product:"+ product);
}}