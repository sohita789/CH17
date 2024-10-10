package com.xworkz.productDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductDTORunner {

	public static void main(String[] args) {

		        List<ProductDTO> products = new ArrayList<>();
		        products.add(new ProductDTO(1, "Laptop", "Apple", 90000));
		        products.add(new ProductDTO(2, "Phone", "Samsung", 60000));
		        products.add(new ProductDTO(3, "Tablet", "Microsoft", 40000));
		        products.add(new ProductDTO(4, "Monitor", "Dell", 15000));
		        products.add(new ProductDTO(5, "Headphones", "Sony", 8000));
		        products.add(new ProductDTO(6, "Keyboard", "Logitech", 3000));
		        products.add(new ProductDTO(7, "Mouse", "HP", 2000));
		        products.add(new ProductDTO(8, "Printer", "Canon", 12000));
		        products.add(new ProductDTO(9, "Camera", "Nikon", 45000));
		        products.add(new ProductDTO(10, "Smartwatch", "Apple", 35000));
		        
		        
		        System.out.println("sorting in descending order");
		        
		   	  
		        System.out.println("after sorting in ascending order");
		        
		        products.stream().sorted().collect(Collectors.toList()).forEach((reference)->System.out.println(reference));
		        products.stream().sorted((ref1,ref2)->ref2.compareTo(ref1)).collect(Collectors.toList()).forEach((ref)->System.out.println(ref));
		   	

		        
		        List<ProductDTO> costGreaterThan5000 = products.stream()
		        		.sorted()
		                .filter(ref -> ref.getCost() > 5000)
		               
		                .collect(Collectors.toList());
		                
		        System.out.println("Products with cost greater than 5000: " + costGreaterThan5000);
		        
		        

		      
		        List<ProductDTO> costBetween5kAnd30k = products
		        		.stream()
		                .filter(ref -> ref.getCost() > 5000 && ref.getCost() < 30000)
		                .collect(Collectors.toList());
		        System.out.println("Products with cost between 5000 and 30000: " + costBetween5kAnd30k);
		        
		        

		        
		        List<ProductDTO> sortedDescByCost = products
		        		.stream()
		                .sorted((ref1, ref2) -> Double.compare(ref2.getCost(), ref1.getCost()))
		                .collect(Collectors.toList());
		        System.out.println("Products sorted in descending order by cost: " + sortedDescByCost);
		        
		        

		       
		        List<ProductDTO> vendorStartsWithA = products
		        		.stream()
		                .filter(ref-> ref.getVendor().startsWith("A"))
		                .sorted((ref1, ref2) -> ref1.getName().compareTo(ref2.getName()))
		                .collect(Collectors.toList());
		        System.out.println("Products with vendors starting with 'A' sorted by name: " + vendorStartsWithA);
		        
		        

		       
		        List<ProductDTO> sortedByCostAndId = products
		        		.stream()
		                .sorted((ref1, ref2) -> {
		                    int costComparison = Double.compare(ref1.getCost(), ref2.getCost());
		                    if (costComparison == 0) {
		                        return Integer.compare(ref1.getId(), ref2.getId());
		                    }
		                    return costComparison;
		                })
		                .collect(Collectors.toList());
		        System.out.println("Products sorted by cost and id: " + sortedByCostAndId);

		        
		        List<String> productNames = products
		        		.stream()
		                .map(ProductDTO::getName)
		                .collect(Collectors.toList());
		        System.out.println("Product names: " + productNames);

		        
		        List<Integer> productIds = products
		        		.stream()
		                .map(ProductDTO::getId)
		                .collect(Collectors.toList());
		        System.out.println("Product IDs: " + productIds);

		        
		        List<ProductDTO> UppercaseNames = products
		        		.stream()
		                .map(ref -> new ProductDTO(ref.getId(), ref.getName().toUpperCase(), ref.getVendor(), ref.getCost()))
		                .collect(Collectors.toList());
		        System.out.println("Products with names in uppercase: " + UppercaseNames);
		    }
		

	}


