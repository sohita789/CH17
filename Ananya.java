class Ananya
{
	long mobile=9972997179L;
Knife knife;


public Ananya(long mobile,Knife knife){
	this.mobile=mobile;
	this.knife=knife;
System.out.println("created copy using mobile and constructor");	
}

public void display(){
System.out.println("mobile:"+mobile);

knife.display();
System.out.println("end display in ananya");

}
}
