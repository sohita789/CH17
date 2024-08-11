class Knife{
	
float weight;
float height;
public Knife(){
System.out.println("created the Knife with no args");
} 

public Knife(float weight,float height){
this.weight=weight;
this.height=height;
}

public void display(){
System.out.println("weight:"+this.weight);
System.out.println("height:"+this.height);
}

}