package com.dv.contactmodule;

import javax.persistence.Column;
//import javax.persistence.Embeddable;
//import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

@Entity
@Table(name = "country_table")
public class Country {
    @NotNull
    @Column(name = "Name", unique = true, length = 100)
    @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters")
    String name;

    @Id
    @NotNull
    @Column(name = "Code", unique = true, length = 100)
    @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters")
    String code;

    @OneToMany(mappedBy = "country")
    List<Address> address;

	public Country(String name, String code) {
		super();
		this.name = name;
		this.code = code;
	}

	public Country(
			@NotNull @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters") String name,
			@NotNull @Size(min = 2, max = 100, message = "Username must be between 2 and 100 characters") String code,
			List<Address> address) {
		super();
		this.name = name;
		this.code = code;
		this.address = address;
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

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", code=" + code + ", address=" + address + "]";
	}

}
