class Ganavi
{
String email;
Clip clip;

public Ganavi(String email,Clip clip){
	this.email=email;
	this.clip=clip;
System.out.println("created the copy using String and const");	
}

public void display(){
	System.out.println("email:"+email);


clip.display();
System.out.println("end display in Ganavi");
}
}
