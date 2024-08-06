class Paper
{
int thickness;
char size='M';
boolean quality;
String color;

public Paper(int thickness){
this.thickness=thickness;
}
public void setquality(boolean quality){
this.quality=quality;
}
public Paper(String color){
this.color=color;
}
public void display(){
System.out.println("int thickness:"+thickness);
System.out.println("char size:"+size);
System.out.println("boolean quality:"+quality);
System.out.println("String color:"+color);
}
}