class DiseaseRunner
{
public static void main(String[]args)
{
System.out.println("starting main method");
String Symptom="fever";
String Symptom=Disease.getsick(Symptom);
System.out.println("Symptom:"+Symptom);
String Medicine1="cheston cold";
String Symptom1=Disease.getsick(Medicine);
System.out.println("Symptom1:"+Symptom1);
String Symptom2=Disease.getsick(Medicine);
System.out.println("Symptom2:"+Symptom2);
String Symptom3=Disease.getsick(Medicine);
System.out.println("Symptom3:"+Symptom3);
String Symptom4=Disease.getsick(Medicine);
System.out.println("Symptom4:"+Symptom4);
System.out.println("no Medicine matched");
}
}