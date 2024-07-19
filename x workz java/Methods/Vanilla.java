//Declare a class with methods:
//a: Method with 2 string and three boolean variables,init and print on console

class Vanilla
{
public static void main(String[]args)
{
String iceCream="strawberry";
System.out.println(iceCream);
String coolDrinks="sting";
System.out.println(coolDrinks);

int noOfStudents=278;
int noOfLectures=13;
int noOfCourse=4;

boolean institute=noOfStudents==noOfLectures;
System.out.println("institute:"+institute);
boolean college=noOfLectures==noOfCourse;
System.out.println("college:"+college);
noOfCourse=13;
boolean banglore=noOfCourse==noOfLectures;
System.out.println("banglore:"+banglore);
}
}