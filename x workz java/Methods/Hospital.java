class Hospital
{
public static double price(String medicineName)
{
System.out.println("Starting price");
 System.out.println("medicineName"+medicineName);
  if(medicineName=="Amoxicillin")
  {
	  return 60;
  }
  if(medicineName=="Atenolol")
  {
	  return 65;
  }
  if(medicineName=="Loratadine")
  {
	  return 150;
  }
  if(medicineName=="Cetirizine")
  {
	  return 25;
  }
  System.out.println("no item matched");
  return 0;
  }
  public static String symptom(String medicineName)
{
System.out.println("starting symptom name");
 System.out.println("symptom"+medicineName);
 if(medicineName=="Amoxicillin")
 {
	 return "Bacterial Infection";
 }
 if(medicineName=="Atenolol")
 {
	 return "treat high blood presssure";
 }
 if(medicineName=="Loratadine")
 {
	 return "prevents allergies ";
 }
 System.out.println("no found an movie");
 return "cetirizine";
 }
 public static String doctorName(String availability)
{
System.out.println("starting doctorname");
 System.out.println("doctorName"+availability);
 if(availability=="Dr.Vithal Rao Bhandare")
 {
	 return "moring 8AM to 12:30 PM";
 }
 if(availability=="Dr.Pooja Hosamani")
 {
	 return "evening 9AM to 1PM";
 }
 if(availability=="Dr.Shweta")
 {
	 return "afternoon 11AM to 4PM";
 }
 System.out.println("no found an dotor");
 return "evening 5PM to 8PM";
 }
}