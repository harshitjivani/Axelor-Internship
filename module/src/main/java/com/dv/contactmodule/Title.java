package com.dv.contactmodule;


import java.util.Set;

import javax.persistence.Column;
//import javax.persistence.Embedded;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import javax.persistence.Table;

@Entity
@Table(name = "title_table")
public class Title {
    @NotNull
    @Column(name = "Name", unique = true, length = 100)
    @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters")
    String name;

    @Id
    @NotNull
    @Column(name = "Code", unique = true, length = 100)
    @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters")
    String code;

    @OneToMany(mappedBy = "title")
    Set<Contact> contact;


	public Title(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public Title(
			@NotNull @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters") String name,
			@NotNull @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters") String code,
			Set<Contact> contact) {        
		super();
		this.name = name;
		this.code = code;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;             

	}

	public Set<Contact> getContact() {
		return contact;
	}

	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Title [name=" + name + ", code=" + code + ", contact=" + contact + "]";
	}

}
