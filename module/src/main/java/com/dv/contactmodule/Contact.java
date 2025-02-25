package com.dv.contactmodule;

import java.sql.Date;
import java.util.Arrays;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
//import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;

import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "contact_table")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "title_code", referencedColumnName = "code", nullable = false)
	Title title;

	@NotNull
	@Column(name = "first_name")
	String firstname;

	@NotNull
	@Column(name = "last_name")
	String lastname;

	@Column(name = "full_name")
	String fullname;

	@Column(name = "birth_date")
	Date birthDate;

	@Column(name = "email")
	String email;

	@Column(name = "phone_number", nullable = false)
	String phoneNumber;

	@Lob
	@Column(name = "profile_picture")
	byte[] image;

	@Column(name = "apply_taxes")
	boolean isSubjectToTaxes;

	@ManyToOne
	@JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
	public Address address;

	@ManyToMany
	@JoinTable(name = "contact_family_contact", joinColumns = @JoinColumn(name = "contact_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "family_contact_id"))
	Set<Contact> familyContactSet;

	public Contact(Title title, String firstname, String lastname, String fullname, Date birthDate, String email,
			String phoneNumber, byte[] image, boolean isSubjectToTaxes, Address address,
			Set<Contact> familyContactSet) {
		super();
		this.title = title;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fullname = fullname;
		this.birthDate = birthDate;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.image = image;
		this.isSubjectToTaxes = isSubjectToTaxes;
		this.address = address;
		this.familyContactSet = familyContactSet;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public boolean isSubjectToTaxes() {
		return isSubjectToTaxes;
	}

	public void setSubjectToTaxes(boolean isSubjectToTaxes) {
		this.isSubjectToTaxes = isSubjectToTaxes;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Contact getFamilyContactSet() {
		return (Contact) familyContactSet;
	}

	public void setFamilyContactSet(Set<Contact> familyContactSet) {
		this.familyContactSet = familyContactSet;
	}

	@Override
	public String toString() {
		return "Contact [title=" + title + ", firstname=" + firstname + ", lastname=" + lastname + ", fullname="
				+ fullname + ", birthDate=" + birthDate + ", email=" + email + ", phoneNumber=" + phoneNumber
				+ ", image=" + Arrays.toString(image) + ", isSubjectToTaxes=" + isSubjectToTaxes + ", Address="
				+ address + ", familyContactSet=" + familyContactSet + "]";
	}

}
