class SoftwareEngineer{

String name;
int experience;
String designation;
double salary;

SoftwareEngineer(){
System.out.println("created the copy with no args");
}

SoftwareEngineer(String name,int experience){
this.name=name;
this.experience=experience;
System.out.println("created the copy with String name,int experience");
}
SoftwareEngineer(String designation,double salary){
this.designation=designation;
this.salary=salary;
System.out.println("created the copy with String designation and double salary");
}
public void show(){
	System.out.println("name:"+this.name);
	System.out.println("experience:"+this.experience);
	System.out.println("designation:"+this.designation);
	System.out.println("salary:"+this.salary);
	
}
}