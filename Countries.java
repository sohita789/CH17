class Countries{
	
String name="INDIA";
String continent="ASIA";
String state="AndhraPradesh";

Countries(){
	System.out.println("created the copy Countries with no args");
	
}
Countries(String name,String continent){
	this.name=name;
	this.continent=continent;
	}
	
	public void represents(){
		System.out.println("name:"+this.name);
		System.out.println("continent:"+this.continent);
	}
}