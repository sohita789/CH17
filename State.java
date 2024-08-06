class State
{
String statename;
String language;
CapitalCity capitalCity=new CapitalCity("karnataka",347699);

State()
{
System.out.println("created the copy State with no args");
}

State(String statename,String language){
this.statename=statename;
this.language=language;
System.out.println("created the copy State with statename,language");
}

public void print(){
System.out.println("State:"+this.statename);
System.out.println("State:"+this.language);
System.out.println("CapitalCity name:"+capitalCity.name);
System.out.println("CapitalCity population:"+capitalCity.population);
}
}