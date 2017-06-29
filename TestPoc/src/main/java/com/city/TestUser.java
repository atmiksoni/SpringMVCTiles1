package com.city;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class TestUser {

	public static void main(String[] args) {
		User user = new User("1", "1");
		User user1 = new User();
		user1.setName("1");
		user1.setAddress("1");

		User user2 = new User();
		user2.setName("1");
		user2.setAddress("2");

		Set<User> set = new HashSet<User>();
		set.add(user);
		set.add(user1);
		set.add(user2);
		System.out.println(set.size());
		for (User u:set) {
			System.out.println(u.getName()+ ":::"+u.getAddress());
		}
		
		Map map=new HashMap();
		map.put(null,"Amik");
		System.out.println("Map::"+map.size());
	}
	
	
	

}

class User {
	private String name;
	private String address;
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String name, String address) {

		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}