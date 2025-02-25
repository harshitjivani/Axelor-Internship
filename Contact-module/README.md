# Contact Module - Axelor Framework

This module is a **Contact Management System** built using the **Axelor Framework**. It leverages Axelor's low-code platform to create, manage, and maintain contact records efficiently.

---

## 📊 Features
- Create, Read, Update, and Delete (CRUD) operations for contacts.
- Utilizes **Axelor Open Platform** for streamlined development.
- Implements **Entity Models** with **Axelor Domain Annotations**.
- Provides a web-based UI using **Axelor View XML**.
- Uses **Axelor Business Logic Services** for data management.

---

## 🚀 Technologies Used
- **Axelor Open Platform**
- **Java (JDK 8+)**
- **PostgreSQL** (or any relational database)
- **Gradle** (for build automation)
- **JUnit** (for unit testing)

---

## 🔧 Setup Instructions

### **1. Clone the Repository**
```bash
git clone https://github.com/harshitjivani/Axelor-Internship.git
cd Axelor-Internship/module/Contact-module
```

### **2. Configure Database**
Update the **application.properties** file with your database credentials:
```properties
axelor.db.uri=jdbc:postgresql://localhost:5432/contactdb
axelor.db.user=your_username
axelor.db.password=your_password
```

### **3. Run the Application**
- Compile and run using Gradle:
```bash
gradle clean build
java -jar build/libs/contact-module.jar
```

---

## 🔍 Entity Class Example
### **Contact.java** (Axelor Domain Example)
```java
@Domain(entity = true)
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Field(required = true)
    private String name;

    @Field(unique = true)
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
│   ├── domain/Contact.java
│   ├── domain/PhoneNumber.java
│   ├── service/ContactService.java
│   ├── web/ContactController.java
│   ├── MainApp.java
├── src/main/resources/views/contact.xml
├── src/test/java/com/example/contact/ContactTest.java
├── application.properties
├── build.gradle
```

---

## 📝 License
This project is for educational purposes only. Feel free to modify and enhance it as needed.

Happy Coding! 🎯🚀

