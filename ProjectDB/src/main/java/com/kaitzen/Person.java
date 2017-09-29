package com.kaitzen;

public class Person {
    Integer id;
    String name;
    
    Person (int id, String name){
    	this.setId(id);
    	this.setName(name);
    }
    
    public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String ToString()
	{
		return "nombre";
	}
}
