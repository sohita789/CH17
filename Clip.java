class Clip
{
String color;
String type;
public Clip(){
}

public Clip(String color,String type){
this.color=color;
this.type=type;
System.out.println("created  the clip with String color,String type");
}

public void display(){
System.out.println("color:"+this.color);
System.out.println("type:"+this.type);
}
}