package com.xworkz.Abstract;

import java.util.Objects;

public abstract class Provider {
	String name;
	String CEOName;
	
	
	public Provider(String name, String CEOName) {
		super();
		this.name = name;
		this.CEOName = CEOName;
	}


	@Override
	public String toString() {
		return "Provider [name=" + name + ", CEOName=" + CEOName + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(CEOName, name);
	}


	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Provider) {
				Provider casted=(Provider)obj;
				if(this.name.equals(casted.name)&&this.CEOName.equals(casted.CEOName)) {
					System.out.println("left equals to right");
					return true;
				}
			}
					else {
						System.out.println("obj is not provider");
						}}
			else {
				System.out.println("obj is null");
					}
		return false;
				}
	


		public void show() {
			System.out.println("name:"+name);
			System.out.println("CEOname:"+CEOName);
			System.out.println("running show in provider");
		}
		public abstract void service();
}
	
	


