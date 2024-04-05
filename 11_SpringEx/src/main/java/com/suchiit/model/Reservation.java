package com.suchiit.model;

public class Reservation {  
	  
    private String firstName;  
    private String lastName; 
    private String[] Food;
    public String[] getFood() {
		return Food;
	}
	public void setFood(String[] food) {
		Food = food;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	private String Gender;
      
    public Reservation()  
    {         
    }  
    public String getFirstName() {  
        return firstName;  
    }  
    public void setFirstName(String firstName) {  
        this.firstName = firstName;  
    }  
    public String getLastName() {  
        return lastName;  
    }  
    public void setLastName(String lastName) {  
        this.lastName = lastName;  
    }     
}  