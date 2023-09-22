package com.jdbc.project;

public class Member {
    private Integer Id;
	private String Name;
	private String Email;
	private String Phone;

	
public Member( Integer id,String name, String email,String phone) {
		super();
		
		Id =id;
     	Name = name;
		Email = email;
		Phone = phone;
	}

public Member() {
	// TODO Auto-generated constructor stub
}
public Integer getId() {
	return Id;
}


public void setId(Integer id) {
	Id = id;
}


public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getEmail() {
	return Email;
}


public void setEmail(String email) {
	Email = email;
}


public String getPhone() {
	return Phone;
}


public void setPhone(String phone) {
	Phone = phone;
}



}




