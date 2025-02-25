package com.dv.contactmodule;

import java.util.List;

import javax.persistence.Column;
//import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Name")
	String fullName;

	@NotNull
	@Column(name = "Street")
	String numberAndStreet;

	@NotNull
	@Column(name = "Zip")
	String zip;

	@NotNull
	@Column(name = "City")
	String city;

	@NotNull
	@ManyToOne
	@JoinColumn(name = "country_code", referencedColumnName = "code", nullable = false)
	Country country;

	@OneToMany(mappedBy = "address")
	List<Contact> contact;

	public Address(String fullName, String numberAndStreet, String zip, String city, Country country) {
		super();
		this.fullName = fullName;
		this.numberAndStreet = numberAndStreet;
		this.zip = zip;
		this.city = city;
		this.country = country;

	}

	public Address(String fullName, @NotNull String numberAndStreet, @NotNull String zip, @NotNull String city,
			@NotNull Country country, List<Contact> contact) {
		super();
		this.fullName = fullName;
		this.numberAndStreet = numberAndStreet;
		this.zip = zip;
		this.city = city;
		this.country = country;
		this.contact = contact;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getNumberAndStreet() {
		return numberAndStreet;
	}

	public void setNumberAndStreet(String numberAndStreet) {
		this.numberAndStreet = numberAndStreet;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "Address [fullName=" + fullName + ", numberAndStreet=" + numberAndStreet + ", zip=" + zip + ", city="
				+ city + ", country=" + country + ", contact=" + contact + "]";
	}

}
