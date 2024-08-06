class Project
{
String type;
String company;
int weight;
String color="black";


public Project(String company){
this.company=company;
}

public void setWeight(int weight){
this.weight=weight;
}

public void display(){

System.out.println("String color:"+color);
System.out.println("String type:"+type);
System.out.println("String company:"+company);
System.out.println("int weight:"+weight);
}
}