class Owner{

String ownername;
int age;
char gender;

Owner(){
System.out.println("created the copy of owner with no arguments");
}
Owner(String ownername){
this.ownername=ownername;
System.out.println("created owner using String name");

}
Owner(int age){
this.age=age;
System.out.println("created owner using int age");
}

public void show(){
System.out.println("ownername:"+this.ownername);
System.out.println("age:"+this.age);
System.out.println("gender:"+this.gender);
}
}