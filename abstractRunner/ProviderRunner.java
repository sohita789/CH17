package com.xworkz.abstractRunner;


import com.xworkz.Abstract.AirtelInternetProvider;
import com.xworkz.Abstract.BookMyShowMovieBookingProvider;
import com.xworkz.Abstract.BookingProvider;
import com.xworkz.Abstract.DellProvider;
import com.xworkz.Abstract.ExtremeAirtelinternetProvider;
import com.xworkz.Abstract.Fast5GExtreme;
import com.xworkz.Abstract.InternetProvider;
import com.xworkz.Abstract.JioInternetProvider;
import com.xworkz.Abstract.LenovoProvider;
import com.xworkz.Abstract.MovieBookingProvider;
import com.xworkz.Abstract.Provider;
import com.xworkz.Abstract.SatJioInternetProvider;

public class ProviderRunner {

	public static void main(String[] args) {
		Provider provider;
		
		Provider provider1=new BookingProvider("sohita", "Om");
		provider1.show();
		
		Provider provider2=new LenovoProvider("Renuka","sujata");
		provider2.show();
		
		Provider provider3=new DellProvider("shanta","supriya");
		provider3.show();
		
		Provider provider4=new InternetProvider("bhagya","kavya");
		provider4.show();
		
		MovieBookingProvider provider5=new MovieBookingProvider("Mahesh","Omkar");
		provider5.book();
		provider5.cancel();
		
		AirtelInternetProvider provider6=new AirtelInternetProvider("karthik","Akshara");
		provider6.show();
		
		ExtremeAirtelinternetProvider provider7=new ExtremeAirtelinternetProvider("kalpana","raj");
		provider7.show();
		
	    Fast5GExtreme provider8=new Fast5GExtreme("mamatha","sharan");
	    new Fast5GExtreme("sharan", "shanta");
	    
	    provider8.show();
		
	    BookMyShowMovieBookingProvider provider9=new BookMyShowMovieBookingProvider("virat kohli","rohitsharma", 500);
	    provider9.book();
	    provider9.cancel();
	    
	    JioInternetProvider provider10=new JioInternetProvider("omkar","mamatha");
	    
	    SatJioInternetProvider provider11=new SatJioInternetProvider("kousalya","nagraj",1000,15);
	    provider11.show();
	    provider11.service();
	    
	    
	    Provider providers=new BookingProvider("Anu","Anand");
	    
	    
	    
	    boolean check=providers.equals(providers);
	    System.out.println("provider2 is same as provider1:"+check);
	    
	    
	    boolean checks=provider1.equals(provider2);
		System.out.println("provider1 is same as provider2:"+checks);
		
		boolean checkss=provider2.equals(provider3);
		System.out.println("provider2 is same as provider3:"+checkss);
		
		boolean checksss=provider3.equals(provider4);
		System.out.println("provider3 is same as provider4:"+checksss);
		
		boolean verify=provider3.equals(provider5);
		System.out.println("provider4 is same as provider5:"+verify);
		
		
		boolean vary=provider6.equals(provider7);
		System.out.println("provider6 is same as provider7:"+vary);
		
		boolean test=provider8.equals(provider6);
		System.out.println("provider6 is same as provider8:"+test);
		
		System.out.println(provider1.toString());
	    System.out.println(provider2.toString());
	    System.out.println(provider3.toString());
	    System.out.println(provider4.toString());
	    System.out.println(provider5.toString());
	    System.out.println(provider6.toString());
	    System.out.println(provider7.toString());
	    System.out.println(provider8.toString());
	    System.out.println(provider9.toString());
	}

}
