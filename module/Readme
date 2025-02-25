# Contact Module - Hibernate

This module is a **Contact Management System** built using **Hibernate with Annotations**. It demonstrates how to use Hibernate ORM for managing contact information efficiently.

---

## 📊 Features
- Create, Read, Update, and Delete (CRUD) operations for contacts.
- Utilizes **Hibernate ORM** with **JPA Annotations**.
- Implements **One-to-Many** and **Many-to-One** mappings.
- Uses **SessionFactory** for database connection management.
- Includes **DAO Layer** for structured data handling.

---

## 🚀 Technologies Used
- **Java** (JDK 8+)
- **Hibernate ORM**
- **JPA Annotations**
- **PostgreSQL** (or any relational database)
- **Maven** (for dependency management)
- **JUnit** (for unit testing)

---

## 🔧 Setup Instructions

### **1. Clone the Repository**
```bash
git clone https://github.com/harshitjivani/Axelor-Internship.git
cd Axelor-Internship/module/Contact-module
```

### **2. Configure Database**
Update the **hibernate.cfg.xml** file with your database credentials:
```xml
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/contactdb</property>
<property name="hibernate.connection.username">your_username</property>
<property name="hibernate.connection.password">your_password</property>
```

### **3. Run the Application**
- Compile and run using Maven:
```bash
mvn clean install
java -jar target/contact-module.jar
```

---

## 🔍 Entity Class Example
### **Contact.java** (Hibernate Annotation Example)
```java
@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @OneToMany(mappedBy = "contact", cascade = CascadeType.ALL)
    private List<PhoneNumber> phoneNumbers;

    // Getters and Setters
}
```

---

## 📚 Project Structure
```
/module/Contact-module
├── src/main/java/com/example/contact
│   ├── entity/Contact.java
│   ├── entity/PhoneNumber.java
│   ├── dao/ContactDAO.java
│   ├── service/ContactService.java
│   ├── MainApp.java
├── src/test/java/com/example/contact/ContactTest.java
├── hibernate.cfg.xml
├── pom.xml
```

---

## 📝 License
This project is for educational purposes only. Feel free to modify and enhance it as needed.

Happy Coding! 🎯🚀

