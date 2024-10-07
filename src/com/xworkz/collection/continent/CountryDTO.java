package com.xworkz.collection.continent;


	import java.io.Serializable;
import java.util.ArrayList;
	import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

	public class CountryDTO implements Serializable {

    private String name;
	private double population;
	private String presidentName;
	private Country country;
	
	public CountryDTO(String name, double population, String presidentName, Country country) {
		super();
		this.name = name;
		this.population = population;
		this.presidentName = presidentName;
		this.country = country;
	}
	

	@Override
	public String toString() {
		return "CountryDTO [name=" + name + ", population=" + population + ", presidentName=" + presidentName
				+ ", country=" + country + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(population);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((presidentName == null) ? 0 : presidentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CountryDTO other = (CountryDTO) obj;
		if (country != other.country)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(population) != Double.doubleToLongBits(other.population))
			return false;
		if (presidentName == null) {
			if (other.presidentName != null)
				return false;
		} else if (!presidentName.equals(other.presidentName))
			return false;
		return true;
	}


	public int getpopulation() {
		// TODO Auto-generated method stub
		return 0;
	}


	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}


	public int getcode() {
		// TODO Auto-generated method stub
		return 0;
	}


	public char[] getpresidentName() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
	
	   