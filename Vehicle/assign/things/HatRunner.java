package com.xworkz.datatypes.things;

public class HatRunner {

	public static void main(String[] args) {
		
      Upendra upendra=new Upendra();
      
      upendra.wear();// hat, color,shade
      
      Yash yash=new Yash();
      
      Hat hat=new Hat();
      yash.tear(hat);//color,shade
      
      Rajkumar rajkumar=new Rajkumar();
      Hat hat2=new Hat();
      rajkumar.hat=new Hat();
      
      rajkumar.fold();
      
	}

}
