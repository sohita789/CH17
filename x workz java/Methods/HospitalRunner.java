class HospitalRunner
{
public static void main(String[] args)
{
String medicineName1="Amoxicillin";
double price1=Hospital.price(medicineName1);
System.out.println("price:"+price1);
String medicineName2="Atenolol";
double price2=Hospital.price(medicineName2);
System.out.println("price:"+price2);
String medicineName3="Loratadine";
double price3=Hospital.price(medicineName3);
System.out.println("price:"+price3);
String medicineName4="Cetirizine";
double price4=Hospital.price(medicineName4);
System.out.println("price:"+price4);
String medicineName5="Asprin";
double price5=Hospital.price(medicineName5);
System.out.println("price:"+price5);

String medicineName11="Amoxicillin";
String symptom1=Hospital.symptom(medicineName11);
System.out.println("symptom:"+symptom1);
String medicineName12="Atenolol";
String symptom2=Hospital.symptom(medicineName12);
System.out.println("symptom:"+symptom2);
String medicineName13="Loratadine";
String symptom3=Hospital.symptom(medicineName13);
System.out.println("symptom:"+symptom3);
String medicineName14="Cetirizine";
String symptom4=Hospital.symptom(medicineName14);
System.out.println("symptom:"+symptom4);

String availability1="Dr.Vithal Rao Bhandare";
String doctorName1=Hospital.doctorName(availability1);
System.out.println("doctorName:"+doctorName1);
String availability2="Dr.Pooja Hosmani";
String doctorName2=Hospital.doctorName(availability2);
System.out.println("doctorName:"+doctorName2);
String availability3="Dr.Shweta";
String doctorName3=Hospital.doctorName(availability3);
System.out.println("doctorName:"+doctorName3);
String availability4="Dr.Shradha";
String doctorName4=Hospital.doctorName(availability4);
System.out.println("doctorName:"+doctorName4);
}
}