package com.dv.contactmodule;

import java.sql.Date;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Country c1 = new Country("india", "1", new ArrayList<>());
		Country c2 = new Country("germany", "2", new ArrayList<>());
		Country c3 = new Country("china", "3", new ArrayList<>());
		Country c4 = new Country("us", "4", new ArrayList<>());

		Title t1 = new Title("city", "1", new HashSet<>());
		Title t2 = new Title("town", "2", new HashSet<>());
		Title t3 = new Title("state", "3", new HashSet<>());
		Title t4 = new Title("villege", "4", new HashSet<>());

		Address a1 = new Address("harshit", "602", "3906", "surat", c1);
		Address a2 = new Address("haj", "6302", "39506", "delhi", c1);
		Address a3 = new Address("harsh", "5602", "39006", "berlin", c2);
		Address a4 = new Address("xyz", "6502", "45642", "ti", c3);
		Address a5 = new Address("meet", "6402", "95006", "texas", c4);

		// Create Contact objects
		Contact co1 = new Contact(t1, "John", "Doe", "John Doe", new Date(0), "john.doe@example.com", "123-456-7890",
				new byte[] {}, true, a1, new HashSet<>());

		Contact co2 = new Contact(t2, "Jane", "Smith", "Jane Smith", new Date(0), "jane.smith@example.com",
				"987-654-3210", new byte[] {}, false, a2, new HashSet<>());

		Contact co3 = new Contact(t3, "Alice", "Brown", "Alice Brown", new Date(0), "alice.brown@example.com",
				"555-123-4567", new byte[] {}, true, a3, new HashSet<>());

		Contact co4 = new Contact(t4, "Bob", "Williams", "Bob Williams", new Date(0), "bob.williams@example.com",
				"777-888-9999", new byte[] {}, false, a4, new HashSet<>());

		Set<Contact> c1Family = new HashSet<>(Arrays.asList(co2, co3, co4));
		co1.setFamilyContactSet(c1Family);

		Set<Contact> c2Family = new HashSet<>(Arrays.asList(co1, co3, co4));
		co2.setFamilyContactSet(c2Family);

		Set<Contact> c3Family = new HashSet<>(Arrays.asList(co1, co2, co4));
		co3.setFamilyContactSet(c3Family);

		Set<Contact> c4Family = new HashSet<>(Arrays.asList(co1, co2, co3));
		co4.setFamilyContactSet(c4Family);

//		List<Address> l1 = new ArrayList<>(Arrays.asList(a2, a3, a4));
		List<Address> l2 = new ArrayList<>(Arrays.asList(a1, a3, a4));
		List<Address> l3 = new ArrayList<>(Arrays.asList(a5, a1, a4));
		List<Address> l4 = new ArrayList<>(Arrays.asList(a5, a3, a1));
		List<Address> l5 = new ArrayList<>(Arrays.asList(a2, a3, a4));

		c1.setAddress(l2);
		c2.setAddress(l3);
		c3.setAddress(l5);
		c4.setAddress(l4);

		t1.setContact(c1Family);
		t2.setContact(c2Family);
		t3.setContact(c3Family);
		t4.setContact(c4Family);

		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(c4);

		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(t4);

		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		session.save(a5);

		session.save(co1);
		session.save(co2);
		session.save(co3);
		session.save(co4);

		session.getTransaction().commit();
		session.close();
		System.out.println("testSaveOperation ends .......");

	}

}