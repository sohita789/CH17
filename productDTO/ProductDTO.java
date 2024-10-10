package com.xworkz.productDTO;

import java.io.Serializable;


	
	public class ProductDTO implements Serializable, Comparable<ProductDTO> {
	    int id;
	    String name;
	    String vendor;
	    double cost;
	    
	    public ProductDTO() {
	    	System.out.println("created the noArgs ProductDTO");	    	
	    }

	    public ProductDTO(int id, String name, String vendor, double cost) {
	        this.id = id;
	        this.name = name;
	        this.vendor = vendor;
	        this.cost = cost;
	    }

	    @Override
	    public int compareTo(ProductDTO other) {
	        return Double.compare(this.cost, other.cost);
	    }

	   
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getVendor() {
	        return vendor;
	    }

	    public double getCost() {
	        return cost;
	    }

	    @Override
	    public String toString() {
	        return "ProductDTO{id=" + id + ", name='" + name + "', vendor='" + vendor + "', cost=" + cost + '}';
	    }

		public static void forEach(Object object) {
			// TODO Auto-generated method stub
			
		}
	}
	