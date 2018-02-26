package org.ef.javabrains.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Profile {
	
	private long id;
	private String prifileName;
	private String firstName;
	private String lastName;
	private Date created;
	
	public Profile() {
		
	}
	
	public Profile(long id, String prifileName, String firstName, String lastName) {
		this.id = id;
		this.prifileName = prifileName;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrifileName() {
		return prifileName;
	}

	public void setPrifileName(String prifileName) {
		this.prifileName = prifileName;
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
	

	
	
}
