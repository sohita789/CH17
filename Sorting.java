package com.xworkz.collection.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


 public class Sorting{
	           public static void main(String[] args) {
	        	   
	        	   Collection<Long>value=new ArrayList<>();
	               List<Long> longList = Arrays.asList();
	               value.add(787328L);
	               value.add(74694984L);
	               value.add(564746423L);
	               value.add(6673953506L);
	               value.add(73629878378L);
	               value.add(563715868089L);
	               value.add(5637158680988L);
	               value.add(563715868087214L);
	               value.add(5637158680590000L);
	               value.add(563715868059087755L);
	               
	               System.out.println("sorting in descending order");
	               value.forEach((ref)->System.out.println(ref));
	               System.out.println("after sorting in ascending order");
	               
	               value.stream().sorted().collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
	               System.out.println("its a collection of long datatype number");
	               System.out.println("****************************************");
	               
	               
	               //
	               Collection<String>primeMinisterName=new ArrayList<>();
	               List<String>stringList = Arrays.asList();
	               primeMinisterName.add("Jawaharlal Nehru");
	               primeMinisterName.add("Lal bahadur shastri");
	               primeMinisterName.add("Gulzarill nanda");
	               primeMinisterName.add("Indira gandhi");
	               primeMinisterName.add("Morarji Desai");
	               primeMinisterName.add("Charan Singh");
	               primeMinisterName.add("Rajiv gandhi");
	               primeMinisterName.add("Vishwanath pratap singh");
	               primeMinisterName.add("Chandra Shekhar");
	               primeMinisterName.add("P.V.narasimha rao");
	               primeMinisterName.add("H.D. DeveGouda");
	               primeMinisterName.add("V.P.singh");
	               primeMinisterName.add("Narendra Modi");
	               primeMinisterName.add("inder kumar gujaral");
	               primeMinisterName.add("Atal bihar vajapeye");
                   primeMinisterName.add("manmohan singh");
	               
	               System.out.println("sorting in descending order");
	               primeMinisterName.forEach((reference)->System.out.println(reference));
	               System.out.println("after sorting in ascending order");
	               
	               primeMinisterName.stream().sorted().collect(Collectors.toList()).forEach((reference)->System.out.println(reference));
	               System.out.println("its a collection of String  datatype of PrimeMinister");
	               System.out.println("****************************************");
	              
	               //All the states in India
	               Collection<String>StateName=new ArrayList<>();
	               List<String>stringList3 = Arrays.asList();
	               StateName.add("Andhra pradesh");
	               StateName.add("Arunachal Pradesh");
	               StateName.add("Assam");
	               StateName.add("Bihar");
	               StateName.add("Chattisgarh");
	               StateName.add("Goa");
	               StateName.add("Gujarat");
	               StateName.add("Harayana");
	               StateName.add("Himachal Pradesh");
	               StateName.add("jharkand");
	               StateName.add("Karnataka");
	               StateName.add("Kerala");
	               StateName.add("Madhya pradesh");
	               StateName.add("Maharashtra");
	               StateName.add("Manipur");
	               StateName.add("Meghalaya");
	               StateName.add("Mizoram");
	               StateName.add("Nagaland");
	               StateName.add("odisha");
	               StateName.add("Punjab");
	               StateName.add("Rajasthan");
	               StateName.add("sikkim");
	               StateName.add("Tamil Nadu");
	               StateName.add("telangana");
	               StateName.add("Tripura");
	               StateName.add("Uttar Pradesh");
	               StateName.add("Uttarkhand");
	               StateName.add("West Bengal");

	               System.out.println("sorting in descending order");
	               StateName.forEach((states)->System.out.println(states));
	               System.out.println("after sorting in ascending order");
	               
	               StateName.stream().sorted().collect(Collectors.toList()).forEach((states)->System.out.println(states));
	               System.out.println("its a collection of String  datatype of StateName");
	               System.out.println("****************************************");
	              
	               //
	           }}
	               
	         
	             
	


