class Company
{
int id=9972;
String name="wipro";
String location="bangalore";
SoftwareEngineer softwareEnginner=new SoftwareEngineer("Suresh",5);
SoftwareEngineer softwareEngineer=new SoftwareEngineer("junior developer",76000);

Company(){
System.out.println("created copy with no args");
}

public void show(){
System.out.println("Company id:"+this.id);
System.out.println("Company name:"+this.name);
System.out.println("Company location:"+this.location);
System.out.println("SoftwareEngineer name:"+softwareEnginner.name);
System.out.println("SoftwareEngineer experience:"+softwareEngineer.experience);
System.out.println("SoftwareEngineer designation:"+softwareEngineer.designation);
System.out.println("SoftwareEngineer salary:"+softwareEngineer.salary);

}

}
