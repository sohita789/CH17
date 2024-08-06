class CapitalCity
{
String name;
double population;

CapitalCity(){
	System.out.println("created copy with no args");
	
}
CapitalCity(String name,double population){
	this.name=name;
	this.population=population;
	System.out.println("created the copy with name,population");
}
public void print(){
	System.out.println("name:"+this.name);
	System.out.println("population:"+this.population);
	}
}