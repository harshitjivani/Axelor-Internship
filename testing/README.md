# Testing Module - Java

This module contains test cases and examples for unit testing in Java using **JUnit**.

---

## 📊 Features
- **JUnit Testing** for Java applications.
- Writing **test cases** for methods.
- Running and analyzing **test results**.
- Understanding **assertions** and test structure.

---

## 🚀 Technologies Used
- **Java (JDK 8+)**
- **JUnit 5**
- **Maven/Gradle**

---

## 🔧 Setup Instructions

### **1. Clone the Repository**
```bash
git clone https://github.com/harshitjivani/Axelor-Internship.git
cd Axelor-Internship/testing
```

### **2. Run Tests**
Using Maven:
```bash
mvn test
```
Using Gradle:
```bash
gradle test
```

---

## 🔍 Example Test Case
### **CalculatorTest.java**
```java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAddition() {
        assertEquals(5, Calculator.add(2, 3));
    }
}
```

---

## 📚 Project Structure
```
/testing
├── src/main/java/com/example/testing
│   ├── Calculator.java
├── src/test/java/com/example/testing
│   ├── CalculatorTest.java
├── pom.xml (if using Maven)
├── build.gradle (if using Gradle)
```

---

## 📝 License
This project is for educational purposes only. Feel free to modify and enhance it as needed.

Happy Testing! 🎯🚀

